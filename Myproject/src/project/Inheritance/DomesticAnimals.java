package project.Inheritance;
//Hierarchical Inheritance
//CHILD 2

public class DomesticAnimals extends Animals {
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("Dog Barks");
		}
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("Cat Meows");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomesticAnimals domesticObj= new DomesticAnimals();
		domesticObj.animalMethod();
		domesticObj.domesticAnimals();
		domesticObj.cat();
		domesticObj.dog();
		}
}
