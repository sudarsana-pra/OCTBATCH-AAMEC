package project.Inheritance;
//Hierarchical Inheritance
//CHILD 1

public class WildAnimals extends Animals{
	public void tiger() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is a wild animal");

	}
	public void lion() {
		// TODO Auto-generated method stub
		System.out.println("Lion is a wild animal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildAnimals wildObj= new WildAnimals();
		wildObj.animalMethod();
		wildObj.wildAnimals();
		wildObj.lion();
		wildObj.tiger();
		}
}
