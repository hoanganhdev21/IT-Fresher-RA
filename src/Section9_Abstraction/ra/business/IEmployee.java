package Section9_Abstraction.ra.business;

import Section9_Abstraction.ra.businessImp.Employee;
import java.util.Scanner;

public interface IEmployee {
    float BASIC_SALARY = 1300000;

    void inputData(Scanner scanner);

    void displayData();

    int compareTo(Employee other);
}
