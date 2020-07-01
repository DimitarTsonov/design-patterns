package courseTask;

public class Cow implements Animal
{
	 
	private State state;	

	public Cow(final State state)
	{
		this.state = state;
	}
	
	public Cow()
	{
		 state = new StateIdle();
	}
	
	public void setState(final State state)
	{
		this.state = state;
	}
	
	public State getState()
	{
		return state;
	}
	
	public void eat()
	{
		state.handleEat(this);
	}
	
	public void sleep()
	{
		state.handleSleep(this);
	}
	
	public void idle()
	{
		state.handleIdle(this);
	}
	
}
