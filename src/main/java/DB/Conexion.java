/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import DAO.ClienteDao;
import BO.ClienteBo;
import Mondelo.Cliente;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author richa
 */
public class Conexion {
    static String server="localhost";
    static int puerto=27017;
    static String base="mibase";
    static MongoClient mongo=null;
    public static DB db=null;
    
    public  static DB getConexion(){
         
        
        try {
            mongo=new MongoClient(server,puerto);
            //List<String> nombre=mongo.getDatabaseNames();
            //System.out.println(nombre.toString());
        } catch (MongoException e) {
        }
        db=mongo.getDB("mibase");
        return db;
    
    }

    
        public static void main(String[] args) {

        ClienteBo cl = new ClienteBo();
        Cliente cliente1 = new Cliente(111, "juan", 15, "yopal", 1000000);
        //Gson g = new Gson();
        
        
        
        //cl.insertCliente(cliente1);

        /*Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1.insertar");

            System.out.println("2.actualizar");
            System.out.println("3.elimiar");
            System.out.println("4.listar");
            System.out.println("5.salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            int id = 0;
            String nombre = "";
            int edad = 0;
            String direccion = "";
            int salario = 0;
            switch (opcion) {
                case 1:
                    System.out.println("Inserte una id: ");
                    id = sn.nextInt();
                    System.out.println("Inserte un nombre: ");
                    nombre = sn.next();
                    System.out.println("Inserte una edad: ");
                    edad = sn.nextInt();
                    System.out.println("Inserte una direccion: ");
                    direccion = sn.next();

                    System.out.println("Inserte un salario: ");
                    salario = sn.nextInt();
                    Cliente cliente1 = new Cliente(id, nombre, edad, direccion, salario);
                    cl.insertCliente(cliente1);
                    System.out.println("INSERTADO CORRECTAMENTE");
                    break;
                case 2:
                    System.out.println("Inserte una id a modificar: ");
                    id = sn.nextInt();
                    System.out.println("Inserte un nombre: ");
                    nombre = sn.next();
                    System.out.println("Inserte una edad: ");
                    edad = sn.nextInt();
                    System.out.println("Inserte una direccion: ");
                    direccion = sn.next();
                    System.out.println("Inserte un salario: ");
                    salario = sn.nextInt();
                    Cliente aux =new  Cliente(id, nombre, edad, direccion, salario);
                    cl.updateCliente(aux);
                    break;
                case 3:
                    System.out.println("Inserte una id a eliminar: ");
                    id = sn.nextInt();
                    cl.deleteCliente(id);
                    break;
                case 4:
                    cl.listarCliente();
                    break;
                case 5:
                    salir = true;
                    break;

                default:
                    break;
            }

        }*/

    }
    
}
