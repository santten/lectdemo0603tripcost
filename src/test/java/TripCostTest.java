import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripCostTest {
    @Test
    public void testPriceCalc(){
        assertEquals(5.0, TripCostCalculator.price(1.0, 5.0), 0.001);
    }

    @Test
    public void testFuelNeeded(){
        assertEquals(5, TripCostCalculator.fuelNeeded(100), 0.001);
        assertEquals(0.5, TripCostCalculator.fuelNeeded(10), 0.001);
    }
}
