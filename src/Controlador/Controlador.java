/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import models.FileDto;
import models.UserDto;
import services.impl.FileServiceImpl;
import services.impl.UserServiceImpl;

/**
 *
 * @author Jose
 */
public class Controlador {

    UserServiceImpl x = new UserServiceImpl();
    FileServiceImpl y = new FileServiceImpl();

    public Controlador() {
    }

    public UserDto RegistraUsuario(String nombres, String email, String usuario, String contra) throws Exception {
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

    public UserDto login(String contra, String usuario) throws Exception {
        try {
            return x.loginUser(contra, usuario);
        } catch (Exception ex) {
            return null;
        }
    }

    public UserDto actualizar(UserDto user) {
        try {
            UserDto u = user;
            return x.updateUser(u);
        } catch (Exception ex) {
            return null;
        }
    }

    public UserDto Firma(File imagen, UserDto user) throws Exception {
        /**
         * File a Base64
         */
        //byte[] fileContent = Files.readAllBytes(imagen.toPath());
        //String datosImagen = Base64.getEncoder().encodeToString(fileContent);
        try {
            FileDto fd = y.saveFile(imagen.getName(), imagen);
            user.setSignature(fd.getId());
            return actualizar(user);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public FileDto TraerFirma(UserDto user) throws Exception{
        try {
            return y.getFileId(user.getSignature());
        } catch (Exception e) {
            return null;
        }
        
    }

    /*
    public static void main(String[] args) throws Exception {
        Controlador c = new Controlador();
        //System.out.print(c.RegistraUsuario("Antonio Duartes Peres", "antonio@ufps.edu.co", "antonioElPro", "123456"));
        //UserDto u = c.login("123456", "antonioElPro");
        //System.out.print(u.getPassword());
        //u.setFull_name("Antonio Luartes Perez");
        //u = c.x.updateUser(u);
        //UserDto u = c.x.getUserId(17);
        //System.out.print(u.getEmail() + " " + u.getFull_name());
        
        //UserDto u = c.login("123456", "pino");
        //System.out.print(u.getSignature());
        //FileDto fd = c.y.getFileId(u.getSignature());
        //System.out.println(fd);
        UserDto u = c.x.getUserId(27);
    }
    */
}
