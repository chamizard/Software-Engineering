public class DivingState implements State {

	private Hero hero;
	
	public DivingState(Hero hero) {
		this.hero = hero;
	}
	
	@Override
	public void downArrowPress() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void downArrowReleased() {
		System.out.println(hero.getName() + " is now jumping.");
		hero.setState(hero.getJumpingState());
	}

	@Override
	public void upArrowPress() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void upArrowReleased() {
		System.out.println(hero.getName() + " is now ducking.");
		hero.setState(hero.getDuckingState());
	}

	@Override
	public void escapePress() {
		if (hero.getCredits() > 0) {
			hero.setCredits(hero.getCredits() - 1);
			System.out.println(hero.getName() + " became shielded.");
			hero.setState(hero.getShieldedState());
		}
	}

	@Override
	public void hitByRolledObject() {
		System.out.println(hero.getName() + " was hit by a rolled object and died.");
		hero.setState(hero.getDeadState());
	}

	@Override
	public void hitByThrownObject() {
		System.out.println(hero.getName() + " dodged a thrown object.");
	}

	@Override
	public void hitByFire() {
		System.out.println(hero.getName() + " dodged some fire.");
	}

	@Override
	public Hero getHero() {
		return hero.getHero();
	}

}
