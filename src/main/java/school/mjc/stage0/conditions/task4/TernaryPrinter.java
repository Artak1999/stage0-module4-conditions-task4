package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        int result = first > second ? first : second;
        if(result == first)
            System.out.println(first);
        else
            System.out.println(second);
    }
}
