package day01.basic;

/*
 * [[ �⺻ �ڷ��� ]]
 * 2. ������(char)
 *  - �����ϴ� ���
 *  	char ������;
 *  ������ �ִ� ���� : 0 ~ 65535
 *  ���� �� 65536 ������ ���ڸ� ǥ���� �� �ִ�.
 *  �� ���迡�� ���̴� ���� ���¸� ��κ� �� ǥ�� ����. 
 *  
 * 
 */

public class MainClass02 {
	
	public static void main(String[] args) {
		// char �� ���� ����� ���ÿ� �� �����ϱ�
		char ch1 = 'A';
		// ����غ���
		System.out.println("char �� ������ ����� ����:" + ch1);
		char ch2 = '��';
		char ch3 = '��';
		
		int num = ch1; // char ���� int ������ ����ȯ
		System.out.println("�빮�� A�� �ش��ϴ� �����ڵ� :" + num);
		
		int num2 = 110;
		char ch4 = (char)num2; // int ���� char ������ ���� ����ȯ
		System.out.println(ch4);
	}
	
}
	
	
	
