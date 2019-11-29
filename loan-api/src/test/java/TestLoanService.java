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

import com.timothyisaiah.loanapi.models.Loans;
import com.timothyisaiah.loanapi.repository.LoanRepository;
import com.timothyisaiah.loanapi.service.LoanService;

@SpringBootTest
public class TestLoanService {
 
	@InjectMocks
	LoanService loanService;
	
	@Mock
	LoanRepository loanRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void fetchAllLoansTest() {
		List<Loans> list = new ArrayList<Loans>();
		Loans loan1 = new Loans(0, null, null, null, null, 0, 0, null);
		Loans loan2 = new Loans(0, null, null, null, null, 0, 0, null);
		Loans loan3 = new Loans(0, null, null, null, null, 0, 0, null);
		
		list.add(loan3);
		list.add(loan2);
		list.add(loan1);
		
		when(loanRepository.findAll()).thenReturn(list);
		
		List<Loans> testList = loanService.fetchAllLoans();
		assertEquals(3, testList.size());
		verify(loanRepository,times(1)).findAll();
	}
	
	@Test
	public void fetchLoanTest(){

		 when(loanRepository.findById(1)).thenReturn(Optional.of(new Loans(1,null,null,null,null,0, 0, null)));
	}
	
	@Test
	public void saveLoanTest(){
		Loans loan = new Loans(1, null, null, null, null, 0, 0, null);;

		loanService.saveLoan(loan);
		verify(loanRepository,times(1)).save(loan);
	}
	

	// @Test

}
