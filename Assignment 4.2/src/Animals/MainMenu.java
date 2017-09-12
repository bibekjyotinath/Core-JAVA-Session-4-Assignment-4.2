package Animals;

public class MainMenu {    //main class 

	public static void main(String[] args) {   //main method of the class
		
		AnimalDog myAnimal = new AnimalDog();    //creating the object of Animal class 
		myAnimal.setColor("Brown");		//passing parameter to method setColor of Animal Class
		myAnimal.setLegs(4);				//passing paramter to method setLegs of Animal Class
		myAnimal.AnimalDetails();		//Calling of AnimalDetail Method of Animal Class
		myAnimal.Dog();			//calling the method Dog of class Animal
	}

}
