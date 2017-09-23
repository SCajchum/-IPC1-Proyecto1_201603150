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
public class UsuarioEstudiante {
    public String nombre, usuario, contrasenia, empresa;
    public float saldo, monto;
    
    public UsuarioEstudiante(){
        this.nombre=null;
        this.usuario=null;
        this.contrasenia=null;
        //this.empresa = null;
        this.saldo = 0;
        this.monto=0;
        
    }
    
    public UsuarioEstudiante(String nombre, String usuario, String contrasenia, /*String empresa,*/ float saldo, float monto){
        this.nombre=nombre;
        this.usuario=usuario;
        this.contrasenia=contrasenia;
        //this.empresa = empresa;
        this.saldo = saldo;
        this.monto=monto;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    
    public void setContrasenia(String contrasenia){
        this.contrasenia=contrasenia;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
    public String getEmpresa(){
        return empresa;
    }
    
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setMonto(float monto){
        this.monto=monto;
    }
    public float getMonto(){
        return monto;
    }
    
}
