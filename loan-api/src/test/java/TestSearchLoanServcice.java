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
import org.springframework.boot.test.context.SpringBootTest;

import com.timothyisaiah.loanapi.models.Searchloans;
import com.timothyisaiah.loanapi.repository.SearchloanRepository;
import com.timothyisaiah.loanapi.service.SearchLoanService;

@SpringBootTest
public class TestSearchLoanServcice {
	@InjectMocks
	SearchLoanService searchLoanService;
	
	@Mock
	SearchloanRepository searchloanrepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void fetchAllLoansTest() {
		List<Searchloans> list = new ArrayList<Searchloans>();
		Searchloans loan1 = new Searchloans(0, "null", "null", "null", 0, 2.0, 12.0, 2.0,null, "null", "null");
		Searchloans loan2 = new Searchloans(0, "null", "null", "null", 0, 2.0, 12.0, 2.0,null, "null", "null");
		Searchloans loan3 = new Searchloans(0, "null", "null", "null", 0, 2.0, 12.0, 2.0,null, "null", "null");
		list.add(loan3);
		list.add(loan2);
		list.add(loan1);
		
		when(searchloanrepository.findAll()).thenReturn(list);
		
		List<Searchloans> testList = searchLoanService.fetchAllLoanDetails();
		assertEquals(3, testList.size());
		verify(searchloanrepository,times(1)).findAll();
	}
	
	@Test
	public void fetchLoanDetailsTest(){

		 when(searchloanrepository.findById(1)).thenReturn(Optional.of(new Searchloans(0, "null", "null", "null", 0, 2.0, 12.0, 2.0,null, "null", "null")));
	}
	

}
