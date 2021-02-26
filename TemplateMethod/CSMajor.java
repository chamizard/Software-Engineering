public class CSMajor extends CollegeStudent{

    public CSMajor(String description, String wakeUpTime, double sleepHours) {
        super(description, wakeUpTime, sleepHours);
    }

    @Override
    public void attendClasses(double duration) {
        System.out.println("Attending CS classes for " + duration + " hours.");
    }
}
