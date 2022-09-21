import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
            "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        String lowerText = text.toLowerCase();

        int max = 0;
        char maxChar = ' ';
        int min = Integer.MAX_VALUE;
        char minChar = ' ';

        Map<Character, Integer> list = new HashMap<>();

        for (int i = 0; i < lowerText.length(); i++) {
            char symbol = lowerText.charAt(i);
            if (Character.isLetter(symbol)) {
                if (list.get(symbol) == null) {
                    list.put(symbol, 1);
                } else {
                    int repeat = list.get(symbol);
                    list.put(symbol, repeat + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> map : list.entrySet()) {
            char key = map.getKey();
            int value = map.getValue();
            if (value > max) {
                max = value;
                maxChar = key;
            }
            if (value < min) {
                min = value;
                minChar = key;
            }
        }
//        System.out.println(list.entrySet());
        System.out.println("Максимум: " + max + " Символ: " + maxChar);
        System.out.println("Минимум: " + min + " Символ: " + minChar);
    }

}