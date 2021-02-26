public class Walking implements TravelStrategy
{

    @Override
    public void drawMap()
    {
        System.out.println("Map for travelling by walking.");
    }

    @Override
    public void findRoute()
    {
        System.out.println("Finding the route for travelling by walking.");
    }

    @Override
    public void computeTimeEstimate()
    {
        System.out.println("Estimating the time for travelling by walking.");
    }

    @Override
    public void computeEnergySavings()
    {
        System.out.println("Best Savings.");
    }

}
