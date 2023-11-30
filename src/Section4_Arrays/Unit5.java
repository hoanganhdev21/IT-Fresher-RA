package Section4_Arrays;
import java.util.Scanner;
public class Unit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số dòng của mảng: ");
        int row = scanner.nextInt();

        System.out.print("Nhập vào số cột của mảng: ");
        int col = scanner.nextInt();

        double[][] array = new double[row][col];

        System.out.println("Nhập vào giá trị cho các phần tử của mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Phần tử tại dòng " + (i+1) + " cột " + (j+1) + ": ");
                array[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0;
        System.out.println("Giá trị của các phần tử chẵn trong mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.println(array[i][j]);
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Tổng của các phần tử chẵn trong mảng: " + sum);
    }
}
