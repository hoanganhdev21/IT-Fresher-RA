package section3;

public class ForDemo {
    public static void main(String[] args) {
        //1.In ra cac so chan tu 1-10
        System.out.println("Cac so chan trong khoang 1-10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.printf("\n");
        //2.In ra cac so le giam dan trong khoang 10-1
        System.out.println("Cac so le trong khoang 10-1 giam dan:");
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.printf("\n");
        //3. In ra cac so chan bat dau tu 2 va nho hon 50, khong duoc su dung if
        System.out.println("Cac so chan tu 2 va nho hon 50:");
        for (int i = 2; i < 50; i += 2) {
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");
        //4. Su dung vong for tim diem trung binh trong khoang 1-10
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {

        }
        System.out.println("Diem trung binh trong khoang 0-10 la: " + i);
        //5. Vong for duoc su dung khi biet truoc so lan lap
        //6. In ra cac so chia het cho 3 va 5, tinh tong cac so do biet so do nam trong khoang 1-100
        int sum = 0;
        System.out.println("Cac so chia het cho 3 va 5 trong khoang 1-100:");
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.printf("%d\t", k);
                sum += k;
            }
        }
        System.out.printf("\n");
        System.out.println("Tong cac so chia het cho 3 va 5 la: " + sum);
    }
}

