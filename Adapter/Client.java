
/**
 * The Client Class uses the legacy MyCanvas class.
 * 
 * @author Dr. Ray Russell 
 * @version 0.1
 */

//Cameron Mann
public class Client
{
    static public void main(String[] args) {
        //MyCanvas canvas = new MyOldCanvas();
        MyNewCanvas newCanvas = new MyNewCanvas();
        MyCanvasAdapter myCanvasAdapter = new MyCanvasAdapter(newCanvas);

        myCanvasAdapter.clear();
        myCanvasAdapter.setLineColor(37);
        myCanvasAdapter.drawSquare(20, 40, 50);
        myCanvasAdapter.drawRectangle(15, 35, 18, 36);
        myCanvasAdapter.setFillColor(99);
        myCanvasAdapter.drawRightTriangle(88, 52, 20, -10);
        myCanvasAdapter.drawTriangle(new int[] {10, 20, 30}, new int[] {0, 40, 0});
        myCanvasAdapter.drawLine(50, 70, 10, 49);
    }
}
