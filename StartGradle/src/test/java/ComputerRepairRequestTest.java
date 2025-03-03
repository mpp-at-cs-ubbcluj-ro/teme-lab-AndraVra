import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")
    public void testFirst() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        assertEquals("",ccr.getOwnerName());
        assertEquals("",ccr.getOwnerAddress());
    }
    @Test
    @DisplayName("Test Exemple")
    public void testExemple2() {
        assertEquals(2,2,"Numerele ar trebuie sa fie egale");

    }
      
}
