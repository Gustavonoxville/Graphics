/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Patricio JP
 */
public class Janela extends JFrame{
   private JFrame jan;
   private JButton bt1, bt2, bt3, bt4;
   private JLabel lb1, label2, label3, label4;
   private JTextField tfnum1, tfnum2, tfresult;
   private float num1, num2, result;
   public Janela(){
       innitComp();
       defEvent();
   }
   public void defEvent(){
       bt1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               num1 = Float.parseFloat(tfnum1.getText());
               num2 = Float.parseFloat(tfnum2.getText());
               result = num1 + num2;
               tfresult.setText(String.valueOf(result));
           }
       });
       bt2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               num1 = Float.parseFloat(tfnum1.getText());
               num2 = Float.parseFloat(tfnum2.getText());
               result = num1 - num2;
               tfresult.setText(String.valueOf(result));
           }
       });
       bt3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               num1 = Float.parseFloat(tfnum1.getText());
               num2 = Float.parseFloat(tfnum2.getText());
               result = num1 * num2;
               tfresult.setText(String.valueOf(result));
           }
       });
       bt4.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               num1 = Float.parseFloat(tfnum1.getText());
               num2 = Float.parseFloat(tfnum2.getText());
               result = num1 / num2;
               tfresult.setText(String.valueOf(result));
           }
       });
   }
   
   public void innitComp(){
       jan = new JFrame();
       jan.setSize(260, 225);
       jan.getContentPane().setBackground(Color.white);
       jan.setLocation(300, 300);
       jan.setVisible(true);
       jan.setTitle("XCalc");
       //Criando Labels
       lb1 = new JLabel("1º Número: ");
       lb1.setBounds(20, 20, 100, 50);
       lb1.setForeground(Color.black);
       label2 = new JLabel("2º Número:");
       label2.setBounds(20, 50, 100, 50);
       label2.setForeground(Color.black);
       label3 = new JLabel("Resultado:");
       label3.setBounds(20, 125, 100, 50);
       label3.setForeground(Color.black);
       label4 = new JLabel(".");
       label4.setBounds(40, 110, 50, 50);
       label4.setForeground(Color.white);
       //Criando os TextFields
       tfnum1 = new JTextField();
       tfnum1.setBounds(100, 33, 133, 23);
       tfnum2 = new JTextField();
       tfnum2.setBounds(100, 63, 133, 23);
       tfresult = new JTextField();
       tfresult.setBounds(102, 138, 133, 23);
       
       //Cria Botoes
       bt1 = new JButton("+");
       bt1.setBounds(20, 100, 50, 23);
       bt2 = new JButton("-");
       bt2.setBounds(75, 100, 50, 23);
       bt3 = new JButton("*");
       bt3.setBounds(130, 100, 50, 23);
       bt4 = new JButton("/");
       bt4.setBounds(185, 100, 50, 23);
       
       //Adcionando elementos ao frame
       jan.getContentPane().add(tfnum1);
       jan.getContentPane().add(tfnum2);      
       jan.getContentPane().add(tfresult);      
       jan.getContentPane().add(bt1);
       jan.getContentPane().add(bt2);
       jan.getContentPane().add(bt3);
       jan.getContentPane().add(bt4);
       jan.getContentPane().add(lb1);
       jan.getContentPane().add(label2);
       jan.getContentPane().add(label3);
       jan.getContentPane().add(label4);
       jan.setResizable(false);
   }
}
