//package Section6_Oops.RA.Run;
//
//import ra_exercise.entity.Book;
//
//import java.util.Scanner;
//
//public class BookManagement {
//    public class BookManagerment {
//        public static void main(String[] args) {
//            // Tạo đối tượng scanner
//            Scanner scanner = new Scanner(System.in);
//
//            // Khai báo array 100 sách
//            Book[] books = new Book[100];
//
//            // Variable đếm số lượng sách
//            int bookCount = 0;
//            int opt;
//            do {
//                // Hiển thị MENU
//                System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>>>>>>>>>>>>\n");
//                System.out.println("1. Nhập số lượng sách và thông tin sách");
//                System.out.println("2. Hiển thị tất cả sách đang quản lý");
//                System.out.println("3. Tính giá xuất của các sách");
//                System.out.println("4. Sắp xếp sách theo giá nhập tăng dần");
//                System.out.println("5. Tìm kiếm sách theo tên sách");
//                System.out.println("6. Thoát");
//
//                System.out.println("Nhập lựa chọn của bạn: ");
//                opt = scanner.nextInt();
//
//                switch (opt) {
//                    case 1:
//                        // Nhập số lượng sách và thông tin sách
//                        System.out.println("Nhập số lượng sách (n): ");
//                        int n = scanner.nextInt();
//                        for (int i = 0; i < n; i++) {
//                            books[bookCount] = new Book();
//                            books[bookCount].inputData(scanner);
//                            bookCount++;
//                        }
//                        break;
//                    case 2:
//                        // Hiển thị tất cả sách đang quản lý
//                        for (int i = 0; i < bookCount; i++) {
//                            books[i].displayData();;
//                            System.out.printf("\n<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
//                        }
//                        break;
//                    case 3:
//                        // Tính giá xuất của các sách
//                        for (int i = 0; i < bookCount; i++) {
//
//                        }
//                        break;
//                    case 4:
//                        // Sắp xếp sách theo giá nhập tăng dần
//
//
//                        break;
//                    case 5:
//                        // Tìm kiếm sách theo tên sách
//
//                        break;
//                    case 6:
//                        System.out.println("Chương trình kết thúc.");
//                        break;
//                    default:
//                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//                }
//            } while (opt != 6);
//        }
//    }
//}
