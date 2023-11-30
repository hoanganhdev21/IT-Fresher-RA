package Section4_Arrays;
import java.util.Scanner;

public class TwoDimensions {
    public static void main(String[] args) {
        //1. Khai báo mảng 2 chiều số nguyên gồm 3 dòng và 4 cột
        //- Datatype[][] arrayName = new Datatype[row][col]
        int[][] numbers = new int[3][4];
        //2. Nhập giá trị các phần tử của mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        //Duyệt theo chỉ số dòng
        for (int i = 0; i < 3; i++) {
            //Duyệt theo chỉ số cột
            for (int j = 0; j < 4; j++) {
                System.out.printf("numbers[%d][%d]=",i,j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //3. In mảng 2 chiều theo ma trận
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t",numbers[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
