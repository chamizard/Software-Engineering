public class ByCar implements TravelStrategy
{

    @Override
    public void drawMap()
    {
        System.out.println("Map for travelling by car.");
    }

    @Override
    public void findRoute()
    {
        System.out.println("Finding the route for travelling by car.");
    }

    @Override
    public void computeTimeEstimate()
    {
        System.out.println("Estimating the time for travelling by car.");
    }

    @Override
    public void computeEnergySavings()
    {
        System.out.println("No Savings.");
    }

}
