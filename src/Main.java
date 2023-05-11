import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "три"));

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();


    }

    public static void firstTask() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }

    }

    public static void secondTask() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void thirdTask() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void fourthTask() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size() - uniqueWords.size());
    }


}

