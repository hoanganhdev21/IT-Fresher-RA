package Section6_Oops.RA.OOP;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //- Syntax: ClassName + objectName = new Constructor(arguments)
        //1. Khởi tạo đối tượng sinh viên có tên student1 mà không khởi tạo thông tin gì
        Students student1 = new Students();
        //2. Khởi tạo đối tượng sinh viên có tên student2 và khởi tạo mã sinh viên, tên sinh viên
        Students student2 = new Students("SV002", "Nguyễn Văn B");
        //3. Khởi tạo đối tượng sinh viên có tên student3 và khởi tạo tất cả thông tin sinh viên
        Students student3 = new Students("SV003", "Nguyễn Văn C", 25, true, 8.7F);
        //4. In ra tên của sinh viên 3
        System.out.println("Tên sinh viên 3: "+student3.getStudentName());
        //5. Nhập thông tin cho sinh viên 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 1:");
        student1.inputData(scanner);
        //6. Sử dụng phương thức set nhập các thông tin còn lại của sinh viên 2
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào điểm trung bình của sinh viên 2:");
        student2.setAvgMark(Float.parseFloat(scanner.nextLine()));

        //In ra thông tin các đối tượng
        System.out.println("THÔNG TIN ĐỐI TƯỢNG SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN ĐỐI TƯỢNG SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN ĐỐI TƯỢNG SINH VIÊN 3:");
        student3.displayData();
    }
}
