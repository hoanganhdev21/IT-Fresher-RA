package Section11_ExceptionAndFile.Knowledge.File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001","Nguyễn Văn A",20);
        Student student2 = new Student("SV002","Nguyễn Văn B",25);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        writeDataToFile(listStudent);
        List<Student> listStudentRead = readDataFromFile();
        if (listStudentRead==null){
            System.err.println("Có lỗi trong quá trình đọc file");
        }else{
            System.out.println("Thông tin sinh viên vừa đọc:");
            listStudentRead.forEach(student -> System.out.println(student));
        }
    }

    //Ghi dữ liệu ra file
    public static void writeDataToFile(List<Student> listStudent){
        //1. Khởi tạo file
        File file = new File("demo.txt");
        //2. Khởi tạo đối tượng FileOutputStream
        //3. Khởi tạo đối tượng ObjectOutputStream
        //4. Ghi dữ liệu ra file - writeObject
        //5. Đẩy dữ liệu từ stream ra file - fflush
        //6. Đóng file
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudent);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static List<Student> readDataFromFile(){
        //1. Khởi tạo file
        //2. Khởi tạo FileInputStream
        //3. Khởi tạo ObjectInputStream
        //4. Đọc dữ liệu - readObject()
        //5. Đóng file
        List<Student> listStudentRead = null;
        File file = new File("demo.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            listStudentRead = (List<Student>) ois.readObject();
            return listStudentRead;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }
}
