package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private static final int FRAME_LENGHT=300;
    private static final int FRAME_HEIGHT=200;
    private static final int FRAME_X_ORIGIN=150;
    private static final int FRAME_Y_ORIGIN=250;
    private static final int BUTTON_LENGHT=80;
    private static final int BUTTON_HEIGHT=60;
    
    private JButton one,two,three,four,five,six,seven,eight,nine,zero,dot,add,sub,div,multiply,equal,reset;
    private JTextField inputline;
    private String firstnum,secondnum,result;
    private Double answer=0.0;
    private boolean equalsclicked=false, operationChosen=false;
    char operation=' ';
	
	public GUI() {
	Container ContentPane=getContentPane();
        //set frame properties
        setTitle("My calculator");
        setSize(FRAME_LENGHT,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        
        //to set layout manager
        ContentPane.setLayout(new FlowLayout());
        //textfield 
        inputline=new JTextField();
        inputline.setColumns(22);
        ContentPane.add(inputline);
        //creating buttons and setting them on the frames content pane
        one=new JButton("1");
        one.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(one);
        
        two=new JButton("2");
        two.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(two);
        
        three=new JButton("3");
        three.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(three);
        
        four=new JButton("4");
        four.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(four);
        
        five=new JButton("5");
        five.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(five);
        
        six=new JButton("6");
        six.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(six);
        
        seven=new JButton("7");
        seven.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(seven);
        
        eight=new JButton("8");
        eight.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(eight);
        
        nine=new JButton("9");
        nine.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(nine);
        
        zero=new JButton("0");
        zero.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(zero);
        
        dot=new JButton(".");
        dot.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(dot);
        
        add=new JButton("+");
        add.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(add);
        
        sub=new JButton("-");
        sub.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(sub);
        
        multiply=new JButton("*");
        multiply.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(multiply);
        
        div=new JButton("/");
        div.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(div);
        
        equal=new JButton("=");
        equal.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(equal);
        
        reset=new JButton("C");
        reset.setSize(BUTTON_LENGHT,BUTTON_HEIGHT);
        ContentPane.add(reset);
        
        buttonHandler handler= new buttonHandler();
        one.addActionListener(handler);two.addActionListener(handler);three.addActionListener(handler);four.addActionListener(handler);five.addActionListener(handler);six.addActionListener(handler);
        seven.addActionListener(handler);eight.addActionListener(handler);nine.addActionListener(handler);zero.addActionListener(handler);dot.addActionListener(handler);add.addActionListener(handler);sub.addActionListener(handler);
        div.addActionListener(handler);multiply.addActionListener(handler);equal.addActionListener(handler);reset.addActionListener(handler);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);	
      }
	
	private class buttonHandler implements ActionListener{
        public buttonHandler(){
    }
       public void actionPerformed(ActionEvent event){
           JButton clickedButton=(JButton)event.getSource();
           if(clickedButton.equals(one)) { 
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
             if(clickedButton.equals(two)) { 
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
               if(clickedButton.equals(three)) { 
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
                 if(clickedButton.equals(four)) { 
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
                   if(clickedButton.equals(five)) { 
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
                     if(clickedButton.equals(six)) { 
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
                       if(clickedButton.equals(seven)) { 
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
                         if(clickedButton.equals(eight)) { 
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
                           if(clickedButton.equals(nine)) { 
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
                             if(clickedButton.equals(zero)) { 
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
           
           if(clickedButton.equals(dot)){
               if(operationChosen==false){
                   if(firstnum==null){
                       firstnum="0.";
                   }else{
                       if(firstnum!=null){
                           if(firstnum.contains(".")){
                               //already has a decimal
                           }else{
                               firstnum=firstnum+".";
                           }
                       }else{
                           if(secondnum==null){
                               secondnum="0.";
                           }else{
                               if(secondnum!=null){
                                   if(secondnum.contains(".")){
                                       //already has a decimal
                                   }else{
                                       secondnum=secondnum+".";
                                   }
                               }
                           }
                       }
                   }
               }
           }
           
           if(equalsClicked==false) {
			if(operationChosen==false) {
				inputline.setText(firstnum);
			}else {
				inputline.setText(secondnum);
			}
		}

           if(clickedButton.equals(add)) {
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
           if(clickedButton.equals(sub)) {
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
           if(clickedButton.equals(multiply)) {
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
           if(clickedButton.equals(div)) {
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
                 
           
			
			if(clickedButton.equals(equal)) {
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
							
							result=Double.toString(answer);
							inputline.setText(result);
							if(operation=='/' && d2==0.0) {
								inputline.setText("ERROR");
							}
                                                }
                                                        
                       if(clickedButton.equals(reset)) {
			firstnum=null;
			secondnum=null;
			equalsClicked=false;
			operationChosen=false;
			operation=' ';
			inputline.setText(null);
			result=null;
				}
           
       }
    }
}
                        }
       }
    }



	
	
	
