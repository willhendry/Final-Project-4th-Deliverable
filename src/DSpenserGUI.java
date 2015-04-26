import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;


public class DSpenserGUI extends JFrame {
	private static NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

	//declare components as instance variables

	//Status Panel
	private JLabel lblCurrentAmount;
	private JLabel lblTotalAmount;

	private DSpenser dSpenser = new DSpenser();


	public DSpenserGUI(){
		super("DSpenser - Office food and drink management on demand!");

		//declare components as instance variables.
		//Status Panel
		JLabel lblCurrentBalance, lblDollarSymbol; //lblDollarSymbol not needed when using formatter. -WH
		JLabel lblTotalCharge;

		JPanel pnlTopStatus, pnlCenterMenu, pnlBottomButtons;

		JPanel pnlStatusNorth, pnlStatusSouth;
		JPanel pnlCurrentBalance, pnlTotalBalance;


		//Menu Panel
		JCheckBox chkPlainCoffee, chkSugar, chkCream, chkSugarNCream
				  , chkBouillon;
		


		//Button Panel
		JButton addToOrder, placeOrder, Quit, returnMoney;
		JButton Nickel, Dime, Quarter, Dollar;


		Container contents = getContentPane();

		// set the layout manager

		contents.setLayout(new BorderLayout());  

		// instantiate GUI components and other instance variables

		// Instantiating the body panels  	

		pnlTopStatus = new JPanel();     //Status Panel	
		pnlCenterMenu = new JPanel();    //Menus Panel
		pnlBottomButtons = new JPanel(); //Button Panels

		pnlTopStatus.setLayout(new BorderLayout());     //Status Layout
		pnlCenterMenu.setLayout(new BorderLayout());    //Menu Layout
		pnlBottomButtons.setLayout(new BorderLayout()); //Buttons Layout


		// Instantiating Top Status Panel elements
			//Instantiating North Status Panel elements.
		pnlStatusNorth = new JPanel();
		pnlStatusNorth.setLayout(new FlowLayout());
		pnlTopStatus.add(pnlStatusNorth, BorderLayout.NORTH);

		lblCurrentBalance = new JLabel("Current Balance:");
		lblCurrentAmount = new JLabel(String.valueOf(moneyFormatter.format(dSpenser.getMoneyCounter())));

		pnlStatusNorth.add(lblCurrentBalance);
		pnlStatusNorth.add(lblCurrentAmount);		


			// Instantiating South Status Panel elements.
		pnlStatusSouth = new JPanel();
		pnlStatusSouth.setLayout(new FlowLayout());
		pnlTopStatus.add(pnlStatusSouth, BorderLayout.SOUTH);

		lblTotalCharge = new JLabel("Total Charge:");
		lblTotalAmount = new JLabel(String.valueOf(moneyFormatter.format(dSpenser.getTotalCharge())));

		pnlStatusSouth.add(lblTotalCharge);
		pnlStatusSouth.add(lblTotalAmount);

		//Instantiating Center Menu elements.


		//Instantiating Bottom Buttons elements.

		Nickel = new JButton(".05");
		Dime = new JButton("0.10");
		Quarter = new JButton("0.25");
		Dollar = new JButton("1.00");
		returnMoney = new JButton("Returns Money.");

		addToOrder = new JButton("Add to Order.");
		placeOrder = new JButton("Place Order.");
		Quit = new JButton("Quit"); //Do we need this?


		// instantiate event handlers; associate with components

		//Handler for placing and completing orders.
		OrderHandler odh = new OrderHandler();
		addToOrder.addActionListener(odh);
		placeOrder.addActionListener(odh);

		//Handler for adding and returning money.
		MoneyHandler mh = new MoneyHandler();
		Nickel.addActionListener(mh);
		Dime.addActionListener(mh);
		Quarter.addActionListener(mh);
		Dollar.addActionListener(mh);
		returnMoney.addActionListener(mh);

		//Handler to exit the program.
		ExitHandler eh = new ExitHandler();
		Quit.addActionListener(eh);


		// add GUI components to the content pane

		//Status Panels
		contents.add(pnlTopStatus, BorderLayout.NORTH);
		contents.add(Quit, BorderLayout.SOUTH);




		setSize( 500, 500 ); // set window size
		setVisible( true ); // make window visible
	}

	// private inner classes for event handlers

	private class OrderHandler implements ActionListener {
		// code to handle event
		public void actionPerformed( ActionEvent e){


		}

	}

	private class MoneyHandler implements ActionListener{

		public void actionPerformed( ActionEvent e){


		}
	}

	private class ExitHandler implements ActionListener {
		// code to handle event
		public void actionPerformed( ActionEvent e){
			System.exit(0);
		}

	}


	public static void main(String [] args) {


		DSpenserGUI machine = new DSpenserGUI();
		machine.dSpenser.updateCounter(1);

		ArrayList<String> orders = new ArrayList<String>();

		//add to order listener.
		for (int i = 0; i < 1; i++) {
			orders.add("SugarCreamCoffee");
			orders.add("Bouillon");
		}

		machine.dSpenser.processOrders(orders);

		System.out.println(moneyFormatter.format(machine.dSpenser.getMoneyCounter()));
		System.out.println(moneyFormatter.format(machine.dSpenser.getTotalCharge()));

		machine.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}


}
