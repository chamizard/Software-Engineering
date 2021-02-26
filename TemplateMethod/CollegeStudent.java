public abstract class CollegeStudent {
    private String description;
    private String wakeUpTime;
    private double sleepHours;

    public CollegeStudent(String description, String wakeUpTime, double sleepHours) {
        this.description = description;
        this.wakeUpTime = wakeUpTime;
        this.sleepHours = sleepHours;
    }

    public final void dailyRoutine() {
        System.out.println(description);
        getUp();
        eatBreakfast("Bagel");
        travelToApp(15);
        attendClasses(3);
        returnHome(15);
        work(3);
        relax(3);
        sleep();
    }

    public final void getUp() {
        System.out.println("Getting up at " + wakeUpTime + ".");
    }

    public void eatBreakfast(String food) {
        System.out.println("Eating a " + food + ".");
    }

    public void travelToApp(double duration) {
        System.out.println("Traveling to App. Arriving in " + duration + " minutes.");
    }

    public abstract void attendClasses(double duration);

    public void returnHome(double duration) {
        System.out.println("Traveling home. Arriving in " + duration + " minutes.");
    }

    public void work(double duration) {
        System.out.println("Working for " + duration + " hours.");
    }

    public void relax(double duration) {
        System.out.println("Relaxing for " + duration + " hours.");
    }
    public final void sleep() {
        System.out.println("Going to sleep for " + sleepHours + " hours.");
    }
}
