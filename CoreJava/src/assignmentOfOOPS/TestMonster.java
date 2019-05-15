package assignmentOfOOPS;

public class TestMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FireMonster f1 = new FireMonster("r2u2");
		
		Monster m1 = new FireMonster("r2u2");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
		
		f1 = (FireMonster) m1;// Casting needed - this is downcasting
		m1 = f1; // upcasting
		
		System.out.println(m1.attack());//Run Firemonster's attack
		System.out.println(m2.attack());//Run Watermonster's attack
		System.out.println(m3.attack());//Run Stonemonster's attack
		
		m1 = new StoneMonster("a2b2");
		System.out.println(m1.attack());//Run stonemonster's attack
		
		
			Monster m4 = new Monster("u2u2");
			System.out.println(m4.attack());//garbage
		
		

	}

}
