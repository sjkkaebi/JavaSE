package day08.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 폴더명 : resources
 * 
 *
 */
public class MainClass02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// test1.txt 파일을 읽기 위한 객체(FileInputStream)
			fis = new FileInputStream("./resources/test1.txt");
			
			// FileOutputStream 객체 생성시 매개변수는 반드시 경로가 존재해야 함.
			// 또한 경로가 존재하면 객체 생성시 test2.txt 파일도 만들어짐
			fos = new FileOutputStream("./resources/test2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[3];
			
			//fis.read(b) => b길이만큼 읽어서 반환
			//readByteCnt 에 저장			
			while((readByteCnt = fis.read(b))!= -1) {
				fos.write(b,0,readByteCnt);
			}
					
		} catch (IOException e) {
		
			System.out.println("IOException 발생!");
			
		} finally {
			
				try {
					if(fis != null) {
					fis.close();
					}
					if(fos != null) {
						fos.close();
						}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		System.out.println("실행완료!");
			
		}
		
	}


