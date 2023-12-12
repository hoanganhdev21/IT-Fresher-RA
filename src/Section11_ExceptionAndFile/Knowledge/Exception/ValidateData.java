package Section11_ExceptionAndFile.Knowledge.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateData {
    public static void main(String[] args) {
        //1. Nhập vào 1 số nguyên có giá trị lớn hơn 0
        Scanner scanner = new Scanner(System.in);
        int number = validateInteger(scanner);
        Date created = validateDate(scanner);

    }

    public static int validateInteger(Scanner scanner) {
        System.out.println("Nhập vào một số nguyên:");
        do {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Giá trị số nguyên > 0 vui lòng nhập lại");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Vui lòng nhập số nguyên");
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

        } while (true);
    }
    public static Date validateDate(Scanner scanner){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào một ngày:");
        do {
            try {
                Date date = sdf.parse(scanner.nextLine());
                return date;
            } catch (ParseException e) {
                System.err.println("Định dạng ngày dd/MM/yyyy, vui lòng nhập lại");
            }
        }while(true);
    }
}
