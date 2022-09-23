package day03.var;

public class MainClass02 {
 static String str1 = "전역변수"; //static 선언해야 메모리에 올라감.
 
 public static void local() {
	  String str2 = "지역변수";
  }	  

 public static void main(String[] args) {
		System.out.println(str1);
//		System.out.println(str2); 에러!! 다른 메소드 지역변수 사용할 수 없음
	
 }
}
