import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TestCa {
    @Test
    void twoPlus(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }
}