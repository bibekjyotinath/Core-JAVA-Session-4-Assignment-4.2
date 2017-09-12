package Animals; //Package Animal

class Animal {           //Class created animal
	protected String colour;    //String variable created
	protected int legs;		//integer variable created
	public void AnimalDetails() {      //AnimalDetails method created
		System.out.println("Animal Color: " +colour+ " it has " +legs+ " legs.");     //Display of Message
	}
	public void setColor(String color) {   //Setting color of the animal
		this.colour = color;     //assigning value of color to colour
	}
	public void setLegs(int leg) {    //Setting the integer of the animal 
		this.legs = leg;				//assigning the value of leg to legs
	}
}	

