import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UseBicycleTest {
    @Test
    void 바이클_사용(){
        Bicycle bicycle = new Bicycle(1,1,1);
        assertEquals(1, bicycle.getID(), "Bicycle getId");
    }
}
