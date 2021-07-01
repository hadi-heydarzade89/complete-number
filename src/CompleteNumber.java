import java.util.Arrays;

public class CompleteNumber {


    private static void CompleteNumber(int number) {

        int sumOfNumbers = 0;
        while (number > 0) {
            for (int i = 1; i < number; i++) {
                if ((number % i) == 0) {
                    sumOfNumbers += i;
                }
            }
            if (sumOfNumbers == number) {
                System.out.println(number + "\n");
            }
            sumOfNumbers = 0;
            number--;
        }
    }

    public static void main(String[] args) {
        CompleteNumber(10000);
    }
}
