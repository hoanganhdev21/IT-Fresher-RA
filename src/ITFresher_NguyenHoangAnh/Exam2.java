package ITFresher_NguyenHoangAnh;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
//        int[][] matrix;
        int rows, cols;

        // Nhập số dòng và số cột của mảng
        System.out.print("Nhập số dòng của ma trận: ");
        rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        cols = scanner.nextInt();

        // Khai báo và khởi tạo mảng 2 chiều
        int[][] arr = new int[rows][cols];
        int opt;

        do {
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra_exercise các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng");
            System.out.println("9. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    // Nhập giá trị cho các phần tử trong mảng
                    System.out.println("Nhập giá trị cho các phần tử của mảng:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    // In giá trị các phần tử trong mảng theo ma trận
                    System.out.println("Giá trị các phần tử mảng theo ma trận:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng
                    int count = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("Số lượng phần tử chia hết cho 2 và 3 trong mảng là: " + count);
                    break;
                case 4:
                    // In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ
                    int sum = 0;
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            // Kiểm tra nếu phần tử nằm trên đường biên, đường chéo chính hoặc đường chéo phụ
                            if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - j - 1) {
                                System.out.println(arr[i][j]);
                                sum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ: " + sum);

                    break;
                case 5:
                    // Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng
                    for (int j = 0; j < cols; j++) {
                        for (int i = 0; i < rows - 1; i++) {
                            int minIndex = i;
                            for (int k = i + 1; k < rows; k++) {
                                if (arr[k][j] < arr[minIndex][j]) {
                                    minIndex = k;
                                }
                            }
                            if (minIndex != i) {
                                int temp = arr[i][j];
                                arr[i][j] = arr[minIndex][j];
                                arr[minIndex][j] = temp;
                            }
                        }
                    }
                    // In ra_exercise ma trận sau khi đã sắp xếp
                    for (int i = 0; i < cols; i++) {
                        for (int j = 0; j < rows; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Các phần tử là số nguyên tố trong mảng:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            int currentNumber = arr[i][j];
                            boolean isPrime = true;

                            if (currentNumber < 2) {
                                isPrime = false;
                            } else {
                                for (int k = 2; k <= Math.sqrt(currentNumber); k++) {
                                    if (currentNumber % k == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }
                            if (isPrime) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                    }
                    System.out.println(); // Xuống dòng sau khi kết thúc

                    break;
                case 7:
                    // Nhập kích thước của ma trận vuông
                    System.out.print("Nhập kích thước của ma trận vuông: ");
                    int size = scanner.nextInt();

                    int[][] maTrix = new int[size][size];

                    // Nhập giá trị cho ma trận
                    System.out.println("Nhập giá trị cho ma trận:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            maTrix[i][j] = scanner.nextInt();
                        }
                    }

                    // Sắp xếp các phần tử trên đường chéo chính giảm dần
                    for (int i = 1; i < size; i++) {
                        int giaTriHienTai = maTrix[i][i];
                        int j = i - 1;

                        while (j >= 0 && maTrix[j][j] < giaTriHienTai) {
                            maTrix[j + 1][j + 1] = maTrix[j][j];
                            j--;
                        }

                        maTrix[j + 1][j + 1] = giaTriHienTai;
                    }

                    // Hiển thị ma trận sau khi sắp xếp
                    System.out.println("Ma trận sau khi sắp xếp các phần tử trên đường chéo chính giảm dần:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print(maTrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 8:
                    System.out.println("Nhập số phần tử của mảng:");
                    int m = scanner.nextInt();
                    int[] arrs = new int[m];
                    System.out.println("Nhập các phần tử của mảng:");
                    for(int i = 0; i < m; i++){
                        arrs[i] = scanner.nextInt();
                    }
                    System.out.println("Nhập chỉ số dòng muốn chèn:");
                    int index = scanner.nextInt();
                    int[][] matrix = new int[3][3];
                    System.out.println("Nhập các phần tử của ma trận:");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    // Chèn mảng vào ma trận tại chỉ số dòng đã cho
                    matrix[index] = arrs;
                    System.out.println("Ma trận sau khi chèn:");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (opt != 9);
    }
}

