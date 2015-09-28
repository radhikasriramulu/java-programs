package Collections;

public class EnumMonths {
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Month month: Month.values()){
		    System.out.println(month.name());
		}

	}

}
