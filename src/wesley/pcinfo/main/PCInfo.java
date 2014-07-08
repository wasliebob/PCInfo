package wesley.pcinfo.main;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class PCInfo extends JFrame{
	private static final long serialVersionUID = 1L;
	public static JTextArea text;
	public static String ram;
	public static String memoryFree;
	public static String memoryMax;
	public static String memoryUsed;
	public static String OS;
	public static void main(String[] args)
	{
		OS = "Operation System: " + System.getProperty("os.name") + "_" + "v" + System.getProperty("os.version");
		memoryFree = "Free Memory: " + MemoryHelper.size(Runtime.getRuntime().freeMemory());
		memoryMax =  "Max Memory: " +  MemoryHelper.size(Runtime.getRuntime().maxMemory());
		memoryUsed = "Memory Used: " +  MemoryHelper.size((Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory()));
		
		String[] info = new String[]{
				OS, 
				memoryFree, 
				memoryMax, 
				memoryUsed, 
				FileHelper.isInstalled("Java", "http://java.com/nl/download/"), 
				FileHelper.isInstalled("silverlight" , "http://www.microsoft.com/silverlight/"), 
				FileHelper.isInstalled("Firefox", "http://www.mozilla.org/nl/firefox/new/"),
		};
		GUI gui = new GUI(text, info);
		gui.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2,Toolkit.getDefaultToolkit().getScreenSize().height/2);
		gui.setVisible(true);
	}
}
