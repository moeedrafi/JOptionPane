
//Muhammad Moeed Rafi
//BESE-26b
import javax.swing.JOptionPane;
public class Joptionpane {

	public static void main(String[] args) {
		 String input;
	     
	      input = JOptionPane.showInputDialog("Enter an integer : ");
	      int a = Integer.parseInt(input);
	      
	      input = JOptionPane.showInputDialog("Enter a float : ");
	      double b = Double.parseDouble(input);
	      
	      input = JOptionPane.showInputDialog("Enter a string : ");
	      
	      JOptionPane.showMessageDialog(null,"Integer value= " + a +"\nFloat value= " + b);
	      JOptionPane.showMessageDialog(null,"String value= "+input);
	    }
	}