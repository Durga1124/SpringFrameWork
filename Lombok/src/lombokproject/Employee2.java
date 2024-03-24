package lombokproject;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee2 {
	
	
	private int empId;
	private String empName;
	private double empSalary;

}
