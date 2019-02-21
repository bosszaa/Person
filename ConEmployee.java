public class ConEmployee extends Employee{
		private int payment;
		
		public ConEmployee(String name,int age,String employeeId,int payment){
			super(name,age,employeeId);
			this.payment = payment;
		}
		public int getPayment(){
			return payment;
		}
		public void setPayment(int payment){
			this.payment = payment;
		}
		public void printDetails(){
			super.printDetails();
			System.out.println("payment: "+this.payment);
		}
	}

