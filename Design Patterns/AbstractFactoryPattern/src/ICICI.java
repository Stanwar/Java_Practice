
public class ICICI implements Bank{
	private final String BNAME;
	
	public ICICI(){
		BNAME = "ICICI Bank";
	}
	
	public String getBankName(){
		return BNAME;
	}
}
