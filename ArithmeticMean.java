package SecondHW;

public class ArithmeticMean {
    public static void main(String[] args) {
        Integer[] integers = {46, 8, 14, 21,};
        double sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        System.out.print("Average - " + sum / integers.length);
    }
}
