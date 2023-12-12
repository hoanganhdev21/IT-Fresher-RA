package Section12_Java8.Knowledge;

public class Hello implements SayHello{
    public Hello(String content) {
    }

    @Override
    public void display(String content) {
        System.out.println(content);
    }
}
