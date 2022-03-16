/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.ClienteDao;
import DB.Conexion;
import Mondelo.Cliente;

/**
 *
 * @author richa
 */
public class ClienteBo {
    Conexion x=new Conexion();
    ClienteDao dao=new ClienteDao();
    public void insertCliente(Cliente c){
       
        dao.insertar(x.getConexion(), c);
    }

    public void updateCliente(Cliente aux) {
        Conexion x=new Conexion();
        dao.updateCliente(x.getConexion(), aux);
        
   }

    public void deleteCliente(int id) {
        Conexion x=new Conexion();
        dao.deleteCliente(x.getConexion(), id);
        
    }

    public void listarCliente() {
        Conexion x=new Conexion();
        dao.listarCliente(x.getConexion());
     
        
    }
    
    
}
