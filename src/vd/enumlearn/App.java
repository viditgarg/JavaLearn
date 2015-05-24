package vd.enumlearn;

public class App {

	public static void main(String[] args) {
		
		Animal animal = Animal.TIGER;
		
		switch(animal){
		case CAT:
			System.out.println("cat says meon");
			break;
		case DOG:
			System.out.println("Dog says bho-bho");
			break;
		case TIGER:
			System.out.println("Tiger says roar");
			break;
		default:
			break;
		
		}

	}

}
