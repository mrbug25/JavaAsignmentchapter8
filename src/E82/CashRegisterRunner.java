package E82;

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



        double remainingAmount = cashRegister.calculateRemainingAmount(1);
        System.out.println("Remaining amount is : " + remainingAmount);
        System.out.println("Quarter = " + cashRegister.giveChange(quarter));
        System.out.println("Dime = " + cashRegister.giveChange(dime));
        System.out.println("Nickel = " + cashRegister.giveChange(nickel));
        System.out.println("Penny = " + cashRegister.giveChange(penny));
    }
}
