package lombokproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee1 {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	

}
