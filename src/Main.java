import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank myBank = createBank("OTP", "Somewhere");
        addCustomers(myBank);
        System.out.println(myBank);

    }


    static public Bank createBank(String name, String address) {
        Bank firstBank = new Bank(name, address);
        return firstBank;

    }

    static public void addCustomers(Bank bankName) {
        ArrayList<Customer> generatedCustomers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Customer newCustomer = new Customer(new Person("Person name " + i, "Person lastName " + i, 14 + i), new Account());
            generatedCustomers.add(newCustomer);
        }
        bankName.bankCustomers = generatedCustomers;


    }
}
