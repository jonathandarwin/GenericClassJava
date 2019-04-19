public class Main{
	public static void main(String[] args){
		Animal<Lion> lion = new Animal<Lion>();
		Animal<Dog> dog = new Animal<Dog>();

		lion.setAnimal(new Lion());
		dog.setAnimal(new Dog());

		System.out.println(lion.getAnimal().roar());
		System.out.println(dog.getAnimal().roar());
		System.out.println(dog.getAnimal().play());
	}
}