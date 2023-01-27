import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Animal animal;
	
		System.out.println("Enter a number: ");
		int num = k.nextInt();
	
		if (num % 2 == 0) {
			animal = new Dog();
		} else {
			animal = new Cat();
		}
	
		animal.wake();
		animal.eat();
		animal.sleep();
	}
}
