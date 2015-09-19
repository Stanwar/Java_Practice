
public class LoanFactory extends AbstractFactory{


	public Bank getBank(String Bank) {
		// TODO Auto-generated method stub
		return null;
	}

	public Loan getLoan(String Loan) {
		// TODO Auto-generated method stub
		if (Loan == null){
			return null;			
		}
		
		if (Loan.equalsIgnoreCase("Business")){
			return new BusinessLoan();
		}
		else if (Loan.equalsIgnoreCase("Education")){
			return new EducationLoan();
		}
		else if (Loan.equalsIgnoreCase("Home")){
			return new HomeLoan();
		}
		else return null;

	}

}
