package Exam_Registration;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ExamGui extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public JInternalFrame innerframe = new JInternalFrame();
	public JDesktopPane desktop = new JDesktopPane();
	public ExamGui(){
		super("Exam Registration");
		
		//create desktop and internal frame
		innerframe = menus.mainmenu();
		
		//create menu bar and menus
		JMenuBar menubar = new JMenuBar();
		JMenu filemenu = new JMenu("File", true);
		JMenu exitmenu = new JMenu("Exit", true);
		
		//create menu items
		JMenuItem exit = new JMenuItem("exit");
		exit.addActionListener(this);
		JMenuItem reg = new JMenuItem("registration");
		reg.addActionListener(this);
		JMenuItem sear = new JMenuItem("search");
		sear.addActionListener(this);
		JMenuItem resu = new JMenuItem("result");
		resu.addActionListener(this);
		
		//add items to menus
		filemenu.add(reg);
		filemenu.add(sear);
		filemenu.add(resu);
		exitmenu.add(exit);
		menubar.add(filemenu);
		menubar.add(exitmenu);
		
		desktop.add(innerframe);
		
		//window settings
		setContentPane(desktop);
		setVisible(true);
		setSize(700,700);
		setJMenuBar(menubar);
	}//end constructor
	
	//main method
	public static void main(String[] args){
		new ExamGui();
	}//end main
	
	//action listener
	public void actionPerformed(ActionEvent e) {
		
		//controls for menu buttons
		if(e.getSource() instanceof JMenuItem){
			if(e.getActionCommand().equals("exit")){
				System.exit(0);
			}//end if for exit
			//brings up Registration menu
			if(e.getActionCommand().equals("registration")){
				innerframe.dispose();
				innerframe = menus.registermenu();
				desktop.add(innerframe);
			}//end if for exit
			//brings up search menu
			if(e.getActionCommand().equals("search")){
				innerframe.dispose();
				innerframe = menus.Loginmenu();
				desktop.add(innerframe);
			}//end if for exit
			//brings up result menu
			if(e.getActionCommand().equals("result")){
				innerframe.dispose();
				innerframe = menus.Loginmenu();
				desktop.add(innerframe);
			}//end if for exit
			
		}//end if for JMenu item
	}//end action performed
	
	
	
}//end class
