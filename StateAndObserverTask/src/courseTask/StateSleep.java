package courseTask;

public class StateSleep extends State {

	@Override
	public void handleEat(Animal a) {
		a.setState(new StateEat());
	}

	@Override
	public void handleSleep(Animal a) {
		a.setState(new StateSleep());
	}

	@Override
	public void handleIdle(Animal a) {
		a.setState(new StateIdle());
	}

	@Override
	public States getState() {
		return States.SLEEP;
	}

}
