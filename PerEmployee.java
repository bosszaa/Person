public class PerEmployee extends Employee{
		private int Salary;
		
		public PerEmployee(String name,int age,String employeeId,int Salary){
			super(name,age,employeeId);
			this.Salary = Salary;
		}
		public int getSalary(){
			return this.Salary;
		}
		public void setSalary(int Salary){
			this.Salary = Salary;
            printDetails();
		}
		public void printDetails(){
			super.printDetails();
				System.out.println("Salary: "+ this.Salary);
		}

	} 

