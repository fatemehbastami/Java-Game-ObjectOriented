
public class Player2 extends Player1{
	
	private int health;
	private boolean shield;
	
	//constructor
	public Player2(String name, String weapon, int health) {
		super(name, weapon, health);
		this.health = health;
		this.shield = shield;
	}
	
	@Override
	public void damageByGun1() {
		if(shield) {
			this.health -= 10;
			if(this.health <= 0) this.health = 0;
			System.out.println("Shield is on! Got it by gun1. Health is reduce by 10. New health is: " + this.health);
		} if (!shield) {
			this.health -= 30;
			if(this.health <= 0) this.health = 0;
			System.out.println("Shield is off! Got it by gun1. Health is reduce by 30. New health is: " + this.health);
		}
	}

	@Override
	public void damageByGun2() {
		
	}
	
	
	

}
