public class Main {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;

    System.out.println("Before swapping: x = " + x + " y = " + y);

    int temp = x;
    x = y;
    y = temp;

    System.out.println("After swapping: x = " + x + " y = " + y);
  }
}
