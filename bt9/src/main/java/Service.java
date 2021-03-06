import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public void printCustomer(ArrayList<Customer> listCustomer){
        System.out.println("Danh sach toan bo khach hang: ");
        for (Customer c : listCustomer){
            System.out.println(c);
        }
    }
    public void searchCustomer(ArrayList<Customer> listCustomer){
        Mainmenu m = new Mainmenu();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sach khach hang nam: ");
                    for (int i = 0; i < listCustomer.size(); i++){
                        if (listCustomer.get(i).getGender().equals(Gender.Male)){
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sach khach hang nu: ");
                    for (int i = 0; i < listCustomer.size(); i ++){
                        if (listCustomer.get(i).getGender().equals(Gender.Female)){
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sach toan bo khach hang: ");
                    for (Customer c : listCustomer){
                        System.out.println(c);
                    }
                    break;
                case 0:
                    isContinue = true;
                    m.choiceMenu(listCustomer);
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }
    public void addNewCustomer(ArrayList<Customer> listCustomer){
        Gender gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap thong tin: ");
        int id = (listCustomer.size() + 1);
        System.out.println("Nhap ten khach hang: ");
        String name = sc.nextLine();
        System.out.println("Nhap ngay thang nam sinh khach hang: ");
        System.out.println("Ngay: ");
        int day = sc.nextInt();
        System.out.println("Thang: ");
        int month = sc.nextInt();
        System.out.println("Nam: ");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        sc.nextLine();
        System.out.println("Nhap 1 chon gioi tinh Nam va 2 chon gioi tinh Nu: ");
        int i = Integer.parseInt(sc.nextLine());
        if (i == 1) {
            gender = Gender.Male;
        } else {
            gender = Gender.Female;
        }
        System.out.println("Nhap que quan: ");
        String country = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String mobile = sc.nextLine();
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        Customer newCustomer = new Customer(id, name, date, gender, country, mobile, email);
        listCustomer.add(newCustomer);
        System.out.println("Them thanh cong\n" + newCustomer);

    }
    public void findCustomerID(ArrayList<Customer> listCustomer) {
        Scanner sc = new Scanner(System.in);
        Mainmenu m = new Mainmenu();
        System.out.println("Nhap so ID khach hang muon tim kiem: ");
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        boolean isContinue = false;
        for (int i = 0; i < listCustomer.size(); i++){
            if (listCustomer.get(i).getId() == n) {
                count++;
                System.out.println(listCustomer.get(i));
                while (!isContinue){
                    menu1();
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice){
                        case 1:
                            boolean isContinue1 = false;
                            while (!isContinue1) {
                                menu2();
                                int choice1 = sc.nextInt();
                                sc.nextLine();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Nh???p t??n m???i:");
                                        String newName = sc.nextLine();
                                        listCustomer.get(i).setName(newName);
                                        System.out.println("Th??ng tin kh??ch h??ng sau khi thay ?????i t??n: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 2:
                                        System.out.println("Nh???p ng??y, th??ng, n??m sinh m???i:");
                                        System.out.print("Ng??y: ");
                                        int day = sc.nextInt();
                                        System.out.print("Th??ng: ");
                                        int month = sc.nextInt();
                                        System.out.print("N??m: ");
                                        int year = sc.nextInt();
                                        listCustomer.get(i).setDate(LocalDate.of(year, month, day));
                                        System.out.println("Th??ng tin kh??ch h??ng sau khi thay ?????i ng??y th??ng n??m sinh: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 3:
                                        Gender gender = null;
                                        System.out.println("Nh???p gi???i t??nh m???i:");
                                        System.out.println("Nh???p 1 ch???n gi???i t??nh nam v?? s??? kh??c ch???n gi???i t??nh n???: ");
                                        int j = Integer.parseInt(sc.nextLine());
                                        if (j == 1) {
                                            gender = Gender.Male;
                                        } else {
                                            gender = Gender.Female;
                                        }
                                        listCustomer.get(i).setGender(gender);
                                        System.out.println("Th??ng tin kh??ch h??ng sau khi thay ?????i gi???i t??nh: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 4:
                                        System.out.println("Nh???p qu?? qu??n m???i cho kh??ch h??ng:");
                                        String newCountry = sc.nextLine();
                                        listCustomer.get(i).setCountry(newCountry);
                                        System.out.println("Th??ng tin kh??ch h??ng sau khi thay ?????i qu?? qu??n: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 5:
                                        System.out.println("Nh???p S??T m???i cho kh??ch h??ng:");
                                        String newMobile = sc.nextLine();
                                        listCustomer.get(i).setMobile(newMobile);
                                        System.out.println("Th??ng tin kh??ch h??ng sau khi thay ?????i S??T: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 6:
                                        System.out.println("Nh???p Email m???i cho kh??ch h??ng:");
                                        String newEmail = sc.nextLine();
                                        listCustomer.get(i).setEmail(newEmail);
                                        System.out.println("Th??ng tin kh??ch h??ng sau khi thay ?????i Email: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 0:
                                        isContinue1 = true;
                                        m.choiceMenu(listCustomer);
                                        break;
                                }
                            }
                        case 2:
                            listCustomer.remove(i);
                            System.out.println("???? x??a kh??ch h??ng c?? ID: " + n);
                            System.out.println("H??? th???ng t??? ?????ng quay l???i menu ch??nh");
                            m.choiceMenu(listCustomer);
                            break;
                        case 0:
                            isContinue = true;
                            m.choiceMenu(listCustomer);
                            break;
                        default:
                            System.out.println("Kh??ng c?? l???a ch???n n??y");
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Kh??ng c?? ID kh??ch h??ng n??y, h??? th???ng quay l???i menu ch??nh");
        }
    }
    public static void menu() {
        System.out.println("1 - Hi???n thi danh s??ch kh??ch h??ng nam");
        System.out.println("2 - Hi???n thi danh s??ch kh??ch h??ng n???");
        System.out.println("3 - Hi???n thi to??n b??? kh??ch h??ng");
        System.out.println("0 - Quay l???i menu ch??nh");
        System.out.println("L???a ch???n c???a b???n l??: ");
    }

    public static void menu1() {
        System.out.println("1 - Thay ?????i th??ng tin kh??ch h??ng");
        System.out.println("2 - X??a th??ng tin kh??ch h??ng");
        System.out.println("0 - Kh??ng thao t??c g??, quay l???i menu ch??nh");
        System.out.println("L???a ch???n c???a b???n l??: ");
    }

    public static void menu2() {
        System.out.println("1 - Thay ?????i t??n kh??ch h??ng");
        System.out.println("2 - Thay ?????i ng??y th??ng n??m sinh kh??ch h??ng");
        System.out.println("3 - Thay ?????i gi???i t??nh kh??ch h??ng");
        System.out.println("4 - Thay ?????i qu?? qu??n kh??ch h??ng");
        System.out.println("5 - Thay ?????i S??T kh??ch h??ng");
        System.out.println("6 - Thay ?????i email kh??ch h??ng");
        System.out.println("0 - Kh??ng thao t??c g??, quay l???i menu ch??nh");
        System.out.println("L???a ch???n c???a b???n l??: ");
    }
}
