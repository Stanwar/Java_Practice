import java.util.ArrayList;


public class EmployeeSorter{
	
	public static void main(String[] args){
		EmployeeSorter es = new EmployeeSorter();
		ArrayList<Employee> ary = new ArrayList<Employee>();
		Employee em1 = new Employee(123,"Sharad", "Tanwar","sharad_tanwar@outlook.com");
		ary.add(em1);
		Employee em2 = new Employee(333,"Maxx", "X","maxx@outlook.com");
		ary.add(em2);
		Employee em3 = new Employee(24,"Shabby", "Khan","shabby@outlook.com");
		ary.add(em3);
		Employee em4 = new Employee(2,"Imari", "Garza","imari@outlook.com");
		ary.add(em4);
		Employee em5 = new Employee(5,"Itzel", "Garza","itzel@outlook.com");
		ary.add(em5);
		Employee em6 = new Employee(88,"Ari", "Garza","ari@outlook.com");
		ary.add(em6);
		Employee em7 = new Employee(44,"Dani", "Garza","dani@outlook.com");
		ary.add(em7);
		Employee em8 = new Employee(33,"Ana", "S","ana@outlook.com");
		ary.add(em8);
		Employee em9 = new Employee(22,"Prateeko", "Horny","horny@outlook.com");
		ary.add(em9);
		Employee em10 = new Employee(11,"Abhinav", "Kumar","abhinav@outlook.com");
		ary.add(em10);
		
		System.out.println("Number of employees : " + ary.size());
		es.Sort(ary);
		
	}
	
	public void Sort(ArrayList<Employee> ary){
		for (Employee e : ary){
			System.out.println(e.employeeNumber);
		}
	}
}
