public class DeadState implements State {
	private Hero hero;

	public DeadState(Hero hero) { this.hero = hero; }

	@Override
	public void downArrowPress() {
		System.out.println(hero.getName() + " can't do anything they are dead.");
	}

	@Override
	public void downArrowReleased() {
		System.out.println(hero.getName() + " can't do anything they are dead.");
	}

	@Override
	public void upArrowPress() {
		System.out.println(hero.getName() + " can't do anything they are dead.");
	}

	@Override
	public void upArrowReleased() {
		System.out.println(hero.getName() + " can't do anything they are dead.");
	}

	@Override
	public void escapePress() {
		System.out.println(hero.getName() + " can't do anything they are dead.");
	}

	@Override
	public void hitByRolledObject() {
		System.out.println(hero.getName() + " was hit by a rolled object but is already dead.");
	}

	@Override
	public void hitByThrownObject() {
		System.out.println(hero.getName() + " was hit by a thrown object but is already dead.");
	}

	@Override
	public void hitByFire() {
		System.out.println(hero.getName() + " was hit by fire but is already dead.");
	}

	@Override
	public Hero getHero() {
		return hero.getHero();
	}

}
