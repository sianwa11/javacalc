package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI<Calc> extends JFrame {
	private JTextField textfield;
	private JButton one,two,three,four,five,six,seven,eight,nine,zero,dot,delete,add,subtract,multiply,divide,equal,reset,on,off;
	private String firstnum,secondnum,sanswer;
	private double answer=0.0;
	private JPanel Pane;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	private boolean equalsclicked=false, operationChosen=false;
	char operation=' ';
	
	public GUI() {
		super("My Calculator");
		
		textfield=new JTextField(null,35);
		textfield.setEditable(false);
		
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		l4=new JLabel();
		l5=new JLabel();
		l6=new JLabel();
		l7=new JLabel();
		l8=new JLabel();
		l9=new JLabel();
		l10=new JLabel();
		l11=new JLabel();
		l12=new JLabel();
		l13=new JLabel();
		l14=new JLabel();
		l15=new JLabel();
		l16=new JLabel();
		l17=new JLabel();
		
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		zero=new JButton("0");
		dot=new JButton(".");
		add=new JButton("+");
		subtract=new JButton("-");
		multiply=new JButton("*");
		divide=new JButton("/");
		equal=new JButton("=");
		reset=new JButton("reset");
		delete=new JButton("DEL");
		on=new JButton("ON");
		off=new JButton("OFF");

		
		
		Dimension dim =new Dimension(60,50);
		textfield.setPreferredSize(new Dimension(1,35));
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(dim);
		dot.setPreferredSize(dim);
		add.setPreferredSize(dim);
		subtract.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		divide.setPreferredSize(dim);
		equal.setPreferredSize(dim);
		reset.setPreferredSize(dim);
		on.setPreferredSize(dim);
		off.setPreferredSize(dim);
		delete.setPreferredSize(new Dimension(60,50));
		l1.setPreferredSize(dim);
		l2.setPreferredSize(dim);
		l3.setPreferredSize(dim);
		l4.setPreferredSize(dim);
		l5.setPreferredSize(dim);
		l6.setPreferredSize(dim);
		l7.setPreferredSize(dim);
		l8.setPreferredSize(new Dimension(30,30));
		l9.setPreferredSize(new Dimension(30,30));
		l10.setPreferredSize(new Dimension(60,50));
		l11.setPreferredSize(new Dimension(60,50)); 
		l12.setPreferredSize(new Dimension(40,40));
		l13.setPreferredSize(new Dimension(30,30));
		l14.setPreferredSize(new Dimension(40,40));
		l15.setPreferredSize(new Dimension(60,50));
		l16.setPreferredSize(new Dimension(111,50));
		l17.setPreferredSize(new Dimension(140,50));
		
	
		Numbers n= new Numbers();
		Calculations z= new Calculations();
	
		
		one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);four.addActionListener(n);five.addActionListener(n);
		six.addActionListener(n);seven.addActionListener(n);eight.addActionListener(n);nine.addActionListener(n);zero.addActionListener(n);
		dot.addActionListener(n);delete.addActionListener(n);on.addActionListener(n);off.addActionListener(n);
		
		
		add.addActionListener(z);subtract.addActionListener(z);multiply.addActionListener(z);divide.addActionListener(z);
		equal.addActionListener(z);reset.addActionListener(z);
		
		Pane=new JPanel();
		Pane.setBackground(Color.darkGray);
		Pane.setLayout(new FlowLayout());
	
		Pane.add(textfield,BorderLayout.NORTH);
		
		Pane.add(seven);
		Pane.add(eight);
		Pane.add(nine);
		
		
		Pane.add(l3);
		Pane.add(add);
		Pane.add(subtract);
		
		Pane.add(four);
		Pane.add(five);
		Pane.add(six);
	
		Pane.add(l6);
		Pane.add(multiply);
		Pane.add(divide);
		Pane.add(one);
		Pane.add(two);
		Pane.add(three);
		Pane.add(l7);
		Pane.add(l8);
		Pane.add(l9);
		Pane.add(l10);
		Pane.add(l11);
		Pane.add(zero);
		Pane.add(dot);
		
		Pane.add(l15);
		Pane.add(equal);
		Pane.add(delete);
		Pane.add(l16);
		Pane.add(l17);
		Pane.add(on);
		Pane.add(off);
	
		
		
		this.setContentPane(Pane);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(event.getSource()==on) {
				enable();
			}
			else if(event.getSource()==off) {
				disable();
			}
			if(src.equals(one)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="1";
					}else {
						firstnum=firstnum+"1";
					}
				}else {
					if(secondnum==null) {
						secondnum="1";
					}else {
						secondnum=secondnum+"1";
					}

				}
				
			}
			if(src.equals(two)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="2";
					}else {
						firstnum=firstnum+"2";
					}
				}else {
					if(secondnum==null) {
						secondnum="2";
					}else {
						secondnum=secondnum+"2";
					}

				}
				
			}
			if(src.equals(three)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="3";
					}else {
						firstnum=firstnum+"3";
					}
				}else {
					if(secondnum==null) {
						secondnum="3";
					}else {
						secondnum=secondnum+"3";
					}

				}
				
			}
			if(src.equals(four)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="4";
					}else {
						firstnum=firstnum+"4";
					}
				}else {
					if(secondnum==null) {
						secondnum="4";
					}else {
						secondnum=secondnum+"4";
					}

				}
				
			}
			if(src.equals(five)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="5";
					}else {
						firstnum=firstnum+"5";
					}
				}else {
					if(secondnum==null) {
						secondnum="5";
					}else {
						secondnum=secondnum+"5";
					}

				}
				
			}
			if(src.equals(six)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="6";
					}else {
						firstnum=firstnum+"6";
					}
				}else {
					if(secondnum==null) {
						secondnum="6";
					}else {
						secondnum=secondnum+"6";
					}

				}
				
			}
			if(src.equals(seven)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="7";
					}else {
						firstnum=firstnum+"7";
					}
				}else {
					if(secondnum==null) {
						secondnum="7";
					}else {
						secondnum=secondnum+"7";
					}

				}
				
			}
			if(src.equals(eight)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="8";
					}else {
						firstnum=firstnum+"8";
					}
				}else {
					if(secondnum==null) {
						secondnum="8";
					}else {
						secondnum=secondnum+"8";
					}

				}
				
			}
			if(src.equals(nine)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="9";
					}else {
						firstnum=firstnum+"9";
					}
				}else {
					if(secondnum==null) {
						secondnum="9";
					}else {
						secondnum=secondnum+"9";
					}

				}
				
			}
			if(src.equals(zero)) { 
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="0";
					}else {
						firstnum=firstnum+"0";
					}
				}else {
					if(secondnum==null) {
						secondnum="0";
					}else {
						secondnum=secondnum+"0";
					}

				}
				
			}
			
			if(src.equals(dot)) {
				if(operationChosen==false) {
					if(firstnum==null) {
						firstnum="0.";
					}else {
						if(firstnum!=null) {
							if(firstnum.contains(".")) {
								System.out.println("already has a decimal");	
							}else {
								firstnum=firstnum +".";
							}
						}else {
							if(secondnum==null) {
								secondnum="0.";
							}else {
								if(secondnum!=null) {
									if(secondnum.contains(".")) {
										System.out.println("already has a decimal");
									}else {
										secondnum=secondnum + ".";
									}
								}
							}
						}
					}
				}
			}
			
			if(src.equals(delete)) {
				if(operationChosen==false) {
					if(firstnum==null) {
						//no number selected
					}else {
						firstnum=firstnum.substring(0,firstnum.length()-1);
					}
				}else {
					if(secondnum==null) {
						//no number selected
					}else {
						secondnum=secondnum.substring(0,secondnum.length()-1);
					}
				}
			}
			
			
			if(equalsclicked==false) {
			if(operationChosen==false) {
				textfield.setText(firstnum);
			}else {
				textfield.setText(secondnum);
			}
		}

}
	
}
	private class Calculations implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(add)) {
				if(firstnum==null) {
					//choose your number first
				}else {
					if(firstnum!= null && secondnum==null) {
					operationChosen=true;
					operation='+';
					}else {
						if(firstnum!= null && secondnum!=null) {
							//two operations only
						}
					}
				}
			}
			if(src.equals(subtract)) {
				if(firstnum==null) {
					//choose your number first
				}else {
					if(firstnum!= null && secondnum==null) {
					operationChosen=true;
					operation='-';
					}else {
						if(firstnum!= null && secondnum!=null) {
							//two operations only
						}
					}
				}
			}
			
			if(src.equals(multiply)) {
				if(firstnum==null) {
					//choose your number first
				}else {
					if(firstnum!= null && secondnum==null) {
					operationChosen=true;
					operation='*';
					}else {
						if(firstnum!= null && secondnum!=null) {
							//two operations only
						}
					}
				}
			}
			
			if(src.equals(divide)) {
				if(firstnum==null) {
					//choose your number first
				}else {
					if(firstnum!= null && secondnum==null) {
					operationChosen=true;
					operation='/';
					}else {
						if(firstnum!= null && secondnum!=null) {
							//two operations only
						}
					}
				}
		
			}
			
			if(src.equals(equal)) {
				if(firstnum==null) {
					//choose your number first
				}else {
					if(firstnum!=null && secondnum==null) {
					//choose BOTH numbers first
					}else {
						if(firstnum!=null && secondnum!=null) {
							double d1=0.0,d2=0.0;
							d1=Double.parseDouble(firstnum);
							d2=Double.parseDouble(secondnum);
							
							switch(operation) {
							case'+':
								answer=d1+d2;
								break;
							case'-':
								answer=d1-d2;
								break;
							case'*':
								answer=d1*d2;
								break;
							case'/':
								answer=d1/d2;
								break;
							}
							
							sanswer=Double.toString(answer);
							textfield.setText(sanswer);
							if(operation=='/' && d2==0.0) {
								textfield.setText("ERROR");
							}
							
							
						}
					}
				}
			}
				if(src.equals(reset)) {
					firstnum=null;
					secondnum=null;
					equalsclicked=false;
					operationChosen=false;
					operation=' ';
					textfield.setText(null);
					sanswer=null;
				}
	
		}
	}
	
	public void enable() {
		on.setEnabled(false);
		off.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		zero.setEnabled(true);
		equal.setEnabled(true);
		add.setEnabled(true);
		subtract.setEnabled(true);
		multiply.setEnabled(true);
		divide.setEnabled(true);
		dot.setEnabled(true);
		delete.setEnabled(true);
	}
	
	public void disable() {
		textfield.setText(" ");
		on.setEnabled(true);
		off.setEnabled(false);
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		zero.setEnabled(false);
		equal.setEnabled(false);
		add.setEnabled(false);
		subtract.setEnabled(false);
		multiply.setEnabled(false);
		divide.setEnabled(false);
		dot.setEnabled(false);
		delete.setEnabled(false);
	}
}


