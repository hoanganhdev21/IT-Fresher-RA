package Section8_InheritancePolymorphism.Knowledge.polymorphism_overloading;

public class Student {
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public void test(int a, String b) {

    }

    public void test(String b, int a) {

    }
}
