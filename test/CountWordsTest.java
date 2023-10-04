import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
public class CountWordsTest {
    private CountWords words = new CountWords();
    String[] arr = {"Ala, 2", "ma, 2", "kota, 2"};

    @Test
    public void checkSentenceAlaMaKotaKotaMaAla(){

    Assertions.assertArrayEquals(arr, words.countWords("Ala ma kota, kota ma ALa"));

    }
}
