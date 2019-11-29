//import static org.hamcrest.CoreMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//
//import com.timothyisaiah.loanapi.models.Employee;
//import com.timothyisaiah.loanapi.repository.EmployeeRepository;
//import com.timothyisaiah.loanapi.service.EmployeeServiceImpl;
//
//@SpringBootTest
//public class TestEmployeeController {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    
//	@Mock
//	EmployeeRepository employeeRepository;
//	
//    @MockBean
//    EmployeeServiceImpl employeeServiceImpl;
//
//    private Employee employee = new Employee(1,"timothy","isaiah","timOIsaia","12345678","Admin");
//    
////    @Test
////    void saveLenderTest() throws  Exception
////    {
////        when(employeeServiceImpl.saveEmployee(any(Employee.class))).thenReturn(true);
////        MvcResult result = mockMvc.perform(get("/saveClient")
////                .contentType(MediaType.APPLICATION_JSON_VALUE)
////                .content(super.mapToJson(employee)))
////                .andExpect(status().isOk())
////                .andReturn();
////
////        assertThat(result.getResponse().getContentAsString().replaceAll("\"","")).isEqualTo("Registered successfully");
////
////        verify(employeeServiceImpl,times(1)).isEmailValid("nehe@gmail.com");
////    }
//    
////    @Test
////    public void fetchAllEmployeesTest() throws  Exception
////    {
////    	
////		List<Employee> list = new ArrayList<Employee>();
////		Employee employee = new Employee("null", "null", "null", "null", "null");
////		Employee employee2 = new Employee("null", "null", "null", "null", "null");
////		Employee employee3 = new Employee("null", "null", "null", "null", "null");
////		
////		list.add(employee);
////		list.add(employee2);
////		list.add(employee3);
////		
////		when(employeeRepository.findAll()).thenReturn(list);
////
////        when(employeeServiceImpl.fetchAllEmployees()).thenReturn(Collections.singletonList(new Employee()));
////
////        mockMvc.perform(get("/fetchAllEmployees"));
////
////    }
//
//}
