package lombokproject;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Test1 {
	public static void main(String[] args) {
		
		Employee2 employee= Employee2.builder()
				                      .empId(1001)
				                      .empName("Prasad")
				                      .empSalary(10000.45)
				                      .build();
		   System.out.println(employee);
	}
	
	

	
}
