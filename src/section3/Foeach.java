package section3;

public class Foeach {
    public static void main(String[] args) {
        int[] arrInt = {1, 3, 5, 7, 9};
        //In cac phan tu trong mang
        System.out.println("Gia tri cac phan tu trong mang la:");
        for (int element : arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.println();
    }
}
