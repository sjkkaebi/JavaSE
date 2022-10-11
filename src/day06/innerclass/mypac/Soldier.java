package day06.innerclass.mypac;

public class Soldier {
	
	private Weapon w; //자기자신한테만 접근할 수 있음. 접근제어자
	
	public Soldier(Weapon w) {
		this.w = w;
		this.w.attack();
	}

}
