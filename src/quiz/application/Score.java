/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ankit
 */
public class Score  extends JFrame implements ActionListener{

    JButton close;
    public Score(String name,int score)  {
    
          setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading=new JLabel("THank You "+name+ " For Playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel score1=new JLabel("Your Score Is "+score);
        score1.setBounds(350,200,300,30);
        score1.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(score1);
        
        close=new JButton("Close");
        close.setBounds(500,400,150,40);
        close.setFont(new Font("Tahoma",Font.PLAIN,22));
        close.setBackground(new Color(30,144,255));
        close.setForeground(Color.WHITE);
        close.addActionListener(this);
        add(close);
        
        setVisible(true);
        
    }
    
    public  void actionPerformed(ActionEvent ae){
        if (ae.getSource()==close) {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
    new Score("User ",0);
    }
    
}
