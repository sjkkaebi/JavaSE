package day05.interfaceEx.mypac;

public interface Weapon {
	static String NAME= "Ak-47";
	
	public void attack(); //추상메소드만 있어서 {}구현이 안됨. 상속받아서 써야됨.
	public void attackSky();
	
	

}
