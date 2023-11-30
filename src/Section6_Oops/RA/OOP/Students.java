package Section6_Oops.RA.OOP;

import java.util.Scanner;

/*
 * Xây dựng lớp Sinh viên gồm:
 * - Đặc điểm:
 *   + Mã sinh viên
 *   + Tên sinh viên
 *   + Tuổi
 *   + Giới tính
 *   + Điểm trung bình
 * - Hành vi:
 *   + chào thầy Quang
 *   + Tính tổng 2 số
 *   + Chào bạn
 * */
public class Students {
    //1. Fields/Properties/Attributes - Thuộc tính của lớp: 0 -> N
    //- Syntax: Access Modifier (private) + Datatype + fieldName
    public String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float avgMark;

    //2. Constructors - Hàm tạo để khởi tạo đối tượng: 0 -> N
    //- Syntax: Access Modifier (public) + ClassName(parameters) --> parameter: datatype + paramName (0->N)
    //- Constructor không có tham số - Default Constructor
    public Students() {
    }

    //- Constructor có 2 tham số để khởi tạo mã sinh viên, tên sinh viên của đối tượng
    public Students(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //- Constructor có 5 tham số để khởi tạo tất cả thông tin sinh viên
    public Students(String studentId, String studentName, int age, boolean sex, float avgMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.avgMark = avgMark;
    }

    //3. Methods: Phương thức thể hiện hành vi của đối tượng
    //- Syntax: Access Modifier + ReturnData + MethodName(parameters)
    //-3.1. Getter/Setter: Getter - lấy thông tin thuộc tính --- Setter - Gán giá trị cho các thuộc tính
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    //3.2. Các phương thức thể hiện hành vi
    public void helloTeacher() {
        System.out.println("Hello Mr.Quang");
    }

    public void helloFriend(String friendName) {
        System.out.println("Hello " + friendName);
    }

    public int addTwoNumber(int firstNumber, int lastNumber) {
        int sum = firstNumber + lastNumber;
        return sum;
    }

    //Phương thức cho phép nhập thông tin đối tượng
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào điểm trung bình sinh viên:");
        this.avgMark = Float.parseFloat(scanner.nextLine());
    }

    //Phương thức cho phép hiển thị thông tin sinh viên
    public void displayData() {
        System.out.printf("Mã SV: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Điểm trung bình: %.2f\n", this.sex, this.avgMark);
    }
}