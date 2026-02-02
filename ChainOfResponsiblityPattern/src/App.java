public class App {
    public static void main(String[] args) throws Exception {
        AuthorizationHandler cashier = new Cashier();
        AuthorizationHandler seniorOfficer = new SeniorOfficer();
        AuthorizationHandler manager = new Manager();

        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        double[] transactionAmounts = {5000, 50000, 500000, 5000000};

        for (double amount : transactionAmounts) {
            System.out.println("Requesting authorization for transaction of $" + amount);
            cashier.authorize(amount);
            System.out.println();
        }
    }
}
