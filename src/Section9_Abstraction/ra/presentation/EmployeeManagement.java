package Section9_Abstraction.ra.presentation;

import Section9_Abstraction.ra.businessImp.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class EmployeeManagement {

    private static final Employee[] employees = new Employee[100];
    private static int numEmployees = 0;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("\n<<<<<<<<<<<<<<<<<<<< MENU MANAGEMENT >>>>>>>>>>>>>>>\n");
//            System.out.println("1. Nhập thông tin cho n nhân viên");
//            System.out.println("2. Hiển thị thông tin nhân viên");
//            System.out.println("3. Tính lương cho các nhân viên");
//            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
//            System.out.println("5. Cập nhật thông tin nhân viên");
//            System.out.println("6. Xóa nhân viên theo mã nhân viên");
//            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
//            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
//            System.out.println("9. Sắp xếp nhân viên theo năm sinh tăng dần (Comparator)");
//            System.out.println("10. Thoát");
//
//
//            System.out.println("Lựa chọn của bạn là: ");
//            choice = parseInt(scanner.nextLine());
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    inputEmployee(scanner);
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                case 8:
//                    break;
//                case 9:
//                    break;
//                case 10:
//                    break;
//                default:
//                    System.out.println("LỰA CHỌN KHÔNG ĐÚNG. VUI LÒNG CHỌN LẠI!");
//            }
//        } while (choice != 10);
//    }

    public static void main(String[] args) {
//        EmployeeManagement employeeManagement = new EmployeeManagement();
//        employeeManagement.showMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n<<<<<<<<<<<<<<<<<<<< MENU MANAGEMENT >>>>>>>>>>>>>>>\n");
            System.out.println("1. Nhập thông tin cho n nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tính lương cho các nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
            System.out.println("9. Sắp xếp nhân viên theo năm sinh tăng dần (Comparator)");
            System.out.println("10. Thoát");


            System.out.println("Lựa chọn của bạn là: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    inputEmployee(scanner);
                    break;
                case 2:
                    displayEmployee();
                    break;
                case 3:
                    calculateSalary();
                    break;
                case 4:
                    searchEmployeeByName(scanner);
                    break;
                case 5:
                    updateEmployee(scanner);
                    break;
                case 6:
                    deleteEmployee(scanner);
                    break;
                case 7:
                    Arrays.sort(employees, 0, numEmployees);
                    System.out.println("Đã sắp xếp theo lương tăng dần.");
                    break;
                case 8:
                    Arrays.sort(employees, 0, numEmployees, Comparator.comparing(Employee::getName).reversed());
                    System.out.println("Đã sắp xếp theo tên nhân viên giảm dần.");
                    break;
                case 9:
                    Arrays.sort(employees, 0, numEmployees, Comparator.comparingInt(Employee::getYear));
                    System.out.println("Đã sắp xếp theo năm sinh tăng dần.");
                    break;
                case 10:
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG ĐÚNG. VUI LÒNG CHỌN LẠI!");
            }
        } while (choice != 10);
    }

    private static void inputEmployee(Scanner scanner) {
        System.out.print("Nhập số lượng nhân viên cần thêm: ");
//        int n = scanner.nextInt();
        int n = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            employees[numEmployees] = new Employee();
            employees[numEmployees].inputData(scanner);
            numEmployees++;
        }
    }

    private static void displayEmployee() {
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Thông tin nhân viên thứ " + (i + 1) + ":");
            employees[i].displayData();
            System.out.println("=============================================");
        }
    }

    private static void calculateSalary() {
        for (int i = 0; i < numEmployees; i++) {
            employees[i].calSalary();
        }
        System.out.println("Đã tính lương cho các nhân viên.");
    }

    private static void searchEmployeeByName(Scanner scanner) {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String searchName = scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getName().equalsIgnoreCase(searchName)) {
                System.out.println("Thông tin nhân viên cần tìm:");
                employees[i].displayData();
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên có tên: " + searchName);
    }

    private static void updateEmployee(Scanner scanner) {
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        String updateId = scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getId().equalsIgnoreCase(updateId)) {
                System.out.println("Nhập thông tin cập nhật cho nhân viên:");
                employees[i].inputData(scanner);
                System.out.println("Đã cập nhật thông tin nhân viên.");
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên có mã: " + updateId);
    }

    private static void deleteEmployee(Scanner scanner) {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String deleteId = scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getId().equalsIgnoreCase(deleteId)) {
                for (int j = i; j < numEmployees - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                numEmployees--;
                System.out.println("Đã xóa nhân viên có mã: " + deleteId);
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên có mã: " + deleteId);
    }
}
