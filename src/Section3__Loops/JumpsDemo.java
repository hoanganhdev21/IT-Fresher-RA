package Section3__Loops;

public class JumpsDemo {
    public static void main(String[] args) {
        int total = addTwoNumbers(5, 7);
        System.out.println("Tong 2 so la: " + total);
        System.out.println("In cac so tu 1-5:");
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.printf("%d\t", i);
        }
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }
}
