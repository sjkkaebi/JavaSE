package day07.accessmodifier.mypac;

public class Phone {
	public static String name = "일반유선전화기";
	
	private void call() {
		System.out.println(name+ " 전화하기");
		
		
	}

	public static String getName() { //값을 가져오겠다
		return name;
	}

	public static void setName(String name) { //값을 입력
		
		Phone.name = name;
	}

}
//private-getter setter: 캡슐화