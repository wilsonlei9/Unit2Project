import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first coordinate point: ");
        String coordinate = s.nextLine();
        System.out.print("Enter the second coordinate point: ");
        String coordinate2 = s.nextLine();
        int x1 = Integer.parseInt(coordinate.substring(1, 2));
        int y1 = Integer.parseInt(coordinate.substring(3, 4));
        int x2 = Integer.parseInt(coordinate2.substring(1, 2));
        int y2 = Integer.parseInt(coordinate2.substring(3, 4));
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        equation.calculateSlope();
        equation.yIntercept();
        equation.calculateDistance();
        String str = equation.toString();
        System.out.print(str);
        System.out.print("Enter an x value: ");
        String xValue = s.nextLine();
        int newX = Integer.parseInt(xValue.substring(0));
        String solvedX = "(" + equation.calculateSlope()*newX + "," + (equation.calculateSlope()*newX + equation.yIntercept()) + ")";
        System.out.print(solvedX);
    }
}
