/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 4 TestAnimal
 */
public class TestAnimal {
	public static void main(String[] args) {
		
		Animal[] array = new Animal[2];
		
		Animal A = new Dog("Gizmo", "Pug", 1);
		array[0] = A;
		
		Animal B = new Cat("Happy", "American Shorthair", 1);
		array[1] = B;
		
		for(Animal Animalobj : array){
			System.out.println(Animalobj.getClass().getName() 
			+ "\nName: " + Animalobj.getName() 
			+ "\nBreed: " + Animalobj.getBreed() 
			+ "\nAge: " + Animalobj.getAge() 
			+ "\nNoise: " + Animalobj.makeNoise()
			+ "\nFavorite Toy: " + Animalobj.makeToy());
		}

	}

}
