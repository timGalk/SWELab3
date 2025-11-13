import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HRCalculatorTest {
    @Test
    public void testValidMaxHR(){
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }
    @Test
    public void testWarmUpZone(){
        var result = HRCalculator.getWorkoutZone(40, 100);
        assertEquals("Warm up", result);
    }

    @Test
    public void testFatBurnZone(){
        var result = HRCalculator.getWorkoutZone(40, 120);
        assertEquals("Fat burn", result);
    }

    @Test
    public void testAerobicZone(){
        var result = HRCalculator.getWorkoutZone(40, 135);
        assertEquals("Aerobic", result);
    }

    @Test
    public void testAnaerobicZone(){
        var result = HRCalculator.getWorkoutZone(40, 150);
        assertEquals("Anaerobic", result);
    }

    @Test
    public void testMaximumZone(){
        var result = HRCalculator.getWorkoutZone(40, 170);
        assertEquals("Maximum", result);
    }
}