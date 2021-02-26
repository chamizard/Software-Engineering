import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Observable;

public class ArchiveDisplay implements Observer, DisplayElement
{
    private ArrayList<Float> tempList;
	private Observable observable;
	
	public ArchiveDisplay(Observable observable)
	{
	    this.observable = observable;
		observable.addObserver(this);
		tempList = new ArrayList<Float>();
	}
	
	public void update(Observable observable, Object arg)
	{
	    if (observable instanceof WeatherData)
		{
		    WeatherData weatherData = (WeatherData) observable;
			tempList.add(weatherData.getTemperature());
		}
	}
	
	public void display()
	{
		System.out.println("Temperatures");
		for ( float i : tempList)
		{
			System.out.println(i);
		}
	}
}