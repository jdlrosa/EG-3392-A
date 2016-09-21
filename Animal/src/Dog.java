//OK

/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 4 Dog
 */
public class Dog extends Animal{
	
	public Dog(String name, String breed, int age){
		super(name, breed, age);
	}
	
	public String makeNoise(){
		return "Woof";
	}
	
	public String makeToy(){
		return "Ball";	
	}

}
