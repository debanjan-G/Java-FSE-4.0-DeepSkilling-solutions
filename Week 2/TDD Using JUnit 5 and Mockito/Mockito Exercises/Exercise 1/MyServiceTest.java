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
    public void testExternalApi() {
        // Create a mock object for the external API
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the methods to return predefined values
        when(mockApi.getData()).thenReturn("Mock Data");

        // Use the mock in the service
        MyService service = new MyService(mockApi);

        // Assert the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}