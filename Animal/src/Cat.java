/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 4 Cat
 */
public class Cat extends Animal{
	
	public Cat(String name, String breed, int age){
		super(name, breed, age);
	}
	
	public String makeNoise(){
		return "Meow";
	}
	
	public String makeToy(){
		return "Mouse toy";	
	}

}
