package Section7_StringRegex.Knowledge.Knowledge;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String regex = "[0-9]fresher";
        String inputStr = "afresher";
        boolean result = Pattern.matches(regex,inputStr);
        System.out.println("Kết quả: "+result);
        String regexDate = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        String inputDate = "23/04/1984";
        System.out.println("kết quả định dạng date: "+Pattern.matches(regexDate,inputDate));
    }
}
