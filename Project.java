import java.util.*;
import javax.swing.*;
import java.awt.event.*;
//import net.objecthunter.exp4j.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
class A extends JFrame

{
public int i=0;
ArrayList<String>history;
JTextField t1=new JTextField();

JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("0");
JButton b11=new JButton("+");
JButton b12=new JButton("-");
JButton b13=new JButton("*");
JButton b14=new JButton("/");
JButton b15=new JButton("x*y");
JButton b16=new JButton("sqrt");
JButton b17=new JButton("ln");
JButton b18=new JButton("Cos");
JButton b19=new JButton("Sin");
JButton b20=new JButton("Tan");
JButton b21=new JButton("=");
JButton b22=new JButton("C");
JButton b23=new JButton("(");
JButton b24=new JButton(")");
JButton b25=new JButton(",");
JButton b26=new JButton(".");
JButton b27=new JButton("Delete");
JButton b28=new JButton("History");

public A()
{
history=new ArrayList<>();
t1.setBounds(30,15,313,45);

b1.setBounds(30,120,67,40);
b2.setBounds(112,120,67,40);
b3.setBounds(194,120,67,40);
b4.setBounds(276,120,67,40);
b5.setBounds(30,175,67,40);
b6.setBounds(112,175,67,40);
b7.setBounds(194,175,67,40);
b8.setBounds(276,175,67,40);
b9.setBounds(30,230,67,40);
b10.setBounds(112,230,67,40);
b11.setBounds(194,230,67,40);
b12.setBounds(276,230,67,40);
b13.setBounds(30,285,67,40);
b14.setBounds(112,285,67,40);
b15.setBounds(194,285,67,40);
b16.setBounds(276,285,67,40);
b17.setBounds(30,340,67,40);
b18.setBounds(112,340,67,40);
b19.setBounds(194,340,67,40);
b20.setBounds(276,340,67,40);
b21.setBounds(276,450,67,40);
b22.setBounds(276,395,67,40);
b23.setBounds(30,395,67,40);
b24.setBounds(112,395,67,40);
b25.setBounds(30,450,67,40);
b26.setBounds(112,450,67,40);
b27.setBounds(194,395,67,40);
b28.setBounds(30,65,75,40);

add(t1);

add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(b11);
add(b12);
add(b13);
add(b14);
add(b15);
add(b16);
add(b17);
add(b18);
add(b19);
add(b20);
add(b21);
add(b22);
add(b23);
add(b24);
add(b25);
add(b26);
add(b27);
add(b28);

t1.setEditable(false);
setLayout(null);
setTitle("Deepa's Scientific Calculator");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400,520);
setVisible(true);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText = t1.getText();
t1.setText(currentText +""+ b1.getText());
}
});
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b2.getText());
}
});
b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b3.getText());
}
});
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b4.getText());
}
});
b5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b5.getText());
}
});
b6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b6.getText());
}
});
b7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b9.getText());
}
});
b8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText =t1.getText();
t1.setText(currentText+""+b8.getText());
}
});
b9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText+""+b9.getText());
}
});
b10.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b10.getText());
}
});
b11.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b11.getText());
}
});
b12.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b12.getText());
}
});
b13.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b13.getText());
}
});
b14.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b14.getText());
}
});
b15.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +"pow(");
}
});
b16.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +"sqrt(");
}
});
b17.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +"log(");
}
});
b18.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +"cos(");
}
});
b19.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +"sin(");
}
});
b20.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +"tan(");
}
});
b21.addActionListener(e -> {
try {
String expressionString = t1.getText();
Expression expression = new ExpressionBuilder(expressionString).build();
double result = expression.evaluate();
t1.setText(String.valueOf(result));
history.add(expressionString+"="+result);
}
catch (Exception ex) {
t1.setText("Error in Expression");
}
});
b22.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText("");
}
});
b23.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b23.getText());
}
});
b24.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b24.getText());
}
});
b25.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b25.getText());
}
});
b26.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String currentText=t1.getText();
t1.setText(currentText +""+ b26.getText());
}
});
b27.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String text=t1.getText();
if(text.isEmpty()){
t1.setText("Nothing to delete more!!");
}
else{
text=text.substring(0,text.length()-1);
t1.setText(text);
}
}
});
b28.addActionListener(e -> openHistoryWindow());
}
public void openHistoryWindow(){
JFrame historyframe=new JFrame("Calculation History");
historyframe.setSize(300,300);
historyframe.setLayout(null);
historyframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
JTextArea area=new JTextArea();
area.setEditable(false);
for(String entry:history){
area.append(entry+"\n");
}
JScrollPane scrollPane = new JScrollPane(area);
scrollPane.setBounds(10, 10, 260, 240);
historyframe.add(scrollPane);
historyframe.setLayout(null);
historyframe.setVisible(true);
}
}
class Project
{
public static void main(String args[]){
A ob=new A();
}
}