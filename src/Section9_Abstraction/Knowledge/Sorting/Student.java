package Section9_Abstraction.Knowledge.Sorting;

public class Student implements Comparable<Student> {
    private String studentId;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

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

    @Override
    public int compareTo(Student student) {
        //So sánh đối tượng hiện tại với các đối tượng khác
        return this.age - student.getAge();
    }

    public String toString() {
        return "StudentID: " + this.studentId + " - StudentName: " + this.studentName + " - Age: " + this.age;
    }

}
