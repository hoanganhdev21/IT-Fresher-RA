package Section4_Arrays;
import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
        //1. Khai báo mảng một chiều số nguyên có tên numbers gồm 5 phần tử
        //- Datatype[] arrayName = new Datatype[size]
        int[] numbers = new int[5];
        //2. Khai báo và khởi tạo mảng số thực gồm các phần tử có giá trị 3.1, 5.8, -9.2
        //- Datatype[] arrayName = {value1, value2,..., valueN}
        float[] arrFloat = {3.1F, 5.8F, -9.2F};
        //3. In ra_exercise giá trị phần tử có chỉ số 1 trong mảng arrFloat
        System.out.println("Giá trị phần tử có chỉ số 1 trong arrFloat là: " + arrFloat[1]);
        //4. In ra_exercise giá trị phần tử có chỉ số là 3 trong mảng arrFloat
        //System.out.println("Giá trị phần t có chỉ số 3 trong arrFloat là: " + arrFloat[3]);
        //5. Nhập giá trị các phần tử mảng numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị các phần tử mảng:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //6. In giá trị các phần tử của mảng
        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
        }
        System.out.printf("\n");
        //7. Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
