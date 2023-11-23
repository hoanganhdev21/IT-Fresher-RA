package input_output;

public class OutputDemo {
    public static void main(String[] args) {
        //1. In ra chuỗi Rikkei Academy, in xong không xuống dòng
        System.out.print("Rikkei Academy ");
        //2. In ra chuỗi Xin chào các bạn lớp IT-Fresher, in xong xuống dòng
        System.out.println("xin chào các bạn lớp IT-Fresher");
        //3. Khai báo và khơi tạo giá trị biến tên sinh viên và tuổi sinh viên và in ra
        String studentName = "Nguyễn Văn A";
        int age = 20;
        //System.out.printf("Control String",value1,value2...)
        //Control String: Chuỗi điều khiển chứa các định dạng dữ liệu cần in
        //value1,value2....: trong chuỗi điều khiển có bao nhiêu định dạnh thì phải truyền từng đó giá trị tương ứng
        System.out.printf("Sinh viên tên: %s có %d tuổi\n",studentName,age);

    }
}
