package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result1  = first>second ? first: second;
        int result2  = result1>third ? result1: third;

        System.out.println(result2);
    }
}
