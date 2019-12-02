import java.util.ArrayList;

public class Bank {
    private final String bankName;
    private final String bankAddress;
    ArrayList<Customer> bankCustomers;

    public Bank(String bankName, String bankAddress) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }


}
