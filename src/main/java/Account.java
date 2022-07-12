import java.time.LocalDate;

public class Account {

    Statement statement;
    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(int amount,String date) {
        statement.changeBalance(amount,date);
    }

    void withdrawal(int amount,String date){
        statement.changeBalance(-amount, date);
    }

    void printStatements() {
        statement.extractStatement();
    }

    @Override
    public String toString() {
        return "Account{" +
                "statement=" + statement +
                '}';
    }
}
