package ITFresher_NguyenHoangAnh;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("\n!!<<<<<<<<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>>>>>>>>!!\n");
            System.out.println("1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím)");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4. In RA_Exercise vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần, các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.println("Vui lòng chọn chức năng từ 1 >>> 9 xin cảm ơn!:");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    // Nhập giá trị n phần tử của mảng
                    System.out.println("Nhập số lượng phần tử của mảng:");
                    n = scanner.nextInt();
                    System.out.println("Nhập giá trị cho từng phần tử của mảng:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + ":");
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    // In giá trị các phần tử trong mảng
                    System.out.println("Giá trị của các phần tử trong mảng:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Phần tử thứ " + (i + 1) + ": " + arr[i]);
                    }
                    break;
                case 3:
                    // Tính trung bình các phần tử dương (>0) trong mảng
                    int sum = 0;
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        double average = (double) sum / count;
                        System.out.println("Trung bình các phần tử dương trong mảng: " + average);
                    } else {
                        System.out.println("Không có phần tử dương nào trong mảng.");
                    }
                    break;
                case 4:
                    // In RA_Exercise vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng
                    System.out.print("Nhập giá trị k cần tìm: ");
                    int k = scanner.nextInt();

                    System.out.print("Vị trí (chỉ số) của phần tử có giá trị " + k + " trong mảng: ");
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy giá trị " + k + " trong mảng.");
                    } else {
                        System.out.println();
                    }
                    break;
                case 5:
                    // Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.print("Mảng sau khi sắp xếp giảm dần: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 6:
                    // Tính số lượng các phần tử là số nguyên tố trong mảng
                    int count2 = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;

                        if (arr[i] < 2) {
                            isPrime = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                                if (arr[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            count2++;
                        }
                    }
                    System.out.println("Số lượng phần tử là số nguyên tố trong mảng là: " + count2);
                    break;
                case 7:
                    // Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng dần,
                    // các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần, các phần tử
                    // còn lại ở giữa mảng theo thứ tự tăng dần
                    // Sắp xếp mảng theo yêu cầu
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            // Sắp xếp phần tử chẵn chia hết cho 3
                            if (arr[i] % 2 == 0 && arr[i] % 3 == 0 && arr[j] % 2 == 0 && arr[j] % 3 == 0) {
                                if (arr[i] > arr[j]) {
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                            // Sắp xếp phần tử lẻ chia hết cho 3
                            else if (arr[i] % 2 != 0 && arr[i] % 3 == 0 && arr[j] % 2 != 0 && arr[j] % 3 == 0) {
                                if (arr[i] < arr[j]) {
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                            // Sắp xếp phần tử còn lại
                            else if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }

                    // Hiển thị mảng sau khi sắp xếp
                    System.out.println("Mảng sau khi sắp xếp:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 8:
                    // Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí
                    System.out.print("Nhập giá trị m: ");
                    int m = scanner.nextInt();
                    int[] newArray = new int[n + 1];
                    int i;
                    for (i = 0; i < n; i++) {
                        if (arr[i] < m) {
                            newArray[i] = arr[i];
                        } else {
                            break;
                        }
                    }
                    newArray[i] = m;
                    for (int j = i; j < n; j++) {
                        newArray[j + 1] = arr[j];
                    }
                    System.out.print("Mảng sau khi chèn: ");
                    for (int value : newArray) {
                        System.out.print(value + " ");
                    }
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (opt != 9);
    }
}

