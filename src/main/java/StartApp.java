public class StartApp {

    public static void main(String[] args) {

        Account account = new Account(new Statement());

        account.deposit(1000, "10/01/2021");
        account.deposit(2000, "13/01/2021");
        account.withdrawal(500, "14/01/2021");

        account.printStatements();

    }
}
