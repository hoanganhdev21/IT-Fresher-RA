package Section12_Java8.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(5);
        listInt.add(7);
        listInt.add(9);
        //in ra các phần tử của mảng
        //Cách 1: Sử dụng vòng lặp
        System.out.println("Sử dụng vòng lặp:");
        for (int element : listInt) {
            System.out.println(element);
        }

        //Cách 2: sử dụng foreach của Collection
        System.out.println("Sử dụng biểu thức lambda");
        listInt.forEach(element-> System.out.println(element));

        System.out.println("Sử dụng biểu thức lambda và method reference:");
        listInt.forEach(System.out::println);

    }
}
