package Section7_StringRegex.Knowledge.Knowledge;

import Section7_StringRegex.Knowledge.Knowledge.Watch;

public class StringPerformance {
    public static void main(String[] args) {
        String str = "";
        Watch watch = new Watch();
        watch.start();
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        System.out.println("Thời gian thực hiện String: " + watch.end());
        StringBuffer sbuffer = new StringBuffer("");
        watch.start();
        for (int i = 0; i < 1000000; i++) {
            sbuffer.append(i);
        }
        System.out.println("Thời gian thực hiện StringBuffer: "+watch.end());
        StringBuilder sBuilder = new StringBuilder("");
        watch.start();
        for (int i = 0; i < 1000000; i++) {
            sBuilder.append(i);
        }
        System.out.println("Thời gian thực hiện StringBuilder: "+watch.end());
    }
}
