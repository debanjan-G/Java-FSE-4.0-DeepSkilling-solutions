import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

// ExternalApi interface to be mocked
interface ExternalApi {
    String getData();
}

// Service class that depends on ExternalApi
class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}

public class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        // Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Use the mock in the service
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify the interaction
        verify(mockApi).getData();
    }
}