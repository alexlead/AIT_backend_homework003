package operations.cash;

import operations.account.Account;

public class PayBox {

    private Account clientsAccount;

    public Account getClientsAccount() {
        return clientsAccount;
    }

    public void setClientsAccount(Account clientsAccount) {
        this.clientsAccount = clientsAccount;
    }

    public void payInto ( double amount) {
        System.out.println("Payment is accepted.");
        this.clientsAccount.encreaseCurrentAccountAmount( amount );
        this.clientsAccount.printCurrentAccountAmount();

    }

    public void drawOut (double amount ) {
        boolean accountStatus = this.clientsAccount.decreaseCurrentAccountAmount( amount );

        if (accountStatus == true) {
            System.out.println("Operation is completed. Please dor't forget to take your money");
        } else {
            System.out.println("I haven't enough money for ths operation.");
        }
            this.clientsAccount.printCurrentAccountAmount();
    }

}
