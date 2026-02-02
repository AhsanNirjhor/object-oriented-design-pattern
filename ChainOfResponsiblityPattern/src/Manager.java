public class Manager extends AuthorizationHandler {

    @Override
    public void authorize(double amount) {
        if (amount > 1000000) {
            System.out.println("Manager authorized the transaction of $" + amount + ". withdraw done");
        } 
    }
}
