public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.print(getEvenDigitSum(123456789));
        System.out.print(getEvenDigitSum(252));
        System.out.print(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            number /= 10;
        }

        return sum;


    }
}