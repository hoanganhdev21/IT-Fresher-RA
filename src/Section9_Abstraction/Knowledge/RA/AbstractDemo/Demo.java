package Section9_Abstraction.Knowledge.RA.AbstractDemo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng gián tiếp từ lớp trừu tượng
        AbstractClassDemo acd = new AbstractClassDemo() {
            @Override
            public void inputData(Scanner scanner) {
                System.out.println("Triển khai phương thức trừu tượng inputData");
            }

            @Override
            public void displayData() {
                System.out.println("Triển khai phương thức trừu tượng displayData");
            }
        };
        acd.displayData();
        acd.add(5,7);
    }
}
