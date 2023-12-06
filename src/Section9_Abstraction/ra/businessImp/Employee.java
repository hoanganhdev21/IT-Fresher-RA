package Section9_Abstraction.ra.businessImp;

import Section9_Abstraction.ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    // Constructor and getter/setter

    public Employee(){

    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner){
        System.out.print("Nhập mã nhân viên: ");
        id = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        name = scanner.nextLine();
        System.out.print("Nhập năm sinh nhân viên: ");
        year = scanner.nextInt();
        System.out.print("Nhập hệ số lương nhân viên: ");
        rate = scanner.nextFloat();
        System.out.print("Nhập hoa hồng hàng tháng của nhân viên: ");
        commission = scanner.nextFloat();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Nhập trạng thái nhân viên (true - đang làm việc, false - nghỉ việc): ");
        if (scanner.nextBoolean()) status = true;
        else status = false;
    }

    @Override
    public void displayData(){
        System.out.println("Mã nhân viên: " + id);
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Năm sinh: " + year);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Hoa hồng hàng tháng: " + commission);
        System.out.println("Lương hàng tháng: " + salary);
        System.out.println("Trạng thái: " + (status ? "Đang làm việc" : "Nghỉ việc"));
    }

    public void calSalary() {
        salary = rate * IEmployee.BASIC_SALARY + commission;
    }
}
