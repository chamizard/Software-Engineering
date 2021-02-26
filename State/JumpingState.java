public class JumpingState implements State {
    private Hero hero;

    public JumpingState(Hero hero) { this.hero = hero; }

    @Override
    public void downArrowPress() {
        System.out.println(hero.getName() + " is now diving.");
        hero.setState(hero.getDivingState());
    }

    @Override
    public void downArrowReleased() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void upArrowPress() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void upArrowReleased() {
        System.out.println(hero.getName() + " is now standing.");
        hero.setState(hero.getStandingState());
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
        System.out.println(hero.getName() + " dodged a rolled object.");
    }

    @Override
    public void hitByThrownObject() {
        System.out.println(hero.getName() + " was hit by a thrown object and died.");
        hero.setState(hero.getDeadState());
    }

    @Override
    public void hitByFire() {
        System.out.println(hero.getName() + " was hit by fire and died.");
        hero.setState(hero.getDeadState());
    }

    @Override
    public Hero getHero() {
        return hero.getHero();
    }
}
