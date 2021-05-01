package Exam_Registration;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menus extends ExamGui implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean validLogin = false;
	boolean validEntry = false;
	
	//declare buttons
	static JButton regButton = new JButton("Exam Registration");
	static JButton serButton = new JButton("Search Results");
	static JButton resButton = new JButton("Enter Results");
	static JButton enter = new JButton("Enter");
	static JButton back = new JButton("Back");
	static JButton next = new JButton("Next");
	static JButton previous = new JButton("Previous");
	static JButton Exit = new JButton("Exit");
	static JButton nameButton = new JButton("Student Number");
	static JButton modButton = new JButton("Module name");
	static JButton avgButton = new JButton("Average result");
	static JButton bSearch = new JButton("Search");
	
	//declare text fields
	static JTextField tLogin = new JTextField(30);
	static JPasswordField tPass = new JPasswordField(30);
	static JTextField textStudent = new JTextField(30);
	static JTextField textDesk = new JTextField(30);
	static JTextField sSearch = new JTextField(30);
	static JTextField tStudent = new JTextField(30);
	static JTextField tResult = new JTextField(30);
	static JTextField mSearch = new JTextField(30);
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		menus m = new menus();
	}
		
	public menus(){
		System.out.println("hello");		
		regButton.addActionListener(this);
		serButton.addActionListener(this);
		resButton.addActionListener(this);
		enter.addActionListener(this);
		back.addActionListener(this);
		next.addActionListener(this);
		previous.addActionListener(this);
		Exit.addActionListener(this);
		nameButton.addActionListener(this);
		modButton.addActionListener(this);
		avgButton.addActionListener(this);
		bSearch.addActionListener(this);
	}
	
	//main menu - lists the options available to the user
	public static JInternalFrame mainmenu(){
		//new menus();
		JInternalFrame mainmenu = new JInternalFrame();
		mainmenu.setLayout(new GridLayout(3,1,10,100));
		
		//add items to the inner frame
		mainmenu.add(regButton);
		mainmenu.add(serButton);
		mainmenu.add(resButton);
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)mainmenu.getUI()).getNorthPane();
		mainmenu.remove(titlePane);
		mainmenu.setBorder(null);
		mainmenu.setSize(500,500);
		mainmenu.setLocation(100,50);
		mainmenu.setVisible(true);
		
		return mainmenu;
	}//end main menu inner frame
	
	//login menu - used to allow the user to login using a username and password
	public static JInternalFrame Loginmenu(){
		
		//create internal frame
		JInternalFrame login = new JInternalFrame();
		login.setLayout(new GridLayout(3,2,50,150));
		
		//create components
		JLabel lLogin = new JLabel("Please Enter Username");
		JLabel lPass = new JLabel("Please Enter Password");
		
		
		//add components
		login.add(lLogin);
		login.add(tLogin);
		login.add(lPass);
		login.add(tPass);
		login.add(back);
		login.add(enter);
		
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)login.getUI()).getNorthPane();
		login.remove(titlePane);
		login.setBorder(null);
		login.setSize(500,500);
		login.setLocation(100,50);
		login.setVisible(true);
		
		return login;
	}//end login inner frame
	
	//register menu - this is the menu to add students to the module to register them
	public static JInternalFrame registermenu(){
		//create internal frame
		JInternalFrame register = new JInternalFrame();
		register.setLayout(new GridLayout(4,2,50,100));
		
		//create components
		JLabel lStudent = new JLabel("Please Enter Student Number");
		JLabel lDesk = new JLabel("Please Enter Desk Number");
		
		//add components
		register.add(lStudent);
		register.add(textStudent);
		register.add(lDesk);
		register.add(textDesk);
		register.add(previous);
		register.add(next);
		register.add(back);
		
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)register.getUI()).getNorthPane();
		register.remove(titlePane);
		register.setBorder(null);
		register.setSize(500,500);
		register.setLocation(100,50);
		register.setVisible(true);
		
		return register;
		
	}//end registration
	
	//search menu - used to display the available search options
	public static JInternalFrame searchmenu(){
		JInternalFrame search = new JInternalFrame();
		
		search.setLayout(new GridLayout(3,1,10,100));
		
		//add items to the inner frame
		search.add(nameButton);
		search.add(modButton);
		search.add(avgButton);
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)search.getUI()).getNorthPane();
		search.remove(titlePane);
		search.setBorder(null);
		search.setSize(500,500);
		search.setLocation(100,50);
		search.setVisible(true);
		
		return search ;
		
	}//end search menu
	
	//student search menu - used to display the menu to allow the user to search for a name
	public static JInternalFrame studentSearch(){
		JInternalFrame Search = new JInternalFrame();
		
		//create label
		JLabel lStudent = new JLabel("Please Enter Student Number To Search For.");
		
		//add objects
		Search.add(sSearch);
		Search.add(lStudent);
		Search.add(bSearch);
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)Search.getUI()).getNorthPane();
		Search.remove(titlePane);
		Search.setBorder(null);
		Search.setSize(500,500);
		Search.setLocation(100,50);
		Search.setVisible(true);
		return Search;
	}//end student search
	
	//module search - this will display the results of everyone in a module. user must enter module name in text area
	public static JInternalFrame moduleSearch(){
		JInternalFrame Search = new JInternalFrame();
		
		//create label
		JLabel lModule = new JLabel("Please Enter Module To Search For.");
		
		//add objects
		Search.add(lModule);
		Search.add(mSearch);
		Search.add(bSearch);
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)Search.getUI()).getNorthPane();
		Search.remove(titlePane);
		Search.setBorder(null);
		Search.setSize(500,500);
		Search.setLocation(100,50);
		Search.setVisible(true);
		return Search;
	}//end module search
	
	//result menu - allows the user to enter student results
	public static JInternalFrame resultmenu(){
		//create internal frame
		JInternalFrame result = new JInternalFrame();
		result.setLayout(new GridLayout(4,2,50,120));
		
		//create components
		JLabel lStudent = new JLabel("Please Enter Student Number");
		JLabel lResult = new JLabel("Please Enter Student Result");
		
		//add components
		result.add(lStudent);
		result.add(tStudent);
		result.add(lResult);
		result.add(tResult);
		result.add(next);
		result.add(previous);
		result.add(Exit);
		
		//inner frame settings
		BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)result.getUI()).getNorthPane();
		result.remove(titlePane);
		result.setBorder(null);
		result.setSize(500,500);
		result.setLocation(100,50);
		result.setVisible(true);
		
		return result;
		
	}//end registration
	
	//validation - used to check for errors in entries
	public void validate(int i){
		if(i==0){
			
		}//end if
		if(i==1){
			
		}
	}//end validate
	
	//action performed
	public void actionPerformed(ActionEvent e){
		//if user clicks exit button 
		if(e.getActionCommand().equals("Exit")){
			System.exit(0);
		}//end exit
		//if user clicks exam reg button
		if(e.getActionCommand().equals("Exam Registration")){
			System.out.println("hello");
			innerframe.dispose();
			innerframe = registermenu();
			desktop.add(innerframe);
		}//end exam reg
		//if user clicks search result button
		if(e.getActionCommand().equals("Search Results")){
			innerframe.dispose();
			innerframe = Loginmenu();
			desktop.add(innerframe);
		}//end search result
		//if user clicks enter result button
		if(e.getActionCommand().equals("Enter Results")){
			innerframe.dispose();
			innerframe = Loginmenu();
			desktop.add(innerframe);
		}//end enter results
		//if user clicks back button
		if(e.getActionCommand().equals("Back")){
			innerframe.dispose();
			innerframe = mainmenu();
			desktop.add(innerframe);
		}//end back
		//if user clicks enter button
		if(e.getActionCommand().equals("Enter")){
			if(validLogin == false){
				validate(0);
			}//end if
			else if(validLogin == true){
				innerframe.dispose();
				innerframe = mainmenu();
				desktop.add(innerframe);
			}//end else	
		}//end enter
		//if user clicks next button
		if(e.getActionCommand().equals("Next")){
			if(validEntry == false){
				validate(1);
			}//end if
			else if(validEntry == true){
				//add entry to database code goes here
				textStudent.setText(null);
				textDesk.setText(null);
			}//end else	
		}//end next
		//if user clicks previous button
		if(e.getActionCommand().equals("Previous")){
			textStudent.setText("");//place code to take in previous entry inputs from database
			textDesk.setText("");//here to
		}//end previous
		//if user clicks student number button
		if(e.getActionCommand().equals("Student Number")){
			innerframe.dispose();
			innerframe = studentSearch();
			desktop.add(innerframe);
		}//end student numer
		//if user clicks module name button
		if(e.getActionCommand().equals("Module name")){
			innerframe.dispose();
			innerframe = moduleSearch();
			desktop.add(innerframe);
		}//end module name
		//if user clicks avg res button
		if(e.getActionCommand().equals("Average result")){
			//enter code to take in all of the results and get the average then display this in a joption pane
		}//end avg res
		
	}//end action event

}//end class
