package section4;

import java.util.Scanner;
import java.util.ArrayList;

public class Unit8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        System.out.println("Nhập giá trị cần cập nhật:");
        int updateValue = scanner.nextInt();
        System.out.println("Nhập chỉ số cần cập nhật:");
        int updateIndex = scanner.nextInt();
        if (updateIndex >= 0 && updateIndex < array.size()) {
            array.set(updateIndex, updateValue);
            System.out.println("Mảng sau khi cập nhật: " + array);
        } else {
            System.out.println("Chỉ số cập nhật không hợp lệ.");
        }
    }
}