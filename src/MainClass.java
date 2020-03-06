import java.awt.BorderLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class MainClass {
  public static void main(String args[]) throws Exception {
	  
	  
	  splitLine("15 / 5");
	  
	  
	  
	  
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
		 * js4.setSnapToTicks(true); // �������� � ������� js4.setPaintTrack(false); //
		 * �� �������� �������
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

  
  public static boolean splitLine(String inLine) {
	  
	  int operand_1 = 0; // ����������
	  int operand_2 = 0; // ����������
	  char matAction = ' ';  // ����������
	  	  
	  if ( inLine.length() == 0) {  // ��������� �� ������ - ���������
		  // �����
		  
	  }
	    
	  // ������ ������� 
	  inLine = inLine.replace(" ", "");
	  
	  // ������� ������ ������� � �������� � ����������
	  boolean chkOperandExist = false;
	  for (char ch : inLine.toCharArray()) {
		  if ( Character.isDigit(ch) ) {
			  operand_1 = Integer.parseInt(String.valueOf(operand_1) + ch);
			  chkOperandExist = true;
		  }
		  else break; // �������� ��� �������
	  } 
	  
	  System.out.println(operand_1);
	  
	  // ��� ������� ��������, ������ �����
	  if ( ! chkOperandExist ) {  
		  System.out.println("Wrong input first operand !");
		  return false;
	  }
	  
	  
	  // ������� ������ �������������� �������� � ���������� matAction
	  int indexOper = 0; // ������ ����� ����� ��� ��������� ������� ��������
	  for (char ch : inLine.toCharArray()) {
		  indexOper++;
		  if ( ! Character.isDigit(ch) ) {
			  System.out.println(ch);
			  matAction = ch;
			  break;
		  }
	  } 
	  
	  // �� ������� ��� ��������� ��������
	  if (matAction != '-' && matAction != '+' && matAction != '*' && matAction != '/') {
		  System.out.println("Wrong input math operation command !");
		  return false;
	  }
	  
	// ������� ������ ������� � �������� � ����������
	  chkOperandExist = false;
	  for (int i = indexOper; i < inLine.length(); i++) {
		  char ch = inLine.charAt(i);
		  if ( Character.isDigit(ch) ) {
			  operand_2 = Integer.parseInt(String.valueOf(operand_2) + ch);
			  chkOperandExist = true;
		  }
		  else break; // �������� ��� �������
	  }
	  
	  System.out.println(operand_2);
	  
	  // ��� ������� ��������, ������ ����� ��� ������� ������� �� ����  
	  if ( ! chkOperandExist ) {  
		  System.out.println("Wrong input second operand !");
		  return false;
	  }
	  else if (operand_2 == 0 && matAction == '/' ) {  
		  System.out.println("Cannot be divided by zero !");
		  return false;
	  }
	  
	  
	  // ���������
	  switch (matAction) {
	  	case '+':
	  		System.out.println(operand_1 + operand_2);
	  		break;
	  	case '-':
	  		System.out.println(operand_1 - operand_2);
	  		break;
	  	case '/':
	  		System.out.println(operand_1 / operand_2);
	  		break;
	  	case '*':
	  		System.out.println(operand_1 * operand_2);
	  		break;
	  	default:
	  		break;
	}
	  
	  
	 return true;
	  
	  
  }
  
  
}
