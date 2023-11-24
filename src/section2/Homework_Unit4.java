package section2;

public class Homework_Unit4 {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;
        while (count < 20) {
            if (laSoNguyenTo(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean laSoNguyenTo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
