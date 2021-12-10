public class Main {
    public static void main(String[] args) {
        Mainmenu m = new Mainmenu();
        AddCustomer n = new AddCustomer();
        m.choiceMenu(n.getData());
    }
}