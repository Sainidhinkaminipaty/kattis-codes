import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("-");
        String output = "";
        for (String s : names)
            output += s.charAt(0);
        System.out.println(output);
    }
}