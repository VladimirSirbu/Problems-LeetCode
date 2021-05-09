package array.medium;

import java.util.HashMap;
import java.util.Map;

public class RabbitsInForest {
    public int numRabbits(int[] answers){

        int countRabbits = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 0){ // count unique rabits
                countRabbits++;
            } else if (!map.containsKey(answers[i])) { // if we see this rabit for the first time
                map.put(answers[i], 1);
                countRabbits += answers[i] + 1;
            } else if (map.containsKey(answers[i]) && map.get(answers[i]) > answers[i]) {
                countRabbits += answers[i] + 1;
                map.put(answers[i], 1);
            } else if (map.containsKey(answers[i])){
                map.put(answers[i], map.get(answers[i]) + 1);
            }
        }

        return countRabbits;
    }
}
