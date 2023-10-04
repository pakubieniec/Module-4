import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public String[] countWords(String input) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] arrayWords = input.split(" ");
        int sum = 1;
        for (String word : arrayWords) {
            System.out.println(word);
            if (!result.containsKey((word))) {
               result.put(word.replace(",", ""), sum);


            } else if (result.containsKey(word)) {
                result.put(word, sum + 1);
            }
        }

        System.out.println(result);
        return arrayWords; // powinno zwracać hashMape czy tablice?
    }
}


