package Section9_Abstraction.ra_exercise.business;

import Section9_Abstraction.ra_exercise.businessImp.Employee;
import java.util.Scanner;

public interface IEmployee {
    float BASIC_SALARY = 1300000;

    void inputData(Scanner scanner);

    void displayData();

    int compareTo(Employee other);
}
