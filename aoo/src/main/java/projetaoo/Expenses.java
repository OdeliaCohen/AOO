package projetaoo;
import java.util.Date;
public class Expenses {

    private String id;
    private float amountToSpend;
    private float amountSpent;
    private Date spendDay;

    public Expenses(String id, float amountToSpend, float amountSpent, Date spendDay) {
        this.id = id;
        this.amountToSpend = amountToSpend;
        this.amountSpent = amountSpent;
        this.spendDay = spendDay;
    }

    public boolean gererDepense(float amountSpent){
        if(amountSpent <= amountToSpend){ // if the amount spent is less than or equal to the amount to spend
            this.amountSpent += amountSpent;
            return true;
        }
        return false;
    }
    public float calculerDepenseJour(){
        return amountSpent;
    }
    
}
