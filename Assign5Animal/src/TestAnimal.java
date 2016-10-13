/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 TestAnimal
 */
public class TestAnimal {
	public static void main(String[] args) {
		
		Animal[] array = new Animal[2];
		
		Animal A = new Fish("Goldy", "Goldfish", 1);
		array[0] = A;
		
		Animal B = new Horse("Ace", "Mustang", 2);
		array[1] = B;
		
		for(Animal Animalobj : array){
			System.out.println(Animalobj.getClass().getName() 
			+ "\nName: " + Animalobj.getName() 
			+ "\nBreed: " + Animalobj.getBreed() 
			+ "\nAge: " + Animalobj.getAge() 
			+ "\nNoise: " + Animalobj.makeNoise()
			+ "\nFavorite Toy: " + Animalobj.makeFood());
		}

	}

}
