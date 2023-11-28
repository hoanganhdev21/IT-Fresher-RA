package section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Unit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần tìm:");
        int findNumber = scanner.nextInt();
//        ArrayList<Integer> indices = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == findNumber) {
                indices.add(i);
                sum += array[i];
            }
        }
        System.out.println("Chỉ số các phần tử có giá trị bằng " + findNumber + " là: " + indices);
        System.out.println("Tổng các phần tử có giá trị bằng " + findNumber + " là: " + sum);
    }
}
