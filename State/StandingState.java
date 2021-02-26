public class StandingState implements State {

	private Hero hero;
	
	public StandingState(Hero hero) {
		this.hero = hero;
	}
	
	public void downArrowPress() {
		System.out.println(hero.getName() + " is now ducking.");
		hero.setState(hero.getDuckingState());
	}

	public void upArrowPress() {
		System.out.println(hero.getName() + " is now jumping.");
		hero.setState(hero.getJumpingState());
	}

	public void escapePress() {
		if (hero.getCredits() > 0) {
			hero.setCredits(hero.getCredits() - 1);
			System.out.println(hero.getName() + " became shielded.");
			hero.setState(hero.getShieldedState());
		}
	}

	public void downArrowReleased() {
		throw new UnsupportedOperationException();
	}

	public void upArrowReleased() {
		throw new UnsupportedOperationException();
	}

	public void hitByRolledObject() {
		System.out.println(hero.getName() + " was hit by a rolled object and died.");
		hero.setState(hero.getDeadState());
	}

	public void hitByThrownObject() {
		System.out.println(hero.getName() + " was hit by a thrown object and died.");
		hero.setState(hero.getDeadState());
	}

	public void hitByFire() {
		System.out.println(hero.getName() + " was hit by fire and died.");
		hero.setState(hero.getDeadState());
	}

	@Override
	public Hero getHero() {
		return hero.getHero();
	}

}
