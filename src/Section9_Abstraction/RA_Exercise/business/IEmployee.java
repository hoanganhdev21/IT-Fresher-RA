package Section9_Abstraction.RA_Exercise.business;

import Section9_Abstraction.RA_Exercise.businessImp.Employee;
import java.util.Scanner;

public interface IEmployee {
    float BASIC_SALARY = 1300000;

    void inputData(Scanner scanner);

    void displayData();

    int compareTo(Employee other);
}
