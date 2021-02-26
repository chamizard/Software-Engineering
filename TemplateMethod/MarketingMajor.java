public class MarketingMajor extends CollegeStudent{

    public MarketingMajor(String description, String wakeUpTime, double sleepHours) {
        super(description, wakeUpTime, sleepHours);
    }

    @Override
    public void attendClasses(double duration) {
        System.out.println("Attending Marketing classes for " + duration + " hours.");
    }
}
