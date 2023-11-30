package Section1_Java.input_output;

public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào các bạn Rikkei IT-Fresher");
        //Datatype - Variable
        //1. Khai báo các biến chứa mã sinh viên và tên sinh viên
        //- Datatype VariableName
        int studentId;
        String studentName;
        //2. Khởi tạo giá trị các biến mã sinh viên là 1, tên sinh viên là Hoàng Thị Thùy
        //- VariableName = value
        studentId = 1;
        studentName = "Hoàng Thị Thùy";
        //3. Khai báo và khởi tạo giá trị các biến chứa tuổi sinh viên, giới tính, số điện thoại, điểm
        //- Datatype VaribleName = value
        int age = 25;
        boolean sex = true;
        String phone = "0355914029";
        float mark = 10;
        //4. Khai báo và khởi tạo giá trị nhiều biến có cùng kiểu dữ liệu
        //-Datatype variable1 = value1, variable2 = value2....
        int number1 = 8, number2 = 9, number3 = 10;
        //5. Khai báo hằng số lương cơ bản là 1.800.000
        //- final Datatype ConstantName = Value
        final double BASIC_SALARY = 1800000;
        //6. Toán tử toán học ++, --
        int numberA = 10;
        int numberB = 10;
        int numberC = numberA++;//numberA = 10, numberC = 11
        int numberD = ++numberB;//numberB = 10, numberD = 10 - Thuy, Hai, Hoang Anh - Con lai 11
        System.out.println("NumberA=" + numberA + " - numberC=" + numberC);
        System.out.println("NumberB=" + numberB + " - numberD=" + numberD);
        //Toan tu &&
        //true && true --> true
        //true && false --> false
        //false && false --> false
        //Toan tu ||
        //true || true --> true
        //true || false --> true
        //false || false --> false
        //Toan tu !
        //!true --> false
        //7. Casting
        float b = 10;//implicit - Ngam dinh
        int a = (int) 5.8F;

    }
}
