package Animals;

/*IS-A Relationship*/
public class AnimalDog extends Animal{
  
	public void Dog() {    //Character class created
		DogCharacteristics dc = new DogCharacteristics();   //creating an object of DogCharacteristics class 
		dc.Start();		//calling the method of DogCharacteristics class Start
		dc.Stop();		//calling the method of DogCharacteristics class Stop
	}
}
