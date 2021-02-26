public class Client {

    public static void main(String[] args) {
        MarketingMajor Billy = new MarketingMajor("Marketing Major Billy", "6 am", 9.5);
        CSMajor John = new CSMajor("CS Major John", "8 am", 10);
        ExcerciseScienceMajor Leonard = new ExcerciseScienceMajor("Exercise Science Major Leonard", "7 am", 8);

        Billy.dailyRoutine();
        System.out.println();
        John.dailyRoutine();
        System.out.println();
        Leonard.dailyRoutine();
    }
}
