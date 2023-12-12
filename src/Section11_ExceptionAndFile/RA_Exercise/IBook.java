package Section11_ExceptionAndFile.RA_Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface IBook {
    void inputData(Scanner scanner) throws Exception;
    void inputData();
    void displayData();
}
