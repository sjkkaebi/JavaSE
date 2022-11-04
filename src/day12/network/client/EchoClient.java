package day12.network.client;

import java.io.IOException;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		
		try {
			
			InetAddress ia = InetAddress.getLocalHost();
	//		System.out.println(ia);
			
			// 3. Localhost, 3000번 port 번호로 접속 시도한다.
			socket = new Socket(ia.getHostAddress(), 3000); // 채팅 보내고 싶은 ip입력하면 됨. 
															// 예시는 내 컴퓨터로 보내는 거니까 함수로.
			
			// 4. Socket을 이용하여 바이트 출력 스트림 객체 생성한다.
			out = socket.getOutputStream();
			
			// 5. getByte() 메서드는 문자열을 byte[]로 바꿔준다.
			out.write("Hello Socket..!".getBytes());
			
			// 7. Socket을 이용하여 바이트 입력 스트림 객체 생성 
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			// 9. 서버에서 보내온 데이터를 읽어서 b에 저장함.
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			if(in!=null)in.close();
			if(out!=null)out.close();
			if(socket!=null)socket.close();
			
		}
	}

}
