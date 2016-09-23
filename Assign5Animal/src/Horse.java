
/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 Horse
 */
public class Horse extends Animal{
	
	public Horse(String name, String breed, int age){
		super(name, breed, age);
	}
	
	public String makeNoise(){
		return "Neigh";
	}
	
	public String makeFood(){
		return "Hay";	
	}

}
