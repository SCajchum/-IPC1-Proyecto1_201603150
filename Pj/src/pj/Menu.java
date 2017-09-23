/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static pj.Pj.vectorEstudiante;

/**
 *
 * @author 22437
 */
public class Menu extends JFrame{
    JButton btnProPisto = new JButton("Pro-Pisto");
    JButton btnCashMoney = new JButton();
    JButton btnLogout = new JButton("Logout");
    JLabel lblTitulo = new JLabel("Seleccione un banco");
    
    
    public Menu (){
        setLayout(null);
        setTitle("MENU"); 
        setSize(500, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
        lblTitulo.setBounds(50, 10, 150, 25);
        btnLogout.setBounds(300, 10, 90, 25);
        btnProPisto.setBounds(250, 100, 200, 200);
        btnCashMoney.setBounds(25, 100, 200, 200);
        add(lblTitulo);
        add(btnProPisto);
        btnProPisto.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ProPisto pp = new ProPisto(vectorEstudiante);
                pp.setVisible(true);
                setVisible(false);
               
           
            }
        });    
        add(btnCashMoney);
        btnCashMoney.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CashMoney cm = new CashMoney();
                cm.setVisible(true);
                setVisible(false);
                
            }
        });
        add(btnLogout);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Pj pj = new Pj(vectorEstudiante);
                pj.setVisible(true);
                
            }
        });
        
        ImageIcon cash = new ImageIcon("src/icono/cash.png");
        Icon iconoCash = new ImageIcon(cash.getImage().getScaledInstance(btnCashMoney.getWidth(), btnCashMoney.getHeight(), Image.SCALE_DEFAULT));
        btnCashMoney.setIcon(iconoCash);
        this.repaint();
        ImageIcon pisto = new ImageIcon("src/icono/pisto.png");
        Icon iconoPisto = new ImageIcon(pisto.getImage().getScaledInstance(btnProPisto.getWidth(), btnProPisto.getHeight(), Image.SCALE_DEFAULT));
        btnProPisto.setIcon(iconoPisto);
        this.repaint();
                
    }
    /*
        private void btnProPistoActionPerform(java.awt.event.ActionEvent evt){
        ProPisto pp = new ProPisto();
        pp.setVisible(true);
        this.dispose();
    
    }
    private void btnCashMoneyActionPerform(java.awt.event.ActionEvent evt){
        CashMoney cm = new CashMoney();
        cm.setVisible(true);
        this.dispose();
    
    }*/
    

    
}
