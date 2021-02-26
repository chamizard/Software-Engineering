public class HottubDecrementTemperature implements Command {
	Hottub hottub;

	public HottubDecrementTemperature(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.decrementTemperature();
	}
}
