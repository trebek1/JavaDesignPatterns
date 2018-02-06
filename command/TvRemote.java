// use television object as receiver to handle 
// everything 

class TvRemote{

	public static ElectronicDevice getDevice(){
		return new Television();
	}

}