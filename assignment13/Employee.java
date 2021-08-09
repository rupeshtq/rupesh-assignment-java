package assignment13;

public class Employee {
		private int empId;
		private String empName;
		private long empSalary;
		Employee()
		{
			
		}
		public Employee(int empId, String empName, long empSalary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public long getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(long empSalary) {
			this.empSalary = empSalary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
		}
		

}
