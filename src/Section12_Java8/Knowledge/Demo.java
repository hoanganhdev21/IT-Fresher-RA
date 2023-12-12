package Section12_Java8.Knowledge;

public class Demo {
    public static void main(String[] args) {
        //Cách 1: Khởi tạo đối tượng từ constructor
        SayHello hello = new Hello("Rikkei Academy");
        hello.display("Rikkei");
        //Cách 2: Sử dụng Method Reference
        SayHello helloRef = Hello::new;
        helloRef.display("Rikkeisoft");
    }
}
