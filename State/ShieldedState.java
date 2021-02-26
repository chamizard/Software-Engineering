import java.util.concurrent.TimeUnit;

public class ShieldedState implements State, Runnable {
    private Hero hero;
    private Thread thread;

    public ShieldedState(Hero hero) {
        this.hero = hero;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void downArrowPress() {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    @Override
    public void escapePress() {
        System.out.println(hero.getName() + " is already shielded.");
    }

    @Override
    public void hitByRolledObject() {
        System.out.println(hero.getName() + " was hit by a rolled object but was shielded.");
    }

    @Override
    public void hitByThrownObject() {
        System.out.println(hero.getName() + " was hit by a thrown object but was shielded.");
    }

    @Override
    public void hitByFire() {
        System.out.println(hero.getName() + " was hit by fire but was shielded.");
    }

    @Override
    public Hero getHero() {
        return hero.getHero();
    }

    @Override
    public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(hero.getName() + " became unshielded.");
                hero.setState(hero.getStandingState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
