package Section8_InheritancePolymorphism.Knowledge.static_final;

public class WebMain {
    public static void main(String[] args) {
        RikkeiAcademy guest1 = new RikkeiAcademy();
        guest1.visited();
        System.out.println("Số lượt view: "+RikkeiAcademy.countView);
        RikkeiAcademy guest2 = new RikkeiAcademy();
        guest2.visited();
        System.out.println("Số lượt view: "+RikkeiAcademy.countView);
        RikkeiAcademy guest3 = new RikkeiAcademy();
        guest3.visited();
        System.out.println("Số lượt view: "+RikkeiAcademy.countView);
        System.out.println("Tổng 2 số 5 và 7 là: "+guest1.addTwoNumbers(5,7));
        System.out.println("Tổng 2 số 5 và 7 là: "+guest2.addTwoNumbers(5,7));
        System.out.println("Tổng 2 số 5 và 7 là: "+RikkeiAcademy.addTwoNumbers(5,7));
    }
}
