import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
	public static void main(String args[]) throws IOException{
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Type of plan :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		
		System.out.println("Number of Units : ");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("BILL Name : " + planName);
		p.getRate();
		p.calculateBill(units);

	}
}
