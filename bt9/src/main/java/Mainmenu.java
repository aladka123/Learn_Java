import java.util.ArrayList;
import java.util.Scanner;

public class Mainmenu {
    public void choiceMenu(ArrayList<Customer> listCustomer){
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        boolean isContinue = false;
        while (!isContinue){
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    service.printCustomer(listCustomer);
                    break;
                case 2:
                    service.searchCustomer(listCustomer);
                    break;
                case 3:
                    service.addNewCustomer(listCustomer);
                    break;
                case 4:
                    service.findCustomerID(listCustomer);
                    break;
                case 0:
                    isContinue = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Khong co lua chon nay");


            }
        }
    }
    public static void menu(){
        System.out.println("Ban co the thuc hien: ");
        System.out.println("1 - Xem toan bo thong tin khach hang: ");
        System.out.println("2 - Xem thong tin khach hang Nam/Nu: ");
        System.out.println("3 - Xem thong tin 1 khach hang moi: ");
        System.out.println("4 - Tim thong tin khach hang theo ID: ");
        System.out.println("0 - Dung chuong trinh ");
        System.out.println("Lua chon cua ban: ");
    }
}
