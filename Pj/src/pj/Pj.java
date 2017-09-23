/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
/**
 *
 * @author 22437
 */
public class Pj extends JFrame{
    public UsuarioEstudiante[] estudiante;
    public static UsuarioEstudiante[] vectorEstudiante = new UsuarioEstudiante[100];
    String usuarioA= "admin";
    String contraseniaA = "admin";    
    static String nombre;
    
    public Pj(UsuarioEstudiante[]vectorEstudiante){
        JLabel lblUsuario = new JLabel("Usuario: ");
        JLabel lblContrasenia = new JLabel("Contraseña: ");
        JTextField txtUsuario = new JTextField();
    
        JPasswordField passContrasenia = new JPasswordField();
    
        JButton btnAcceder = new JButton("Acceder");
        JButton btnMostrar = new JButton("Mostrar");
        setLayout(null);
        setTitle("Login");
        setSize(320, 220);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        lblUsuario.setBounds(20, 20, 50, 25);
        txtUsuario.setBounds(130, 20, 150, 25);
        lblContrasenia.setBounds(20, 60, 80, 25);
        passContrasenia.setBounds(130, 60, 150, 25);
        btnAcceder.setBounds(75, 100, 100, 25);
        btnMostrar.setBounds(210, 100, 100, 25);
        this.add(lblUsuario);
        this.add(lblContrasenia);
        this.add(txtUsuario);
        this.add(passContrasenia);
        this.add(btnAcceder);
        btnAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioE = txtUsuario.getText();
                String contraseniaE = passContrasenia.getText();
                for (int i = 0; i<vectorEstudiante.length; i++){
                    if(vectorEstudiante[i]!=null){
                        if (vectorEstudiante[i].getUsuario().equals(usuarioE)){
                            if(vectorEstudiante[i].getContrasenia().equals(contraseniaE)){
                                nombre = vectorEstudiante[i].getNombre();
                                Menu menu = new Menu();
                                menu.setVisible(true);
                                setVisible(false);
              
                            }else{
                                
                            }
                        }
                    }
        
                }
        
                if(txtUsuario.getText().equals(usuarioA)){
                    if(passContrasenia.getText().equals(contraseniaA)){
                         SuperUsuario sp  = new SuperUsuario();
                        sp.setVisible(true);
                        setVisible(false);
                        
                    }           
                }else{
                    
                } 
            
            }
        });    
    }
    
    
    

    
    public static void main(String[] args) {
        //Pj pj = new Pj(vectorEstudiante);
        //pj.show();
        SuperUsuario pp = new SuperUsuario();
        pp.show();
        
        vectorEstudiante [0]= new UsuarioEstudiante("Hola","a","s",/* "ProPisto",*/12,30);
        vectorEstudiante [1]= new UsuarioEstudiante("Holas","as","sa"/*,"CashMoney"*/, 13,31);
    }
    
}
