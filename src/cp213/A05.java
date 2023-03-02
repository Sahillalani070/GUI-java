package cp213;

import java.awt.GridLayout;
import javax.swing.BorderFactory;

//This is the main class to initiate the program.
//It is recommended that you have implemented main()only in this class, unless otherwise required.

/**
 * 
 * @author Sahil Lalani
 * @version 23-11-2019
 *
 */

public class A05 {

	// Defining Object for A05TextFields
	static A05TextFields screen = new A05TextFields("Enter the Product ID of the Item you want to purchase.");

	public static void main(String[] args) {

		// Button Panel creation
		A05Panels bpanel = new A05Panels("Button Panel");
		bpanel.setLayout(new GridLayout(5, 5, 5, 5));
		bpanel.setBorder(BorderFactory.createEmptyBorder(40, 10, 40, 10));

		// Product Panel creation
		A05Panels ppanel = new A05Panels("Product Panel");
		ppanel.setLayout(new GridLayout(4, 4));
		ppanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 10));

		// Checkout Panel creation
		A05Panels cpanel = new A05Panels("Checkout Panel");
		cpanel.setLayout(new GridLayout(11, 1, 5, 5));
		cpanel.setBorder(BorderFactory.createEmptyBorder(40, 10, 40, 40));

		// A05Labels Instances creation
		A05Labels A0 = new A05Labels("A0");
		A05Labels A1 = new A05Labels("A1");
		A05Labels A2 = new A05Labels("A2");
		A05Labels A3 = new A05Labels("A3");
		A05Labels B0 = new A05Labels("B0");
		A05Labels B1 = new A05Labels("B1");
		A05Labels B2 = new A05Labels("B2");
		A05Labels B3 = new A05Labels("B3");
		A05Labels C0 = new A05Labels("C0");
		A05Labels C1 = new A05Labels("C1");
		A05Labels C2 = new A05Labels("C2");
		A05Labels C3 = new A05Labels("C3");
		A05Labels D0 = new A05Labels("D0");
		A05Labels D1 = new A05Labels("D1");
		A05Labels D2 = new A05Labels("D2");
		A05Labels D3 = new A05Labels("D3");
		A05Labels cash = new A05Labels("CASH");
		A05Labels checkout = new A05Labels("CHECKOUT");

		// A05Buttons Instances creation
		A05Buttons bA = new A05Buttons("A");
		A05Buttons bB = new A05Buttons("B");
		A05Buttons bC = new A05Buttons("C");
		A05Buttons bD = new A05Buttons("D");
		A05Buttons b1 = new A05Buttons("1");
		A05Buttons b2 = new A05Buttons("2");
		A05Buttons b3 = new A05Buttons("3");
		A05Buttons b4 = new A05Buttons("4");
		A05Buttons b5 = new A05Buttons("5");
		A05Buttons b6 = new A05Buttons("6");
		A05Buttons b7 = new A05Buttons("7");
		A05Buttons b8 = new A05Buttons("8");
		A05Buttons b9 = new A05Buttons("9");
		A05Buttons b0 = new A05Buttons("0");
		A05Buttons cancel = new A05Buttons("CANCEL");

		A05Buttons credit = new A05Buttons("CREDIT");
		A05Buttons nickel = new A05Buttons("Nickel (5c)");
		A05Buttons dime = new A05Buttons("Dime (10c)");
		A05Buttons quarter = new A05Buttons("Quarter (25c)");
		A05Buttons one_dollar = new A05Buttons("One Dollar ($1)");
		A05Buttons five_dollar = new A05Buttons("Five Dollar ($5)");
		A05Buttons ten_dollar = new A05Buttons("Ten Dollar ($10)");
		A05Buttons finalize = new A05Buttons("Finalize Payment");

		// A05Listeners Object declarations
		A05Listeners b_li = new A05Listeners("");
		A05Listeners.CancelButtonListener bcancel_li = b_li.new CancelButtonListener();
		A05Listeners.CreditButtonListener bcredit_li = b_li.new CreditButtonListener();
		A05Listeners.NickelButtonListener bnickel_li = b_li.new NickelButtonListener();
		A05Listeners.DimeButtonListener bdime_li = b_li.new DimeButtonListener();
		A05Listeners.QuarterButtonListener bquarter_li = b_li.new QuarterButtonListener();
		A05Listeners.OneBillButtonListener bonebill_li = b_li.new OneBillButtonListener();
		A05Listeners.FiveBillButtonListener bfivebill_li = b_li.new FiveBillButtonListener();
		A05Listeners.TenBillButtonListener btenbill_li = b_li.new TenBillButtonListener();
		A05Listeners.FinalizeButtonListener bfin_li = b_li.new FinalizeButtonListener();

		// ActionListeners to Buttons addition
		bA.addActionListener(b_li);
		bB.addActionListener(b_li);
		bC.addActionListener(b_li);
		bD.addActionListener(b_li);
		b1.addActionListener(b_li);
		b2.addActionListener(b_li);
		b3.addActionListener(b_li);
		b4.addActionListener(b_li);
		b5.addActionListener(b_li);
		b6.addActionListener(b_li);
		b7.addActionListener(b_li);
		b8.addActionListener(b_li);
		b9.addActionListener(b_li);
		b0.addActionListener(b_li);

		cancel.addActionListener(bcancel_li);
		credit.addActionListener(bcredit_li);
		nickel.addActionListener(bnickel_li);
		dime.addActionListener(bdime_li);
		quarter.addActionListener(bquarter_li);
		one_dollar.addActionListener(bonebill_li);
		five_dollar.addActionListener(bfivebill_li);
		ten_dollar.addActionListener(btenbill_li);
		finalize.addActionListener(bfin_li);

		// Labels to Product Panel addition
		ppanel.add(A0);
		ppanel.add(A1);
		ppanel.add(A2);
		ppanel.add(A3);
		ppanel.add(B0);
		ppanel.add(B1);
		ppanel.add(B2);
		ppanel.add(B3);
		ppanel.add(C0);
		ppanel.add(C1);
		ppanel.add(C2);
		ppanel.add(C3);
		ppanel.add(D0);
		ppanel.add(D1);
		ppanel.add(D2);
		ppanel.add(D3);

		// Buttons to Button Panel addition
		bpanel.add(bA);
		bpanel.add(bB);
		bpanel.add(bC);
		bpanel.add(bD);
		bpanel.add(b1);
		bpanel.add(b2);
		bpanel.add(b3);
		bpanel.add(b4);
		bpanel.add(b5);
		bpanel.add(b6);
		bpanel.add(b7);
		bpanel.add(b8);
		bpanel.add(b9);
		bpanel.add(b0);
		bpanel.add(cancel);

		// Buttons to Checkout Panel addition
		cpanel.add(checkout);
		cpanel.add(screen);
		cpanel.add(credit);
		cpanel.add(cash);
		cpanel.add(nickel);
		cpanel.add(dime);
		cpanel.add(quarter);
		cpanel.add(one_dollar);
		cpanel.add(five_dollar);
		cpanel.add(ten_dollar);
		cpanel.add(finalize);

		// Main Frame setup
		final A05Frames vend = new A05Frames("Vend-O-Matic"); // A05Frames Object
		vend.setSize(1200, 786); // Frame size
		vend.setLayout(new GridLayout(1, 2));
		vend.setDefaultCloseOperation(A05Frames.EXIT_ON_CLOSE); // default action setup for when exit button is clicked
		vend.setVisible(true); // Frame Visible
		vend.add(ppanel); // Product Panel to A05Frames
		vend.add(bpanel); // Button Panel to A05Frames
		vend.add(cpanel); // Checkout Panel to A05Frames
	}
}
