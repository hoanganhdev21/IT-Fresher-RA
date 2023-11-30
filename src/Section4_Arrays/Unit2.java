package Section4_Arrays;
import java.util.Scanner;
public class Unit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = scanner.nextInt();
        double[] array = new double[n];

        double sum = 0;
        System.out.println("Nhập vào giá trị cho " + n + " phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        double average = sum / n;
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng: " + average);
    }
}
