package Section7_StringRegex.Knowledge.Knowledge;

public class StringDemo {
    public static void main(String[] args) {
        //1. Khai báo chuỗi String Literal (immutable)
        String str1 = "Rikkei Academy";
        //2. Khai báo chuỗi sử dụng new
        String str2 = new String("Rikkeisoft");
        //3. int length(): Trả về độ dài chuỗi
        System.out.println("Độ dài chuỗi str1 là: " + str1.length());
        //4. char chartAt(int index): Trả về ký tự tại chỉ số index
        System.out.println("Ký tự ở chỉ số 2 trong chuỗi str1: " + str1.charAt(2));
        //5. String concat(String str): Nối chuỗi
        System.out.println("Nối chuỗi: " + str1.concat(" - Học viện đào tạo CNTT"));
        //6. String toUpperCase(): viết hoa
        System.out.println("Viết hoa chuỗi: " + str1.toUpperCase());
        //7. String toLowerCase(): viết thường
        System.out.println("Viết thường chuỗi:" + str1.toLowerCase());
        System.out.println("Chuỗi str1: " + str1);//str1: Rikkei Academy
        //8. String trim(): cắt khoảng trắng 2 đầu
        String str3 = "   Rikkei          ";
        System.out.println("Cắt khoảng trắng 2 đầu: " + str3.trim());
        //9. boolean equals(String str): So sánh 2 chuỗi
        String str4 = new String("Rikkei Academy");
        String str5 = "Rikkei Academy";
        String str6 = new String("Rikkei aCaDemy");
        System.out.println("So sánh chuỗi str1 và str4 với equals: " + str1.equals(str4));
        System.out.println("So sánh chuỗi str1 và str4 với ==: " + (str1 == str4));
        System.out.println("So sánh chuỗi str1 và str5 với ==: " + (str1 == str5));
        System.out.println("So sánh chuỗi str4 và str6 với ==: " + (str4 == str6));
        //10. boolean equalsIgnoreCase(String str): so sánh 2 chuỗi ko phân biệt hoa thường
        System.out.println("So sánh chuỗi str4 và str6 với equals: " + str4.equals(str6));
        System.out.println("So sánh chuỗi str4 và str6 với equalIgnoreCase: " + str4.equalsIgnoreCase(str6));
        //11. int compareTo(String str): So sánh 2 chuỗi
        System.out.println("So sánh chuỗi str1 và str6 với compareTo: " + str1.compareTo(str6));
        //12. int compareToIgnoreCase(String str): so sánh 2 chuỗi ko phân biệt hoa thường
        System.out.println("So sánh chuỗi str1 và str6 với compartToIgnoreCase: " + str1.compareToIgnoreCase(str6));
        //13. boolean contains(String str): kiểm tra str có nằm trong chuỗi ko
        System.out.println("Kiểm tra trong chuỗi str1 có chứa chuỗi cademy không: " + str1.contains("cademy"));
        //14. int indexOf(String str): Trả về chỉ số của str trong chuỗi
        System.out.println("Chỉ số của cademy trong str1: " + str1.indexOf("cademy"));
        //15. String replace(String oldStr, String newStr): thay thế chuỗi oldStr bằng newStr
        System.out.println("Thay thế chuỗi Academy thành học viện: " + str1.replace("Academy", "Học viện"));
        //16. boolean startWith(String prefix): Kiểm tra chuỗi có bắt đầu là prefix hay không
        System.out.println("Kiểm tra str1 có bắt đầu là Rikkei không: " + str1.startsWith("Rikkei"));
        System.out.println("Kiểm tra str1 có kết thúc là Academy không: " + str1.endsWith("Academy"));
        //17. String[] split("String regex"): Cắt chuỗi
        String str7 = "Học viện Rikkei";
        String[] arrStr = str7.split(" ");
        for (String element : arrStr) {
            System.out.println(element);
        }
        //18. String substring(int begin): Cắt chuỗi từ chỉ số begin đến cuối
        System.out.println("Cắt chuỗi từ chỉ số 7 đến cuối: "+str1.substring(7));
        //19. String substring(int begin, int end): cắt chuỗi từ begin đến <end
        System.out.println("Cắt chuỗi từ chỉ số 7 đến 10: "+str1.substring(7,10));
    }

}