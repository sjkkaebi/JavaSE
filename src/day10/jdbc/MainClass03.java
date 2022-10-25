package day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null; //set 해서 값을 동적 변수로 주면, 바인드변수로 인식을 해서 커리가 변함 없이 메모리에 있으면 그대로 가져옴.
		// Statement 보다 성능이 좋다!! 무조건 사용!! 같은 쿼리문.
		ResultSet rs = null;

		try {//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결하기
			//jdbc:mysql://호스트URL:포트/데이터베이스명"
			String url = "jdbc:mysql://172.16.12.101:3306/hr";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT EMPNO, ENAME ");
			sql.append("FROM emp "); //같은 메모리 내에서 움직이려고. String 객체는 메모리를 각자 다른 걸 참조해서 추가되면 전에 꺼가 삭제되니까 비효율적.
			sql.append("WHERE DEPTNO = ?");
			
			// 3. PrepareStatement 객체 생성
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, 20); // 첫번째 물음표에 20인 값을 넣겠다.
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				System.out.printf("%d, %s, %n", empno, ename);
			}
					
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}

}
