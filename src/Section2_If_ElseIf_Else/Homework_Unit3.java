package Section2_If_ElseIf_Else;

public class Homework_Unit3 {
    public static void hienThiSoNguyenTo() {
        for (int i = 2; i < 100; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
