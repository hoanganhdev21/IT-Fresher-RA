package Section4_Arrays;
import java.util.Scanner;
public class SingleArray_App {
    /*
     * 1. Nhập số phần tử mảng (n)
     * 2. Khai báo mảng số nguyên 1 chiều gồm n phần tử
     * 3. In menu và thực hiện các chức năng theo menu:
     * *******************MENU***********************
     * 1. Nhập giá trị các phần tử mảng
     * 2. In giá trị các phần tử mảng
     * 3. In giá trị các phần tử có giá trị chẵn và tính tổng
     * 4. In giá trị các phần tử có chỉ số lẻ và tính tổng
     * 5. In giá trị các phần tử là số nguyên tố
     * 6. Sắp xếp mảng tăng dần
     * 7. Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng
     * 8.Thoát
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[sizeOfArray];
        //Khai báo biến tổng
        int sumNumbers;
        do {
            System.out.println("*****************MENU*****************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử chẵn và tính tổng");
            System.out.println("4. In giá trị các phần tử chỉ số lẻ và tính tổng");
            System.out.println("5. In giá trị các phần tử nguyên tố");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Nhập và thống kê số lần xuất hiện");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("numbers[%d]=", i);
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng:");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("%d\t", numbers[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    sumNumbers = 0;
                    System.out.println("Các phần tử chẵn trong mảng:");
                    for (int element : numbers) {
                        if (element % 2 == 0) {
                            System.out.printf("%d\t", element);
                            sumNumbers += element;
                        }
                    }
                    System.out.printf("\nTổng các phần tử chẵn trong mảng là: %d\n", sumNumbers);
                    break;
                case 4:
                    sumNumbers = 0;
                    System.out.println("Các phần tử có chỉ số lẻ trong mảng:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (i % 2 != 0) {
                            System.out.printf("%d\t", numbers[i]);
                            sumNumbers += numbers[i];
                        }
                    }
                    System.out.printf("\nTổng các phần tử có chỉ số lẻ trong mảng là: %d\n", sumNumbers);
                    break;
                case 5:
                    System.out.println("Các phần tử là số nguyên tố trong mảng:");
                    for (int i = 0; i < numbers.length; i++) {
                        //Duyệt và kiểm tra số nguyên tố của phần tử numbers[i]
                        boolean isPrime = true;
                        if (numbers[i] >= 2) {
                            for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                                if (numbers[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        } else {
                            isPrime = false;
                        }
                        if (isPrime) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 6:
                    for (int i = 0; i < numbers.length - 1; i++) {
                        for (int j = i + 1; j < numbers.length; j++) {
                            if (numbers[i] > numbers[j]) {
                                //Đổi chỗ phần tử i và j
                                int temp = numbers[i];
                                numbers[i] = numbers[j];
                                numbers[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã xếp xong mảng tăng dần");
                    break;
                case 7:
                    System.out.println("Nhập vào một số:");
                    int findNumber = Integer.parseInt(scanner.nextLine());
                    int cntNumber = 0;
                    for (int element : numbers) {
                        if (element==findNumber){
                            cntNumber++;
                        }
                    }
                    System.out.printf("Có %d phần tử có giá trị bằng %d\n",cntNumber,findNumber);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-8");
            }
        } while (true);
    }
}
