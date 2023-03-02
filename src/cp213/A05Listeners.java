package cp213;

import java.awt.event.*;
import java.util.Random;

//If you need to implement/use a listener in your program then it must be an instance of this class.
//You can add suitable Interfaces to the header/definition of this class using implements.

/**
 * 
 * @author Sahil Lalani
 * @version 23-11-2019
 *
 */

public class A05Listeners implements ActionListener {

	private String componentID;// your own unique way of identifying components that will be attached
	// to the A05Listener objects. This way you will be able to distinguish that
	// which component has
	// invoked the action handler.

	private static final double NICKEL = 0.05;
	private static final double DIME = 0.10;
	private static final double QUARTER = 0.25;
	private static final double ONEBILL = 1.0;
	private static final double FIVEBILL = 5.0;
	private static final double TENBILL = 10.0;

	private int nickel_num = 20;
	private int dime_num = 10;
	private int quarter_num = 12;
	private int onebill_num = 0;
	private int fivebill_num = 0;
	private int tenbill_num = 0;

	private int return_nickel_num = 0;
	private int return_dime_num = 0;
	private int return_quarter_num = 0;
	private int return_onebill_num = 0;
	private int return_fivebill_num = 0;
	private int return_tenbill_num = 0;

	double payment;
	double price;
	String item;

	private int index = 0;

	final String[] vendItems = {
			"Chips1", "Chips2", "Chips3", "Chips4",
			"Chocolate1", "Chocolate1", "Chocolate1", "Chocolate1", "Chocolate1", "Chocolate1",
			"Gum1", "Gum2", "Gum3", "Gum4", "Gum5", "Gum6"
	};

	final double[] vendPrices = {
			1.50, 2.50, 3.15, 2.75,
			0.50, 1.25, 2.30, 0.50, 1.25, 2.30,
			1.00, 1.00, 1.00, 1.75, 1.75, 1.75
	};

	int[] vendQuantity = {
			4, 2, 2, 4,
			2, 2, 2, 2, 1, 1,
			1, 1, 2, 2, 2, 2
	};

	final String[] vendID = {
			"A0", "A1", "A2", "A3",
			"B0", "B1", "B2", "B3", "C0", "C1",
			"C2", "C3", "D0", "D1", "D2", "D3"
	};

	public A05Listeners(String arg) {// DO NOT modify this line
		componentID = arg;// DO NOT modify this line
		// you can perform additional actions here.
	}

	// --------------------------------------------------------------------
	// ActionListener for Buttons in Button Panel
	// --------------------------------------------------------------------

	@Override
	public void actionPerformed(ActionEvent e) {
		if (componentID.length() != 2) {
			componentID += ((A05Buttons) e.getSource()).getText();
			A05.screen.setText(componentID);
		}

		if ((componentID.length() == 2)) {

			if (!(componentID.charAt(0) == '0') && !(componentID.charAt(0) == '1')
					&& !(componentID.charAt(0) == '2') && !(componentID.charAt(0) == '3')
					&& !(componentID.charAt(0) == '4') && !(componentID.charAt(0) == '5')
					&& !(componentID.charAt(0) == '6') && !(componentID.charAt(0) == '7')
					&& !(componentID.charAt(0) == '8') && !(componentID.charAt(0) == '9')
					&& !(componentID.charAt(1) == 'A') && !(componentID.charAt(1) == 'B')
					&& !(componentID.charAt(1) == 'C') && !(componentID.charAt(1) == 'D')
					&& !(componentID.charAt(1) == '4') && !(componentID.charAt(1) == '5')
					&& !(componentID.charAt(1) == '6') && !(componentID.charAt(1) == '7')
					&& !(componentID.charAt(1) == '8') && !(componentID.charAt(1) == '9')) {

				setItem(componentID);
				A05.screen.setText("Name of Item: " + item + " | " + "Price of the Item: " + price);
			}

			else {
				A05.screen.setText("Wrong Input, Press Cancel to Restart");
			}
		}
	}

	// ActionListener for Cancel Button in Button Panel
	class CancelButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initialize();
		}
	}

	// --------------------------------------------------------------------
	// ActionListener for Checkout Panel
	// --------------------------------------------------------------------

	// ActionListener for Credit Button in Checkout Panel
	class CreditButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			A05.screen.setText("Processing...");
			if (price != 0) {
				Random rand = new Random();
				int a = rand.nextInt(100);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

				if (a <= 10) {
					A05.screen.setText("Transaction Rejected");
				}

				else {
					if (vendQuantity[index] == 0) {
						A05.screen.setText("Item Out of Stock!");
					} else {
						vendQuantity[index]--;
						A05.screen.setText("Transaction Success");
					}
				}
			}

			else {
				A05.screen.setText("Error!");
			}
		}
	}

	class NickelButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			nickel_num++;
			payment += NICKEL;
			A05.screen.setText("Amount Due: " + price + " | Change Enterred: " + payment);
		}
	}

	class DimeButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dime_num++;
			payment += DIME;
			A05.screen.setText("Amount Due: " + price + " | Change Enterred: " + payment);
		}
	}

	class QuarterButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			quarter_num++;
			payment += QUARTER;
			A05.screen.setText("Amount Due: " + price + " | Change Enterred: " + payment);
		}
	}

	class OneBillButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			onebill_num++;
			payment += ONEBILL;
			A05.screen.setText("Amount Due: " + price + " | Change Enterred: " + payment);
		}
	}

	class FiveBillButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			fivebill_num++;
			payment += FIVEBILL;
			A05.screen.setText("Amount Due: " + price + " | Change Enterred: " + payment);
		}
	}

	class TenBillButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			tenbill_num++;
			payment += TENBILL;
			A05.screen.setText("Amount Due: " + price + " | Change Enterred: " + payment);
		}
	}

	class FinalizeButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (payment > 0) {

				if (payment > price) {
					if (vendQuantity[index - 1] == 0) {
						A05.screen.setText("Item Out of Stock!");
					} else {
						vendQuantity[index - 1]--;
						double x = payment - price;
						change_gen(x);
						A05.screen.setText("Your change is: Nickel - " + return_nickel_num
								+ " | Dime - " + return_dime_num
								+ " | Quarter - " + return_quarter_num
								+ " | One Dollar Bill - " + return_onebill_num
								+ " | Five Dollar Bill - " + return_fivebill_num
								+ " | Ten Dollar Bill - " + return_tenbill_num);
						price = 0;
					}
				}

				else if (payment == price) {
					A05.screen.setText("No Change. Thank you for your purchase.");
					if (vendQuantity[index - 1] == 0) {
						A05.screen.setText("Item Out of Stock!");
					} else {
						vendQuantity[index - 1]--;
					}
				}
			}

			else {
				A05.screen.setText("Invalid Input, Please Restart");
				initialize();
			}
		}
	}

	// --------------------------------------------------------------------
	// Private Helper Methods
	// --------------------------------------------------------------------
	private void setItem(String arg) {

		while (index < 16) {
			if (vendID[index].equals(arg)) {
				item = vendItems[index];
				price = vendPrices[index];
			}
			index++;
		}
	}

	private void initialize() {
		componentID = "";
		item = "";
		price = 0;
		A05.screen.setText("Enter the Product ID of the Item you want to purchase.");
	}

	private void change_gen(double x) {
		if (x < 1) {
			return_quarter_num = (int) (x / QUARTER);
			quarter_num = quarter_num - return_quarter_num;
			x = x - QUARTER * return_quarter_num;
			return_dime_num = (int) (x / DIME);
			dime_num = dime_num - return_dime_num;
			x = x - DIME * return_dime_num;
			return_nickel_num = (int) (x / NICKEL);
			nickel_num = nickel_num - return_nickel_num;
			x = x - NICKEL * return_nickel_num;
		}

		else if (x > 1) {
			return_tenbill_num = (int) (x / TENBILL);
			x = x - TENBILL * return_tenbill_num;
			return_fivebill_num = (int) (x / FIVEBILL);
			x = x - FIVEBILL * return_fivebill_num;
			return_onebill_num = (int) (x / ONEBILL);
			x = x - ONEBILL * return_onebill_num;
			return_quarter_num = (int) (x / QUARTER);
			x = x - QUARTER * return_quarter_num;
			return_dime_num = (int) (x / DIME);
			x = x - DIME * return_dime_num;
			return_nickel_num = (int) (x / NICKEL);
			x = x - NICKEL * return_nickel_num;
		}
	}
}
