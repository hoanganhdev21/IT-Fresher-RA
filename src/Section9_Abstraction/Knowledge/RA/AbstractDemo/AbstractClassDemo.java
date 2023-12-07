package Section9_Abstraction.Knowledge.RA.AbstractDemo;

import java.util.Scanner;

public abstract class AbstractClassDemo {
    public AbstractClassDemo() {
    }

    //Non-abstract method
    public int add(int number1, int number2) {
        return number1 + number2;
    }
    //abstract method
    public abstract void inputData(Scanner scanner);
    public abstract void displayData();

}
