package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second ? first : second;
        if(result == 10)
            System.out.println(10);
        else
            System.out.println(-10);
    }
}
