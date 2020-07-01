package courseTask;
public class Run {

	public static void main(String[] args) {

		Horse myHorse = new Horse("mine");
		Horse yourHorse = new Horse("yours");
		
		HorseStateObserver myHorseObserver = new HorseStateObserver("Pesho");
		HorseStateObserver yourHorseObserver = new HorseStateObserver("Kiro");
		
		myHorse.addObserver(myHorseObserver);
		myHorse.addObserver(yourHorseObserver);
		yourHorse.addObserver(yourHorseObserver);
		
		myHorse.eat();
		
		yourHorse.eat();
		
		 
	}

}
