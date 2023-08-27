package E81;

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



}
