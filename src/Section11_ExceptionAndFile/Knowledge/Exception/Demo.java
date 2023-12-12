package Section11_ExceptionAndFile.Knowledge.Exception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Nhập vào 2 số, tính thương 2 số
        Scanner scanner = new Scanner(System.in);
        int number1=0, number2;
        int result = 0;
        try {
            System.out.println("Nhập vào số thứ nhất");
            number1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số thứ hai:");
            number2 = Integer.parseInt(scanner.nextLine());
            result = number1 / number2;
        }catch (NumberFormatException ex2){
            ex2.printStackTrace();
        }
        catch (ArithmeticException ex1) {
            //Xử lý lỗi chia cho 0
            number2 = 1;
            result = number1 / number2;
            ex1.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            //Làm những công việc bắt buộc phải làm dù có lỗi hay không
            System.out.println("Kết thúc quá trình bắt lỗi");
        }

        System.out.println("Thương 2 số là: " + result);
        //try...catch...finally
    }
}
