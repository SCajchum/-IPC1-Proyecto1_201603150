/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

/**
 *
 * @author 22437
 */
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static pj.Pj.vectorEstudiante;

/**
 *
 * @author 22437
 */
public class CashMoney extends JFrame{
    JButton btnLogout = new JButton("Logout");
    JButton btnMenu = new JButton("Regresar al Menu");
    JButton btnSalir = new JButton("Salir del Sistema");
    
    
    public CashMoney(){
    setLayout(null);
        setTitle("Cash-Money");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        btnLogout.setBounds(550, 1, 80, 25);
        btnMenu.setBounds(550, 30, 140, 25);
        btnSalir.setBounds(550, 59, 140, 25);
        add(btnLogout);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Pj pj = new Pj(vectorEstudiante);
                pj.setVisible(true);
                setVisible(false);
            }
        });
        add(btnMenu);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            Menu menu = new Menu();
            menu.setVisible(true);
            setVisible(false);
            }
        });
        add(btnSalir);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object [] opcion = {"Aceptar", "Cancelar"};
                int eleccion = JOptionPane.showOptionDialog(rootPane, "Desea Salir del Sistema?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, "Aceptar" );
                if (eleccion == JOptionPane.YES_OPTION){
                    System.exit(0);
                }else{
                }
            }
        });
    }
}