package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second ? first : second;
        result =  result == first ? 10 : -10;
        System.out.println(result);
    }
}
