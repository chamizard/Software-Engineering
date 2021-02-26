public class Hero {
	
	private String name;
	private int credits = 2;
	private State standingState;
	private State divingState;
	private State duckingState;
	private State jumpingState;
	private State shieldedState;
	private State deadState;
	
	private State state;

	public Hero(String name) {
		this.name = name;
		standingState = new StandingState(this);
		divingState = new DivingState(this);
		duckingState = new DuckingState(this);
		jumpingState = new JumpingState(this);
		shieldedState = new ShieldedState(this);
		deadState = new DeadState(this);
		
		state = standingState;
	}

	public void downArrowPress() {
		state.downArrowPress();
	}

	public void downArrowReleased() {
		state.downArrowReleased();
	}

	public void upArrowPress() {
		state.upArrowPress();
	}

	public void upArrowReleased() {
		state.upArrowReleased();
	}

	public void escapePress() {
		state.escapePress();
	}

	public void hitByRolledObject() {
		state.hitByRolledObject();
	}

	public void hitByThrownObject() {
		state.hitByThrownObject();
	}

	public void hitByFire() {
		state.hitByFire();
	}

	public Hero getHero() { return this; }

	public int getCredits() { return credits; }

	public void setCredits(int credits) { this.credits = credits; }

	public String getName() {
		return name;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public State getStandingState() {
		return standingState;
	}
	
	public State getDivingState() {
		return divingState;
	}
	
	public State getDuckingState() {
		return duckingState;
	}
	
	public State getJumpingState() {
		return jumpingState;
	}
	
	public State getShieldedState() {
		return shieldedState;
	}
	
	public State getDeadState() {
		return deadState;
	}
}
