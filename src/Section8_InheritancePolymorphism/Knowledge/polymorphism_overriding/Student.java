package Section8_InheritancePolymorphism.Knowledge.polymorphism_overriding;

public class Student extends Person{
    //Thuộc tính riêng
    private float mark;
    private String className;
    //Constructor riêng
    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        super(id, name, age, address);
    }

    public Student(int id, String name, int age, String address, float mark, String className) {
        super(id, name, age, address);
        this.mark = mark;
        this.className = className;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @Override
    public void inputData() {
        System.out.println("input data to student object");
    }
}
