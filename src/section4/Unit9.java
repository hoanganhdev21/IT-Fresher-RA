package section4;

import java.util.Scanner;
import java.util.ArrayList;

public class Unit9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        System.out.println("Nhập chỉ số cần xóa:");
        int deleteIndex = scanner.nextInt();
        if (deleteIndex >= 0 && deleteIndex < array.size()) {
            array.remove(deleteIndex);
            System.out.println("Mảng sau khi xóa: " + array);
        } else {
            System.out.println("Chỉ số xóa không hợp lệ.");
        }
    }
}