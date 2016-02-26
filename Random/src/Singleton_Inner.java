class Logger{
	
	private Logger(){};

	private static Logger getMyInstance{
		if(myInstance == null){
			myInstance = new Logger();
		}

		retun myInstance;
	}

	public static class LoggerInner{
		public static Logger logger= new Logger();
	}
	
	public static Logger getInstance{
		return LoggerInner.logger;
	}
	//private static synchronized Logger myInstance; // For MultiThreading Scenario

	public void log(String s){
		System.err.println(s);
	}
}