import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.timothyisaiah.loanapi.models.Employee;
import com.timothyisaiah.loanapi.repository.EmployeeRepository;
import com.timothyisaiah.loanapi.service.EmployeeServiceImpl;

public class TestEmployeeServiceImpl {

	@InjectMocks
	EmployeeServiceImpl employeeServiceImpl;
	
	@Mock
	EmployeeRepository employeeRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void fetchAllEmployeesTest() {
		List<Employee> list = new ArrayList<Employee>();
		Employee employee = new Employee("null", "null", "null", "null", "null");
		Employee employee2 = new Employee("null", "null", "null", "null", "null");
		Employee employee3 = new Employee("null", "null", "null", "null", "null");
		
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		
		when(employeeRepository.findAll()).thenReturn(list);
		
		List<Employee> testList = employeeServiceImpl.fetchAllEmployees();
		assertEquals(3, testList.size());
		verify(employeeRepository,times(1)).findAll();
	}
	
	@Test
	public void fetchEmployeeTest(){

		 when(employeeRepository.findById(1)).thenReturn(Optional.of(new Employee(1,"null","null","null","null","null")));
	}
	
	@Test
	public void saveEmployeeTest(){
		Employee employee = new Employee(1,"null","null","null","null","null");

		employeeServiceImpl.saveEmployee(employee);
		verify(employeeRepository,times(1)).save(employee);
	}
}
