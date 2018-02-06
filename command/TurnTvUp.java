public class TurnTvUp implements Command{
	
	ElectronicDevice theDevice;

	public TurnTvUp(ElectronicDevice newDevice){
		theDevice = newDevice;
	}

	@Override 
	public void execute(){
		theDevice.volumeUp();
	}

	@Override
	public void undo(){
		theDevice.volumeDown();
	}
}
