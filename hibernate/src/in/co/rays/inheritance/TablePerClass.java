package in.co.rays.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TablePerClass {

	public static void main(String[] args) {

		CreditCardPayment ccp = new CreditCardPayment();

		ccp.setAmount(1000);

		ccp.setPaymentType("imps");

		ccp.setCcType("visa");

		Cheque ch = new Cheque();

		ch.setAmount(25000);

		ch.setPaymentType("deposite");

		ch.setBankName("BOI");

		ch.setChqNumber("BOI101");

		Cash c = new Cash();

		c.setAmount(2000);
		c.setPaymentType("cash");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
	}

}
