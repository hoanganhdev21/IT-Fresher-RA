package Section11_ExceptionAndFile.Knowledge.Exception;

import java.util.Scanner;

public class Throw_Throws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int number2 = Integer.parseInt(scanner.nextLine());
        int result = divide(number1, number2);
        System.out.println("Thương 2 số là: " + result);
    }

    public static int divide(int number1, int number2) throws ArithmeticException,IndexOutOfBoundsException {
        //throw --> ném ngoại lệ cho từng trường hợp cụ thể
        if (number2==0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        int result = number1 / number2;
        return result;
    }
}
