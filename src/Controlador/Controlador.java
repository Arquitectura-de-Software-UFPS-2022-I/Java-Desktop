/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import models.UserDto;
import services.impl.UserServiceImpl;



/**
 *
 * @author Jose
 */
public class Controlador {
    
    UserServiceImpl x = new UserServiceImpl();
    
    public Controlador() {
    }
    
    public UserDto RegistraUsuario(String nombres, String email, String usuario, String contra) throws Exception{
        UserDto u = new UserDto();
        u.setFull_name(nombres);
        u.setEmail(email);
        u.setUsername(usuario);
        u.setPassword(contra);
        
        try {
            return x.saveUser(u);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public UserDto login(String contra, String usuario) throws Exception{
        try {
            return x.loginUser(contra, usuario);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public void Firma(File imagen) throws IOException{
        byte[] fileContent = Files.readAllBytes(imagen.toPath());
        String datosImagen = Base64.getEncoder().encodeToString(fileContent);
        
        
    }
    
    /*
    public static void main(String[] args) throws Exception {
        Controlador c = new Controlador();
        //System.out.print(c.RegistraUsuario("Antonio Duartes Peres", "antonio@ufps.edu.co", "antonioElPro", "123456"));
        UserDto u = c.login("123456", "antonioElPro");
        System.out.print(u.getEmail() + " " + u.getFull_name());
    }
    */
}
