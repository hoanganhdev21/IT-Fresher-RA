package section4;

import java.util.Scanner;

public class ExerciseArrays {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng (n): ");
        int n = scanner.nextInt();

        // Khai báo mảng số nguyên 1 chiều gồm n phần tử
        int[] arr = new int[n];

        int opt;

        do {
            // In menu
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử có giá trị chẵn và tính tổng");
            System.out.println("4. In giá trị các phần tử có chỉ số lẻ và tính tổng");
            System.out.println("5. In giá trị các phần tử là số nguyên tố");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng");
            System.out.println("8. Thoát");

            System.out.print("Chọn chức năng (1-8): ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Nhập giá trị các phần tử mảng:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử mảng:");
                    for (int index : arr) {
                        System.out.print(index + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Giá trị các phần tử chẵn:");
                    int sum = 0;
                    for (int element : arr) {
                        if (element % 2 == 0) {
                            System.out.print(element + " ");
                            sum += element;
                        }
                    }
                    System.out.println("\nTổng các phần tử chẵn: " + sum);
                    break;
                case 4:
                    System.out.println("Giá trị các phần tử có chỉ số lẻ:");
                    int sum2 = 0;
                    for (int i = 1; i < arr.length; i += 2) {
                        System.out.print(arr[i] + " ");
                        sum2 += arr[i];
                    }
                    System.out.println("\nTổng các phần tử có chỉ số lẻ: " + sum2);
                    break;
                case 5:
                    System.out.println("Các số nguyên tố trong mảng:");
                    for (int index : arr) {
                        boolean isPrime = true;
                        if (index < 2) {
                            isPrime = false;
                        } else {
                            for (int i = 2; i <= Math.sqrt(index); i++) {
                                if (index % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            System.out.print(index + " ");
                        }
                    }
                    System.out.println();

                    break;
                case 6:
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp tăng dần:");
                    break;
                case 7:
                    System.out.print("Nhập số cần thống kê: ");
                    int numberToCount = scanner.nextInt();
                    int count = 0;
                    for (int element : arr) {
                        if (element == numberToCount) {
                            count++;
                        }
                    }
                    System.out.println("Số " + numberToCount + " xuất hiện " + count + " lần trong mảng.");
                    break;
                case 8:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Hãy chọn lại.");
            }
        } while (opt != 8);

    }
}
