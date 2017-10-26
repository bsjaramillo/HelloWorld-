public class HelloWorld {
	public static void main (String[] args){
		System.out.println ("Hola Mundo");
	Chicken chicken;
	chicken=new Chicken ();
	chicken.initializeData("Brown",2);
	chicken.addName("Lucy");
	chicken.print ();
	chicken.layAnEgg();
	chicken.poop();
	chicken.drink();
	
	Chicken ginger;
	ginger=new Chicken();
	ginger.addName("Ginger");
	ginger.layAnEgg();
	
	Chicken anastasia;
	anastasia=new Chicken();
	anastasia.addName("Anastasia");
	anastasia.drink();
	
	Chicken Mary;
	Mary=new Chicken();
	Mary.addName("Mary");
	Mary.poop();
	}
}