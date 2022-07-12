import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Statement {
    private String date;
    private List listDates = new ArrayList();
    private List listCredit = new ArrayList();
    private List listDebit = new ArrayList();
    private List listBalance = new ArrayList();
    private int balance = 0;

    public Statement() {
    }

    public void changeBalance(int amount, String date){
        balance += amount;
        listDates.add(date);
        listCredit.add(amount);
        listDebit.add(0);
        listBalance.add(balance);
        if(amount<0){
            int lastIndice = listCredit.size()-1;
            listCredit.remove(lastIndice);
            listDebit.remove(lastIndice);
            listCredit.add(0);
            listDebit.add(amount);
        }
    }

    public void extractStatement(){

        System.out.print("Date\t\t|\tCredit\t\t|\tDebit\t\t\t|\t  Balance\n");

        for(int indice = 0; indice<listBalance.size(); indice++){
            System.out.print(listDates.get(indice)+"\t|\t"+listCredit.get(indice)+"   \t\t|\t"
            +listDebit.get(indice)+"   \t\t\t|\t\t"+listBalance.get(indice)+"\n");

        }

    }

    @Override
    public String toString() {
        return "Statement{" +
                "date='" + date + '\'' +
                ", listDates=" + listDates +
                ", listCredit=" + listCredit +
                ", listDebit=" + listDebit +
                ", listBalance=" + listBalance +
                ", balance=" + balance +
                '}';
    }
}
