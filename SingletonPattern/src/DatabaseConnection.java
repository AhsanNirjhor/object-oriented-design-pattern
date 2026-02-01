public class DatabaseConnection {
    private static DatabaseConnection instance ;
    private DatabaseConnection(){
        System.out.println("DatabaseConnection instance created.");
    } ;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void showMessage(){
      System.out.println("Database connected on instance " + instance);
   }
}
