package Section7_StringRegex.Knowledge.Knowledge;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi StringBuilder
        StringBuilder sb = new StringBuilder("Rikkei Academy");
        //2. Nối chuỗi
        System.out.println("Nối chuỗi: "+sb.append(" - Học viện đào tạo CNTT"));
        //3. Chèn chuỗi vào chuỗi
        System.out.println("Chèn chuỗi: "+sb.insert(6,"soft"));
        //4. Xóa
        System.out.println("Xóa chuỗi: "+sb.delete(8,14));
        //5. Đảo ngược chuỗi
        System.out.println("Đảo ngược: "+sb.reverse());
    }
}
