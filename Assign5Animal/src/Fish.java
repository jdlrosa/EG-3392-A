/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 Fish
 */
public class Fish extends Animal{
	
	public Fish(String name, String breed, int age){
		super(name, breed, age);
	}
	
	public String makeNoise(){
		return "Glub";
	}
	
	public String makeFood(){
		return "Fish Flakes";	
	}

}
