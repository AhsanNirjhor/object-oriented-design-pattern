public class SeniorOfficer extends AuthorizationHandler {

    @Override
    public void authorize(double amount) {
        if (amount > 10000 && amount <= 1000000) {
            System.out.println("Senior Officer authorized the transaction of $" + amount + ". withdraw done");
        } else {
            if (nextHandler != null) {
                System.out.println("Senior Officer authorized the transaction.");
                nextHandler.authorize(amount);
            } 
        }
    }

}
