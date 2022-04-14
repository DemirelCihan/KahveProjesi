import java.util.Date;

public class Main {
    public static void main(String[] args) {
BaseCustomerManager customerManager = new StarbucksCustomerManager();
customerManager.Save(new Customer(3,"cihan","demir","02,03,97","123456789"));

    }
}

