//Cameron Mann
public class Client
{
    public static void main(String[] args)
    {
        Directions d1, d2, d3;
        d1 = new Directions();
        d2 = new Directions();
        d3 = new Directions();

        System.out.println("Drawing for the first time: \n");
        
        d1.performDraw();
        d2.performDraw();
        d3.performDraw();

        System.out.println("\nTwo of the direction types have now changed. \n");
        
        d2.changeStrategy(new Walking());
        d3.changeStrategy(new MassTransit());
        
        System.out.println("Drawing for the second time: \n");
        
        d1.performDraw();
        d2.performDraw();
        d3.performDraw();
    }
}
