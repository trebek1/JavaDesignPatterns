// The Invoker DeviceButton knows nothing 
// about the device or command being executed

class DeviceButton {
	Command theCommand;

	public DeviceButton(Command newCommand){
		theCommand = newCommand;
	}

	public void press(){
		theCommand.execute();
	}

	public void pressUndo(){
		theCommand.undo();
	}


}