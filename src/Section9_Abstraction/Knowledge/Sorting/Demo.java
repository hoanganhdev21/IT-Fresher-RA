package Section9_Abstraction.Knowledge.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Student[] arrStudents = new Student[3];
        arrStudents[0] = new Student("SV001", "Nguyễn Văn A", 25);
        arrStudents[1] = new Student("SV002", "Nguyễn Văn C", 21);
        arrStudents[2] = new Student("SV003", "Nguyễn Văn B", 27);
        //Sắp xếp arrStudent theo tuổi tăng dần với Comparable Interface
        //Bước 1: Student kế thừa Comparable
        //Bước 2: Ghi đè phương thức int compareTo(Object obj) để cài đặt sắp xếp theo tuổi tăng dần
        //Bước 3: Sử dụng Collections.sort() để sắp xếp
        Collections.sort(Arrays.asList(arrStudents));
        System.out.println("Mảng sau khi sắp xếp theo tuổi tăng dần:");
        for (Student st : arrStudents) {
            System.out.println(st.toString());
        }
        //Sắp xếp arrStudent theo tên tăng dần sử dụng Comparator Interface
        //Bước 1: Sử dụng Collections.sort để sắp xếp
        //Bước 2: Khởi tạo đối tượng Comparator
        //Bước 3: Triển khai phương thức int compare(Object obj1, Object obj2)
        Collections.sort(Arrays.asList(arrStudents), new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getStudentName().compareTo(t1.getStudentName());
            }
        });
        System.out.println("Mảng sau khi sắp xếp theo tên tăng dần:");
        for (Student st : arrStudents) {
            System.out.println(st.toString());
        }
        System.out.println("Mảng sau khi sắp xếp xêp theo tên giảm dần");
        Collections.sort(Arrays.asList(arrStudents), new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return -student.getStudentName().compareTo(t1.getStudentName());
            }
        });
        for (Student st : arrStudents) {
            System.out.println(st.toString());
        }
    }
}
