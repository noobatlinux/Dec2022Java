package Week2;

public class CitiBank implements BankingInterface{

    /*
    When implementing an interface in a class,
    All the methods in the interface must be defined
    */

    @Override
    public void AddAccount() {
        System.out.println("Account Added");
    }

    @Override
    public double getAccountBalance() {
        return 0;
    }
}
