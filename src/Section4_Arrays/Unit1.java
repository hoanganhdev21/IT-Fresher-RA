package Section4_Arrays;
import java.util.Scanner;
public class Unit1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào giá trị cho 5 phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Giá trị của các phần tử trong mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ " + (i+1) + ": " + array[i]);
        }
    }
}
