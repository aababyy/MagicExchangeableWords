import java.util.ArrayList;
import java.util.Scanner;

public class P14_MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings of equal length, separated by a space, please:");
        String[] input = in.nextLine().split(" ");
        System.out.print(checkIfExchangeable(input));
    }
    private static boolean checkIfExchangeable(String[] s) {
        boolean isEx = true;
        ArrayList<Character> l0 = new ArrayList<Character>();
        ArrayList<Character> l1 = new ArrayList<Character>();
        for (int i = 0; i < s[0].length(); i++) {
            char c0 = s[0].charAt(i);
            if (!l0.contains(s[0].charAt(i))) {
                l0.add(s[0].charAt(i));
            }
            char c1 = s[1].charAt(i);
            if (!l1.contains(s[1].charAt(i))) {
                l1.add(s[1].charAt(i));
            }
            if (l0.size() != l1.size()) {
                isEx = false;
                return isEx;
            }
            for (int j = i; j < s[0].length(); j++) {
                if (!l0.contains(s[0].charAt(j))) {
                    continue;
                } else {
                    int ind = l0.indexOf(s[0].charAt(j));
                    if (((s[0].charAt(j) == c0) && (s[1].charAt(j) != c1)) && (c1 != l1.get(ind))) {
                        isEx = false;
                        return isEx;
                    }
                }
            }
        }
        return isEx;
    }
}
