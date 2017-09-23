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
public class ProPisto extends javax.swing.JFrame{
    public UsuarioEstudiante[] estudiante;
    public static UsuarioEstudiante[] vectorEstudiante = new UsuarioEstudiante[100];
    UsuarioEstudiante uEst = new UsuarioEstudiante();
    JButton btnLogout = new JButton("Logout");
    JButton btnMenu = new JButton("Regresar al Menu");
    JButton btnSalir = new JButton("Salir del Sistema");
    JButton btnTransaccion = new JButton("Transaccion");
    JTextField txtRecibe = new JTextField();
    JTextField txtTransaccion = new JTextField();
    JTextField txtMonto = new JTextField();
    JTextField txtUsuarioD = new JTextField();
    JTextField txtUsuarioR = new JTextField();
    JLabel lblUsuarioR = new JLabel("Usuario ingresado");
    JLabel lblBienvenido = new JLabel("Bienvenido: ");
    JLabel lblNombre = new JLabel();
    JLabel lblUsuarioD = new JLabel("Usuario: ");
    JLabel lblTransaccion = new JLabel("Transaccion");
    JComboBox<String> comboUsuarioR = new JComboBox<>();
    JComboBox<String> comboUsuarioD = new JComboBox<>();
    JComboBox<String> comboTransaccion = new JComboBox<>();
    
    
    
    
    
    
    public ProPisto(UsuarioEstudiante[]vectorEstudiante){
        setLayout(null);
        setTitle("Pro-Pisto");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        lblBienvenido.setBounds(10, 10, 100, 25);
        lblNombre.setBounds(130, 10, 200, 25);
        lblUsuarioD.setBounds(30, 90, 140, 25);
        lblUsuarioR.setBounds(30, 130, 140, 25);
        lblTransaccion.setBounds(30, 170, 140, 25);
        txtUsuarioD.setBounds(200, 90, 140, 25);
        btnTransaccion.setBounds(400, 90, 80, 25);
        txtUsuarioR.setBounds(200, 130, 140, 25);
        comboTransaccion.setBounds(200, 170, 140, 25);
        comboTransaccion.setModel(new DefaultComboBoxModel<>(new String[] { "Retiros", "Transferencias","Depositos","Consultas de saldo"}) );
        //int i = 1;
        //comboUsuarioD.setModel(new DefaultComboBoxModel<>(new String[]{uEst.nombre}));
        //vectorEstudiante [0]= new UsuarioEstudiante("Hola","a","s",/* "ProPisto",*/12,30);
        
        
        btnLogout.setBounds(550, 1, 80, 25);
        btnMenu.setBounds(550, 30, 140, 25);
        btnSalir.setBounds(550, 59, 140, 25);
        this.add(lblUsuarioD);
   //     this.add(lblUsuarioR);
        this.add(lblBienvenido);
        this.add(lblNombre);
        this.add(lblTransaccion);
        this.add(comboTransaccion);
        this.add(txtUsuarioD);
        //this.add(comboUsuarioR);
        //this.add(comboUsuarioD);
        this.add(btnLogout);
        this.add(btnTransaccion);
        btnTransaccion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtTransaccion.setText(comboTransaccion.getSelectedItem().toString());
                
                for(int i = 0; i<vectorEstudiante.length;i++){
                    if(txtUsuarioD.getText().equals(vectorEstudiante[i].getNombre())){
                if (comboTransaccion.getSelectedItem().toString() == "Retiro"){
                    float cantidad;
                    cantidad = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese cantidad: \n ")) ;
                    if(cantidad<vectorEstudiante[i].saldo){
                        vectorEstudiante[i].setSaldo(vectorEstudiante[i].getSaldo()+cantidad);
                        System.out.println(vectorEstudiante[i].getSaldo());
                    }
                }
                }
                }
            }
        });
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
