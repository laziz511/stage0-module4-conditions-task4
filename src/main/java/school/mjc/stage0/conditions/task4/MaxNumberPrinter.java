package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int the_biggest = first;
        if (second> the_biggest){
            the_biggest = second;
        }
        if (third>the_biggest){
            the_biggest= third;
        }
        System.out.println(the_biggest);
    }
}
