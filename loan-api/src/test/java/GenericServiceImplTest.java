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

import com.timothyisaiah.loanapi.models.Client;
import com.timothyisaiah.loanapi.repository.GenericRepository;
import com.timothyisaiah.loanapi.service.GenericServiceImpl;

public class GenericServiceImplTest {
	@InjectMocks
	GenericServiceImpl genericServiceImpl;
	
	@Mock
	GenericRepository clientRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void fetchAllClientsTest() {
		List<Client> list = new ArrayList<Client>();
		Client client = new Client("null", "null", "null", "null", "null", null);
		Client client2 = new Client("null", "null", "null", "null", "null", null);
		Client client3 = new Client("null", "null", "null", "null", "null", null);
		
		list.add(client);
		list.add(client2);
		list.add(client3);
		
		when(clientRepository.findAll()).thenReturn(list);
		
		List<Client> testList = genericServiceImpl.fetchAllClients();
		assertEquals(3, testList.size());
		verify(clientRepository,times(1)).findAll();
	}
	
	@Test
	public void fetchClientTest(){

		 when(clientRepository.findById(1)).thenReturn(Optional.of(new Client()));
	}
	
	@Test
	public void saveClientTest(){
		Client client = new Client(1,"null","null","null","null","null","null");

		genericServiceImpl.saveClient(client);
		verify(clientRepository,times(1)).save(client);
	}
}
