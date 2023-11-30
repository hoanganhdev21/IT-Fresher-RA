package Section4_Arrays;
import java.util.Scanner;
public class Unit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số dòng của mảng: ");
        int row = scanner.nextInt();

        System.out.print("Nhập vào số cột của mảng: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        System.out.println("Nhập vào giá trị cho các phần tử của mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Phần tử tại dòng " + (i+1) + " cột " + (j+1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Giá trị của các phần tử trong mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
