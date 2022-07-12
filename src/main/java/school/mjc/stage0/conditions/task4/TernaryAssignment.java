package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second ? first : second;
        if(result == first)
            System.out.println(10);
        else if(result == second)
            System.out.println(-10);
        else
            System.out.println(second);
    }
}
