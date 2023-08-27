package E81;
public class CashRegisterRunner {
    public static void main(String[] args) {

        Coin quarter = new Coin(0.25,"Quarter");
        Coin dime = new Coin(0.1,"Dime");
        Coin nickel = new Coin(0.05,"Nickel");
        Coin penny = new Coin(0.01,"Penny");

        CashRegister cashRegister = new CashRegister();


        cashRegister.receivePayment(3,quarter);
        cashRegister.receivePayment(20,dime);
        cashRegister.receivePayment(3,nickel);
        cashRegister.receivePayment(1,penny);



        double coinInput = cashRegister.getPayment();
        System.out.printf("Total input coin amount is %.2f" , coinInput);
    }
}
