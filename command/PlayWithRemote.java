import java.util.ArrayList;
import java.util.List;

class PlayWithRemote {
	public static void main(String[] args){
		ElectronicDevice newDevice = TvRemote.getDevice();

		TurnTvOn onCommand = new TurnTvOn(newDevice);

		DeviceButton onPressed = new DeviceButton(onCommand);

		onPressed.press();

		// Turn tv off 

		TurnTvOff offCommand = new TurnTvOff(newDevice);

		onPressed = new DeviceButton(offCommand);

		onPressed.press();

		// volume

		TurnTvUp upCommand = new TurnTvUp(newDevice);

		onPressed = new DeviceButton(upCommand);

		onPressed.press();
		onPressed.press();
		onPressed.press();

		// turn off devices 

		Television theTv = new Television();
		Radio theRadio = new Radio();

		List<ElectronicDevice> allDevices = new ArrayList<>();
		allDevices.add(theTv);
		allDevices.add(theRadio);

		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();

		// undo 

		turnThemOff.pressUndo();
	}
}






