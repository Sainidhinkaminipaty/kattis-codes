import java.util.*;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int n = sc.nextInt();
    IntStream.rangeClosed(1, n).mapToObj(i -> i % x == 0? i % y == 0? "FizzBuzz" : "Fizz" : i % y == 0 ? "Buzz" : i).forEach(System.out::println);
  }
}