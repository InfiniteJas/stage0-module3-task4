package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a;
        a = 1.0;
        double b;
        b = 2.0;
        double result = ((9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
        System.out.println(result);
    }
}
