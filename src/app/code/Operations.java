package app.code;

import app.operations.Client;
import app.operations.account.Account;
import app.operations.cash.PayBox;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Operations {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Client client = context.getBean(Client.class);


//        Operations
        System.out.println("Client pays into 5000 EUR");
        client.payInto( 5000.0 ) ;

        System.out.println("Client draws out 3000 EUR");
        client.drawOut( 3000.0 );
        System.out.println("Client tries to draw out 3000 EUR");
        client.drawOut( 3000.0 );



    }
}
