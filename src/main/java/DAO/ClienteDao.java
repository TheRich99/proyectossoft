/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Mondelo.Cliente;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class ClienteDao {
    

    public void insertar(DB base, Cliente c) {
        DBCollection tabla = base.getCollection("cliente");
        BasicDBObject documento = new BasicDBObject();
        documento.put("id", c.getId());
        documento.put("Nombre", "'" + c.getNombre() + "'");
        documento.put("Edad", c.getEdad());
        documento.put("direccion", "'" + c.getDireccion() + "'");
        documento.put("salario", c.getSalario());
        tabla.insert(documento);

    }

    public void listarCliente(DB base) {

        DBCollection tabla = base.getCollection("cliente");
        DBCursor cursor = tabla.find();
        
        while (cursor.hasNext()) {
            //System.out.println(cursor.next().get("Nombre")+"--"+cursor.next().get("Edad")+"--"+cursor.next().get("direccion")+"--"+cursor.curr().get("salario"));
            System.out.println(cursor.next().get("id")+" - "+cursor.curr().get("Nombre")+"-"+cursor.curr().get("Edad")+"-"+cursor.curr().get("direccion")+" - "+cursor.curr().get("salario"));
            
        }
  

    }
    
        public void updateCliente(DB base, Cliente c) {

        DBCollection tabla = base.getCollection("cliente");
        // a quien le queremos realizar cambios
        BasicDBObject identificador = new BasicDBObject();
        identificador.append("id",c.getId());
        //nuevos datos
        BasicDBObject cambios = new BasicDBObject();
        cambios.put("id", c.getId());
        cambios.put("Nombre", "'" + c.getNombre() + "'");
        cambios.put("Edad", c.getEdad());
        cambios.put("direccion", "'" + c.getDireccion() + "'");
        cambios.put("salario", c.getSalario());
        BasicDBObject actualizar = new BasicDBObject();
        actualizar.append("$set", cambios);
        tabla.update(identificador, actualizar);
    }
        
    public void deleteCliente(DB base , int id) {
            DBCollection tabla = base.getCollection("cliente");
            tabla.remove(new BasicDBObject().append("id", id));
            

    }

}
