package code;

import operations.Client;
import operations.account.Account;
import operations.cash.PayBox;

public class Operations {

    public static void main(String[] args) {

        Account clientsAccount = new Account();

        PayBox cashMachine = new PayBox();
        cashMachine.setClientsAccount(clientsAccount);

        Client client = new Client();

        client.setCashMachine( cashMachine );

//        Operations
        System.out.println("Client pays into 5000 EUR");
        client.payInto( 5000.0 ) ;

        System.out.println("Client draws out 3000 EUR");
        client.drawOut( 3000.0 );
        System.out.println("Client tries to draw out 3000 EUR");
        client.drawOut( 3000.0 );



    }
}
