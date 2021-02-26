public interface State {

	public void downArrowPress();
	
	public void downArrowReleased();
	
	public void upArrowPress();
	
	public void upArrowReleased();
	
	public void escapePress();
	
	public void hitByRolledObject();
	
	public void hitByThrownObject();
	
	public void hitByFire();

	public Hero getHero();
}
