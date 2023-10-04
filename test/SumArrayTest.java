import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    private SumArray arr = new SumArray();
    @Test
    public void sumOneThreeFiveShouldReturnNine(){
        Assertions.assertEquals(9, arr.sumArray(new int[]{1, 3, 5}));
    }

    @Test
    public void checkResultForNegativeNumbers(){
        Assertions.assertEquals(-9, arr.sumArray(new int[]{-1, -3, -5}));
    }

    @Test
    public void checkResultForDifferentNumbers(){
        Assertions.assertEquals(-1, arr.sumArray(new int[] {1, 3, -5}));
    }

}

