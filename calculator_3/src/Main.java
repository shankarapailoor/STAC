public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
        long cost = c.computeExpression(expression);
        System.out.println(cost);
    }
}
