package section4;

import java.util.Scanner;

public class Arrays2chieu {
    public static void main(String[] args) {
        // TẠO ĐỐI TƯỢNG SCANNER
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của mảng
        System.out.print("Nhập số dòng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        // Khai báo và khởi tạo mảng 2 chiều
        int[][] array = new int[rows][cols];

        while (true) {
            // Hiển thị menu
            System.out.println("\n<<<<<<<<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử trên đường biên và tính tổng");
            System.out.println("4. In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng");
            System.out.println("5. Tìm giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần theo cột");
            System.out.println("7. Thống kê các phần tử có giá trị lẻ chia hết cho 3");
            System.out.println("8. Thoát");

            System.out.print("Chọn một chức năng (1-8): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị các phần tử mảng
                    System.out.println("Nhập giá trị cho các phần tử của mảng:");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            array[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    // In giá trị các phần tử mảng theo ma trận
                    System.out.println("Giá trị các phần tử mảng theo ma trận:");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.print(array[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // In giá trị các phần tử trên đường biên và tính tổng
                    int sum = 0;
                    int row = array.length;
                    int col = array[0].length;

                    // In và tính tổng các phần tử trên đường biên
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            // Kiểm tra xem phần tử có nằm trên đường biên hay không
                            if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                                System.out.print(array[i][j] + " ");
                                sum += array[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    // In tổng
                    System.out.println("Tổng các phần tử trên đường biên là: " + sum);
                    break;
                case 4:
                    // In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng
                    int sumMainDiagonal = 0;
                    int sumSecondaryDiagonal = 0;
                    int row1 = array.length;
                    int col1 = array[0].length;

                    // Kiểm tra xem mảng có phải là mảng vuông hay không
                    if (row1 != col1) {
                        System.out.println("Mảng không phải là mảng vuông, không thể tính đường chéo.");
                        return;
                    }

                    // In và tính tổng các phần tử trên đường chéo chính và chéo phụ
                    for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col1; j++) {
                            // Kiểm tra xem phần tử có nằm trên đường chéo chính hay chéo phụ hay không
                            if (i == j) {
                                System.out.print(array[i][j] + " ");
                                sumMainDiagonal += array[i][j];
                            } else if (i + j == row1 - 1) {
                                System.out.print(array[i][j] + " ");
                                sumSecondaryDiagonal += array[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }

                    // In tổng
                    System.out.println("Tổng các phần tử trên đường chéo chính là: " + sumMainDiagonal);
                    System.out.println("Tổng các phần tử trên đường chéo phụ là: " + sumSecondaryDiagonal);
                    break;
                case 5:
                    // Tìm giá trị lớn nhất và nhỏ nhất trong mảng
                    int min = array[0][0];
                    int max = array[0][0];

                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (array[i][j] < min) {
                                min = array[i][j];
                            }
                            if (array[i][j] > max) {
                                max = array[i][j];
                            }
                        }
                    }

                    System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
                    System.out.println("Giá trị lớn nhất trong mảng là: " + max);
                    break;
                case 6:
                    // Sắp xếp mảng giảm dần theo cột
                    /*for (int i = 0; i < array[0].length; i++) {
                        for (int j = 0; j < array.length - 1; j++) {
                            for (int k = 0; k < array.length - j - 1; k++) {
                                if (array[k][i] < array[k + 1][i]) {
                                    int temp = array[k][i];
                                    array[k][i] = array[k + 1][i];
                                    array[k + 1][i] = temp;
                                }
                            }
                        }
                    }

                    // In mảng sau khi đã sắp xếp
                    for (int[] row : array) {
                        for (int num : row) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;*/
                    /*for (int j = 0; j < m; j++) {
                        for (int i = 0; i < n - 1; i++) {
                            for (int k = i + 1; k < n; k++) {
                                if (arr[i][j] < arr[k][j]) {
                                    int temp = arr[i][j];
                                    arr[i][j] = arr[k][j];
                                    arr[k][j] = temp;
                                }
                            }
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }*/
                case 7:
                    // Thống kê các phần tử có giá trị lẻ chia hết cho 3
                    int count = 0;
                    System.out.println("Các phần tử có giá trị lẻ và chia hết cho 3:");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (array[i][j] % 2 != 0 && array[i][j] % 3 == 0) {
                                System.out.println("Phần tử [" + i + "][" + j + "]: " + array[i][j]);
                                count++;
                            }
                        }
                    }
                    System.out.println("Tổng số phần tử có giá trị lẻ và chia hết cho 3: " + count);
                    break;
                case 8:
                    // Thoát
                    System.out.println("Chương trình kết thúc.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
