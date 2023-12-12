package Section12_Java8.Knowledge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 22);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 25);
        Student student4 = new Student("SV004", "Nguyễn Văn G", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 22);
        Student student6 = new Student("SV006", "Nguyễn Văn F", 22);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        listStudent.add(student6);
        //Tạo Stream --> Xử lý trung gian (xử lý trên stream) --> Thực hiện thao tác đầu cuối
        //1. In ra các sinh viên có tuổi lớn hơn 22
        listStudent.stream().filter(student -> student.getAge() > 22).forEach(System.out::println);
        //2. Lấy danh sách sinh viên có tuổi nhỏ hơn 22
        List<Student> listStudentFilter = listStudent.stream()
                .filter(student -> student.getAge() < 22).collect(Collectors.toList());
        //3. In ra các sinh viên từ sinh viên thứ 3
        listStudent.stream().skip(2).forEach(System.out::println);
        //4. In ra 4 sinh viên đầu
        System.out.println("4 sinh viên đầu:");
        listStudent.stream().limit(4).forEach(System.out::println);
        //5. In ra thông tin sinh viên với tuổi x2
        System.out.println("Nhân đôi tuổi sinh viên:");
        listStudent.stream().map(student -> student.getAge() * 2).forEach(System.out::println);
        //6. Sắp xếp sinh viên theo tuổi tăng dần và in ra
        System.out.println("Sắp xếp sinh viên theo tuổi tăng dần:");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        System.out.println("Sắp xếp sinh viên theo tuổi giảm dần:");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
        System.out.println("Sắp xếp sinh viên theo tuổi tăng dần và tên giảm dần:");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge)
                        .thenComparing(Comparator.comparing(Student::getStudentName).reversed()))
                .forEach(System.out::println);
        //7. Kiểm tra trong danh sách sinh viên có sinh viên tuổi lẻ hay không
        boolean isStudentOdd = listStudent.stream().anyMatch(student -> student.getAge()%2==1);
        System.out.println("Kết quả: "+isStudentOdd);
        //8. Kiểm tra trong danh sách sinh viên có phải tên sinh viên của tất cả SV bắt đầu là Nguyễn
        System.out.println("Kết quả: "+listStudent.stream()
                .allMatch(student -> student.getStudentName().startsWith("Nguyễn")));
        //9. Đếm số sinh viên có tuổi bằng 22
        long cntStudent = listStudent.stream().filter(student -> student.getAge()==22).count();
        System.out.println("Số sinh viên có tuổi 22: "+cntStudent);
        //10. In ra sinh viên có tuổi lớn nhất
        System.out.println("Thông tin sinh viên có tuổi lớn nhất:");
        listStudent.stream().max(Comparator.comparing(Student::getAge)).stream().forEach(System.out::println);
        //11. Tính tổng tuổi của các sinh viên
        int total = listStudent.stream().reduce(0,(sum, student) -> sum+student.getAge(),Integer::sum);
        System.out.println("Tổng tuổi các sinh viên: "+total);
        double avgAge = listStudent.stream().mapToInt(Student::getAge).summaryStatistics().getAverage();
        System.out.println("Tuổi trung bình: "+avgAge);
    }
}
