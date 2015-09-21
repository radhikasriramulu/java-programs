/**
 * Implement or override the equals and hashcode
 */
package Strings;

public   class Employee {
	private String firstName;
	private String lastName;
	private int empId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
//		if (empId != other.empId)
//			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	public Employee(String firstName,String lastName,int empId) {
		this.firstName =  firstName;
		this.lastName =  lastName;
		this.empId = empId;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.firstName = "Guru";
		emp1.lastName = "Govi";
		emp1.empId = 1;
		
		Employee emp2 = new Employee();
		emp2.firstName = "Guru";
		emp2.lastName = "Govi";
		emp2.empId = 2;
		Employee emp3 = new Employee("Radhika","Sriramulu",3);
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}

}
