package Section4_Arrays;
import java.util.Scanner;
public class Unit4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập vào giá trị cho " + n + " phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
