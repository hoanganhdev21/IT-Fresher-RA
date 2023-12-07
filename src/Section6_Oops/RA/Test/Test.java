package Section6_Oops.RA.Test;

/*
 * 1. Xây dựng lớp Book trong package ra_exercise.entity gồm các thông tin sau:
 *   - Thuộc tính: mã sách, tên sách, giá nhập, giá xuất, tiêu đề, tác giả, nhà xuất bản
 *   - Có 2 constructor: không tham số và đầy đủ tham số khởi tạo tất cả thông tin sách
 *   - Phương thức:
 *       + inputData(Scanner scanner): Nhập các thông tin sách (trừ giá xuất)
 *       + displayData(): Hiển thị tất cả thông tin sách
 *       + calExportPrice(): Tính giá xuất theo công thức: exportPrice = importPrice*1.2;
 * 2. Xây dựng lớp BookManagement trong package ra_exercise.run thực hiện:
 *   - Khai báo mảng gồm 100 sách
 *   - Hiển thị menu và thực hiện các chức năng theo menu:
 *   *********************MENU*************************
 *   1. Nhập số lượng sách (n) và nhập thông tin n sách (lưu vào mảng)
 *   2. Hiển thị tất cả sách đang quản lý
 *   3. Tính giá xuất của các sách đang quản lý
 *   4. Sắp xếp sách theo giá nhập tăng dần
 *   5. Tìm kiếm sách theo tên sách
 *   6. Thoát
 * */

import Section6_Oops.RA.OOP.Students;

public class Test {
    public static void main(String[] args) {

        Students students = new Students();
    }
}

