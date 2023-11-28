package section4;
import java.util.ArrayList;
import java.util.Scanner;

public class Unit7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        System.out.println("Nhập giá trị cần chèn:");
        int addValue = scanner.nextInt();
        System.out.println("Nhập chỉ số cần chèn:");
        int addIndex = scanner.nextInt();
        if (addIndex >= 0 && addIndex <= array.size()) {
            array.add(addIndex, addValue);
            System.out.println("Mảng sau khi chèn: " + array);
        } else {
            System.out.println("Chỉ số chèn không hợp lệ.");
        }
    }
}
