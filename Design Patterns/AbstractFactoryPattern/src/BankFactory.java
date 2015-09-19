
public class BankFactory extends AbstractFactory{

	public Bank getBank(String Bank) {
		// 
		if (Bank == null){
			return null;
		}
		if (Bank.equalsIgnoreCase("HDFC")){
			return new HDFC();
		}
		else if (Bank.equalsIgnoreCase("SBI")){
			return new SBI();
		}
		else if (Bank.equalsIgnoreCase("ICICI")){
			return new ICICI();
		}
		else 
			return null;
	}

	public Loan getLoan(String Loan) {
		// TODO Auto-generated method stub
		return null;	
	}

}
