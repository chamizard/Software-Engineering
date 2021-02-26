public class MassTransit implements TravelStrategy
{

    @Override
    public void drawMap()
    {
        System.out.println("Map for travelling by mass transit.");
    }

    @Override
    public void findRoute()
    {
        System.out.println("Finding the route for travelling by mass transit.");
    }

    @Override
    public void computeTimeEstimate()
    {
        System.out.println("Estimating the time for travelling by mass transit.");
    }
    
    @Override
    public void computeEnergySavings()
    {
        System.out.println("Some Savings.");
    }

}
