import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first coordinate point: ");
        String coordinate = s.nextLine();
        System.out.print("Enter the second coordinate point: ");
        String coordinate2 = s.nextLine();
        int x = Integer.parseInt(coordinate.substring(1, 2));
        int y = Integer.parseInt(coordinate.substring(3, 4));
        int x2 = Integer.parseInt(coordinate2.substring(1, 2));
        int y2 = Integer.parseInt(coordinate2.substring(3, 4));
        String firstPair = "(" + x + (",") + y + ")";
        String secondPair = "(" + x2 + (",") + y2 + ")";
        System.out.println("First pair: " + firstPair);
        System.out.println("Second pair: " + secondPair);
    }
}
