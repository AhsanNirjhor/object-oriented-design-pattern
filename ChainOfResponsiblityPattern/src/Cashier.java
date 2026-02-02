public class Cashier extends AuthorizationHandler {

    @Override
    public void authorize(double amount) {
        if (amount <= 10000) {
            System.out.println("Cashier authorized the transaction of $" + amount + ". withdraw done");
        } else {
            if (nextHandler != null) {
            System.out.println("Cashier  authorized the transaction.");
            nextHandler.authorize(amount);
            } 
        }
    }

}
