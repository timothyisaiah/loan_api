import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.timothyisaiah.loanapi.models.Employee;
import com.timothyisaiah.loanapi.service.EmployeeServiceImpl;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EmployeeServiceImplTest {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	
	@Test
	void savedEmployeeHasFirstName() {
		Employee employee = new Employee("isaiah","timothy","timo@","we1233","admin");
		Employee savedEmployee = employeeServiceImpl.saveEmployee(employee);
		assertThat(savedEmployee.getFirstname()).isNotNull();
	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
