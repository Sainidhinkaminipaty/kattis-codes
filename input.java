import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long longInputs[] = new long[2];
    while(scanner.hasNextLine())
    {
      String inputs[] = scanner.nextLine().split(" ");
      
      for(int i = 0; i < inputs.length; i++)
      {
        longInputs[i] = Long.parseLong(inputs[i]);
      }
      System.out.println(Math.abs(longInputs[1] - longInputs[0]));

    }
  }
}