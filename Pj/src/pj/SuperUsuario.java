/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static pj.Pj.vectorEstudiante;

/**
 *
 * @author 22437
 */
public class SuperUsuario extends JFrame{
    JButton btnLogout = new JButton("Logout");
    JButton btnSalir = new JButton("Salir del Sistema");
    JButton btnAgregar = new JButton("Agregar");
    JButton btnMostrar = new JButton("Mostrar");
    JLabel lblTitulo = new JLabel("Bienvenido Administrador");
    JLabel lblNombre = new JLabel("Nombre:");
    JLabel lblContrasenia = new JLabel("Contraseña:");
    JLabel lblContrasenia2 = new JLabel("Contraseña:");
    JLabel lblUsuario = new JLabel("Usuario: ");
    JLabel lblSaldo = new JLabel("Saldo:                                   Q");
    JLabel lblEmpresa = new JLabel("Empresa:");
    JLabel lblMonto = new JLabel("Monto Maximo: ");
    JTextField txtNombre = new JTextField();
    JTextField txtUsuario = new JTextField();
    JTextField txtContrasenia = new JTextField();
    JTextField txtContrasenia2 = new JTextField();
    JTextField txtMonto = new JTextField();
    JTextField txtSaldo = new JTextField();
    JTextField txtEmpresa = new JTextField();
    JComboBox<String> comboEmpresa = new JComboBox<>();
    
    public SuperUsuario(){
        mostrar();
    }
    public void mostrar(){
        
        setLayout(null);
        setTitle("Administrador");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        lblNombre.setBounds(10, 50, 150, 25);
        lblUsuario.setBounds(10, 80, 150, 25);
        lblContrasenia.setBounds(10, 110, 150, 25);
        
        lblSaldo.setBounds(10, 170, 150, 25);
        
        lblMonto.setBounds(10, 140, 150, 25);
        lblEmpresa.setBounds(10, 200, 150, 25);
        comboEmpresa.setBounds(180, 200, 150, 25);
        comboEmpresa.setModel(new DefaultComboBoxModel<>(new String[] { "ProPisto", "CashMoney"}) );
        txtNombre.setBounds(180, 50, 150, 25);
        txtUsuario.setBounds(180, 80, 150, 25);
        txtContrasenia.setBounds(180, 110, 150, 25);
        txtSaldo.setBounds(180, 170, 150, 25);
        txtMonto.setBounds(180, 140, 150, 25);
        btnAgregar.setBounds(20, 300, 80, 25);
        btnMostrar.setBounds(80, 300, 80, 25);
        btnLogout.setBounds(550, 1, 80, 25);
        btnSalir.setBounds(550, 30, 140, 25);
        this.add(lblNombre);
        this.add(lblUsuario);
        this.add(lblContrasenia);
        this.add(lblSaldo);
        this.add(lblMonto);
        //this.add(lblEmpresa);
        this.add(txtNombre);
        this.add(txtUsuario);
        this.add(txtContrasenia);
        this.add(txtSaldo);
        this.add(txtMonto);
        this.add(comboEmpresa);
        this.add(btnLogout);
        this.add(btnAgregar);
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float saldo, monto;
                saldo = Float.parseFloat(txtSaldo.getText());
                monto = Float.parseFloat(txtMonto.getText());
                //txtEmpresa.setText(comboEmpresa.getSelectedItem().toString());
                if(monto>saldo){
                    UsuarioEstudiante uEst = new UsuarioEstudiante();
                    uEst.setNombre(txtNombre.getText());
                    uEst.setUsuario(txtUsuario.getText());
                    uEst.setContrasenia(txtContrasenia.getText());
                    uEst.setSaldo(saldo);
                    uEst.setMonto(monto);
                  //  uEst.setEmpresa(txtEmpresa.getText());
                    
                    for(int i = 0; i<vectorEstudiante.length;i++){
                        if(vectorEstudiante[i]==null){
                            vectorEstudiante[i]=uEst;
                            JOptionPane.showMessageDialog(null, "Usuario ingresado con exito");
                            
                            
                            System.out.println("Usuario creado: "+vectorEstudiante[i].getUsuario());
                            System.out.println("Contraseña: "+vectorEstudiante[i].getContrasenia());
                            /*System.out.println("Empresa: "+vectorEstudiante[i].getEmpresa());
                            if (comboEmpresa.getSelectedItem().toString() == "CashMoney"){
                                CashMoney cm = new CashMoney();
                                cm.setVisible(true);
                                setVisible(false);
                            
                            
                            }else if (comboEmpresa.getSelectedItem().toString() == "ProPisto"){
                                ProPisto pp = new ProPisto();
                                pp.setVisible(true);
                                setVisible(false);
                            
                            }*/
                            txtNombre.setText("");
                            txtUsuario.setText("");
                            txtContrasenia.setText("");
                            txtMonto.setText("");
                            txtSaldo.setText("");
                            break;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Saldo no puede ser mayor que Monto Maximo");
                
                }                
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No puede ingresar caracteres en lugares numericos");
                }
                
            }
        });
        btnLogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Pj pj = new Pj(vectorEstudiante);
                pj.setVisible(true);
                setVisible(false);
            }
        });
        btnSalir.addActionListener(new ActionListener() {

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
