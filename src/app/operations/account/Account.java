package app.operations.account;

public class Account {
    private double currentAccount;

    public Double getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Double currentAccount) {
        this.currentAccount = currentAccount;
    }

    public Account () {
        this.currentAccount = 0.0;
    }

    public Account ( double amount) {
        this.currentAccount = amount;
    }

    public void printCurrentAccountAmount () {
        System.out.println("Your Account Amount: " + this.getCurrentAccount());
    }

    public void encreaseCurrentAccountAmount ( double amount) {
        if ( amount > 0 ) {
            this.setCurrentAccount( this.currentAccount + amount  );
        }
    }

    public boolean decreaseCurrentAccountAmount (double amount ) {

        if ( amount > 0 && amount <= this.currentAccount ) {
            this.setCurrentAccount( this.currentAccount - amount );
            return true;
        }

        return false;
    }

}
