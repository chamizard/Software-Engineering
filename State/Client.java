public class Client {
    public static void main(String[] args) {
        Hero hero = new Hero("Johnson");
        //Hero Ducking
        hero.downArrowPress();
        //Hero Standing
        hero.downArrowReleased();
        //Hero Jumping and be hit by a rolled object
        hero.upArrowPress();
        hero.hitByRolledObject();
        //Hero Standing
        hero.upArrowReleased();
        //Hero Diving and get hit with a fire object
        hero.upArrowPress();
        hero.downArrowPress();
        hero.hitByFire();
        //Hero Standing
        hero.upArrowReleased();
        hero.downArrowReleased();
        //Hero becoming Shielded
        hero.escapePress();
        //Hero getting hit with fire and dying
        hero.hitByFire();
    }
}
