import java.awt.BorderLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class MainClass {
  public static void main(String args[]) throws Exception {
	  
	  int val1 = 0;
	  int val2 = 0;
	  char oper = ' ';
	  Boolean flagError = false;
	  String str = " 93 + 0 ";
	  
	  if ( str.length() == 0) {
		  // выход
		  
	  }
	    
	  
	  str = str.replace(" ", "");
	  // первое значение
	  for (char ch : str.toCharArray()) {
		  
		  if ( Character.isDigit(ch) ) {
			  System.out.println(ch);
			  val1 = Integer.parseInt(String.valueOf(val1) + ch);
		  }
		  else break;
		  
	  } 
	  
	  System.out.println(val1);
	  
	  if (val1 == 0) { // решить проблему 0 значения 
		  System.out.println("Error line - 1");
		  flagError = true;
	  }
	  
	  
	  // команда
	  int indexOper = 0;
	  for (char ch : str.toCharArray()) {
		  
		  indexOper++;
		  if ( ! Character.isDigit(ch) ) {
			  System.out.println(ch);
			  oper = ch;
			  break;
		  }
		  
	  } 
	  
	  if (oper != '-' && oper != '+' && oper != '*' && oper != '/') {
		  
		  System.out.println("Error line!");
		  
	  }
	  
	  // второе значение
	  for (int i = indexOper; i < str.length(); i++) {
		  char ch = str.charAt(i);
		  if ( Character.isDigit(ch) ) {
			  System.out.println(ch);
			  val2 = Integer.parseInt(String.valueOf(val2) + ch);
		  }
		  else break;
		  
	  }
	  
	  System.out.println(val2);
	  
	  if (val2 == 0) { // и на ноль (запрет деления) проверка заодно   // решить проблему 0 значения не при делении 
		  System.out.println("Error line - 2");
		  flagError = true;
	  }
	  
	  
	  // вычисляем
	  switch (oper) {
	  	case '+':
	  		System.out.println(val1 + val2);
	  		break;
	  	case '-':
	  		System.out.println(val1 - val2);
	  		break;
	  	case '/':
	  		System.out.println(val1 / val2);
	  		break;
	  	case '*':
	  		System.out.println(val1 * val2);
	  		break;
	  	default:
	  		break;
	}
	  
	  
	  //char symb = 'a';
	  //Integer asd = new Integer(48);
	  //System.out.println(asd);
	  //System.out.println(  symb + " -> " + (int)symb );
	  //char symbUp = Character.toUpperCase(symb);
	  //char symbUp = (char) ( (int)symb & 0x5f );
	  //System.out.println( symbUp + " -> " + (int)symbUp );
	  //char upperChar = 'l' & 0x5f
	  //char lowerChar = 'L' ^ 0x20
	  
	  
	  
	  /////////////////////////////////////////////////////////////////
		/*
		 * String title = (args.length == 0 ? "Slider demo" : args[0]);
		 * 
		 * JFrame frame = new JFrame(title);
		 * 
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * 
		 * JSlider js4 = new JSlider(JSlider.VERTICAL);
		 * 
		 * Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
		 * 
		 * table.put(0, new JLabel("0"));
		 * 
		 * table.put(10, new JLabel("Ten"));
		 * 
		 * table.put(25, new JLabel("Twenty-Five"));
		 * 
		 * table.put(34, new JLabel("Thirty-Four"));
		 * 
		 * table.put(52, new JLabel("Fifty-Two"));
		 * 
		 * table.put(70, new JLabel("Seventy"));
		 * 
		 * table.put(82, new JLabel("Eighty-Two"));
		 * 
		 * table.put(100, new JLabel("100"));
		 * 
		 * //js4.setLabelTable(js4.createStandardLabels(30, 1));
		 * 
		 * //js4.setLabelTable(table); js4.setPaintLabels(true);
		 * 
		 * js4.setMinimum(0); js4.setMaximum(100); js4.setMinorTickSpacing(10);
		 * js4.setMajorTickSpacing(50); js4.setPaintTicks(true);
		 * js4.setSnapToTicks(true); // привязка к делению js4.setPaintTrack(false); //
		 * не выводить дорожку
		 * 
		 * js4.setValue(25);
		 * 
		 * frame.add(js4, BorderLayout.CENTER);
		 * 
		 * frame.setSize(150, 400);
		 * 
		 * frame.setVisible(true);
		 */
  }

}
