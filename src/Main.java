import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("cat", "dog", "parrot", "cat", "duck"));

    public static void main(String[] args) {
        printOddNums();
        printEvenNums();
        printWords();
        amountRepeat();
    }

    public static void printOddNums() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void printEvenNums() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void printWords() {
        Set<String> uniWords = new HashSet<>(words);
        System.out.println(uniWords);
    }

    public static void amountRepeat() {
        Set<String> uniWords = new HashSet<>(words);
        System.out.println(words.size() - uniWords.size());
    }
}



