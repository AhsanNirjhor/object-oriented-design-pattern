public class App {
    public static void main(String[] args) throws Exception {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.showMessage();
        db2.showMessage();
    }
}
