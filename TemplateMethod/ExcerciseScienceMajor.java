public class ExcerciseScienceMajor extends CollegeStudent{

    public ExcerciseScienceMajor(String description, String wakeUpTime, double sleepHours) {
        super(description, wakeUpTime, sleepHours);
    }

    @Override
    public void attendClasses(double duration) {
        System.out.println("Attending Exercise Science classes for " + duration + " hours.");
    }
}
