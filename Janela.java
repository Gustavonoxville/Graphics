/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphics;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Patricio JP
 */
public class Janela extends JFrame{
   private JFrame jan;
   private JButton bt1, bt2, bt3;
   private JLabel lb1, label2, label3, label4;
   public Janela(){
       jan = new JFrame();
       jan.setSize(300, 300);
       jan.getContentPane().setBackground(Color.black);
       jan.setVisible(true);
       jan.setTitle("Aplicação Swing");
       //Criando Labels
       lb1 = new JLabel("Label 1");
       lb1.setBounds(40, 20, 50, 50);
       lb1.setForeground(Color.white);
       label2 = new JLabel("Label 2");
       label2.setBounds(40, 50, 50, 50);
       label2.setForeground(Color.white);
       label3 = new JLabel("Label 3");
       label3.setBounds(40, 80, 50, 50);
       label3.setForeground(Color.white);
       label4 = new JLabel(".");
       label4.setBounds(40, 110, 50, 50);
       label4.setForeground(Color.black);
       
       //Cria Botoes
       bt1 = new JButton("Botao 01");
       bt1.setBounds(100, 33, 90, 23);
       bt2 = new JButton("Botao 02");
       bt2.setBounds(100, 63, 90, 23);
       bt3 = new JButton("Botao 03");
       bt3.setBounds(100, 93, 90, 23);
       jan.getContentPane().add(bt1);
       jan.getContentPane().add(bt2);
       jan.getContentPane().add(bt3);
       jan.getContentPane().add(lb1);
       jan.getContentPane().add(label2);
       jan.getContentPane().add(label3);
       jan.getContentPane().add(label4);
   }
}
