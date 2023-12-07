package Section8_InheritancePolymorphism.Knowledge.static_final;

public class RikkeiAcademy {
    public static int countView = 0;

    public void visited() {
        countView++;
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
