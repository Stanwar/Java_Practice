class Logger{
	
	private Logger(){};

	private static Logger getMyInstance{
		if(myInstance == null){
			myInstance = new Logger();
		}

		retun myInstance;
	}

	private static synchronized Logger myInstance; // For MultiThreading Scenario

	public void log(String s){
		System.err.println(s);
	}
}