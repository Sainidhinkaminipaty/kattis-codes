import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    String []arr = sc.nextLine().split(" ");
    boolean idk = false;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i].equals("mumble") || arr[i].equals(Integer.toString(i+1)))
        continue;
      idk = true;
    }
    String result = idk ? "something is fishy" : "makes sense";
    System.out.println(result);
  }
}