import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        Calc c = new Calc();
        while(newInput.hasNext()) {
            String expression = newInput.nextLine();
            long cost = c.computeExpression(expression);
            System.out.println(cost);
        }
    }
}
