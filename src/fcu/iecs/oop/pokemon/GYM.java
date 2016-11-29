package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	
	
	public static void fight(Pokemon p1, Pokemon p2){
		
		Random rand = new Random();
		int  n = rand.nextInt(2) + 1;
		
		if(n==1){
			System.out.println("Winner is:"+p1.Name());
			p1.cp=p1.cp+500;
			System.out.print("CP:"+p1.cp);
		}
			
		else{
			System.out.println("Winner is:"+p2.Name());
			p2.cp=p2.cp+500;
			System.out.print("CP:"+p2.cp);
		}
			
		
	}

}
