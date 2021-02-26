public class Directions
{
    private TravelStrategy travelStrategy;
    
    public Directions()
    {
        this.travelStrategy = new ByCar();
    }
    
    public void changeStrategy(TravelStrategy travel)
    {
        travelStrategy = travel;
    }
    
    public void performDraw()
    {
        travelStrategy.drawMap();
        travelStrategy.computeEnergySavings();
    }
    
    public void performFindRoute()
    {
        travelStrategy.findRoute();
    }
    
    public void performComputeTimeEstimate()
    {
        travelStrategy.computeTimeEstimate();
    }
}
