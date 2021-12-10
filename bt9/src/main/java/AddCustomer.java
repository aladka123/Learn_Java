import java.time.LocalDate;
import java.util.ArrayList;


public class AddCustomer {
    public ArrayList<Customer> getData(){
     ArrayList<Customer> listCustomer = new ArrayList<>();
    listCustomer.add(new Customer((listCustomer.size()+1),"Tuan", LocalDate.of(1992,1,31), Gender.Male, "Hn", "0903423532", "tuan@gmail.com" ));
    listCustomer.add(new Customer((listCustomer.size()+1),"Tung", LocalDate.of(1996,4,3), Gender.Male, "Hn", "0903246622", "tung@gmail.com" ));
    listCustomer.add(new Customer((listCustomer.size()+1),"My", LocalDate.of(1995,3,5), Gender.Female, "Hn", "0934352345", "mymy@gmail.com" ));
    listCustomer.add(new Customer((listCustomer.size()+1),"Long", LocalDate.of(2000,5,10), Gender.Male, "Bn", "0903789763", "long@gmail.com" ));
    listCustomer.add(new Customer((listCustomer.size()+1),"Linh", LocalDate.of(2002,11,8), Gender.Female, "HCM", "0904556676", "linh@gmail.com" ));
    return listCustomer;
    }
}
