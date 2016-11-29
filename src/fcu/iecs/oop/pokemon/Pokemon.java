package fcu.iecs.oop.pokemon;

public class Pokemon {

	private String name;
	public int cp;
	
	public Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}
	
	public String Name(){
		return name;
	}
	public int CP1(){
		return cp;
	}
	
	public void CP2(){
		System.out.println("CP:"+this.cp);
	}

}
