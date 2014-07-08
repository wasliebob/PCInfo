package wesley.pcinfo.main;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI extends JFrame{
	private static final long serialVersionUID = 1L;

	public GUI(JTextArea area, String[] text)
	{		
		createGUI(area, text);
	}
	
	private void createGUI(JTextArea area, String[] text) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = this.getContentPane();
		window.setLayout(new FlowLayout());
		//Toolkit.getDefaultToolkit().getScreenSize().width/2,Toolkit.getDefaultToolkit().getScreenSize().height/2
		area = new JTextArea(55, 55);
		area.setText("Computer Informatie: " + "\n");
		area.setEditable(false);
		Font font = new Font("Verdana", Font.BOLD, 12);
        area.setFont(font);
        if(PCInfo.OS.contains("Windows 8")){area.setForeground(new Color(150, 0, 250));}
        setColor(area);
        area.setBackground(new Color(255, 255, 255));
		window.add(area);
		window.setBackground(new Color(255, 255, 255));
		
		for(String s : text){
			addToBox(s, area);
		}
	  }
	
	public static void setColor(JTextArea area){
        if(PCInfo.OS.contains("Windows 8")){area.setForeground(new Color(150, 0, 250));}
        else if(PCInfo.OS.contains("Windows 7")){area.setForeground(new Color(0, 0, 122));};

        
	}
	public static void addToBox(String s, JTextArea area)
	{
		area.append(s + "\n");
	}
}