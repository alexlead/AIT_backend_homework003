package app.operations;

import app.operations.cash.PayBox;

public class Client {

    private PayBox cashMachine;

    public PayBox getCashMachine() {
        return cashMachine;
    }

    public void setCashMachine(PayBox cashMachine) {
        this.cashMachine = cashMachine;
    }

    public void payInto ( double amount) {
        cashMachine.payInto( amount );
    }

    public void drawOut (double amount ) {
        cashMachine.drawOut(amount);
    }
}
