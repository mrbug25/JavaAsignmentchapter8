package E82;

public class CashRegister {
    public double payment;
    double remainingAmount;

    public  CashRegister(){
        payment = 0;
    }
    public void receivePayment(int coinCount, Coin coinType){

        payment = payment + coinCount * coinType.getValue();
    }

    public double getPayment() {
        return payment;
    }

    public double calculateRemainingAmount(double purchase){
        remainingAmount = payment - purchase;
        remainingAmount = Math.round(remainingAmount*100)/100.0;//calculate only 2 points after decimal
        return remainingAmount;

    }
    public int giveChange(Coin coinType){
        int changeCoin = (int)(remainingAmount / coinType.getValue());
        remainingAmount = remainingAmount % coinType.getValue();
        remainingAmount = Math.round(remainingAmount*100)/100.0;//calculate only 2 points after decimal

        return changeCoin;
    }
}
