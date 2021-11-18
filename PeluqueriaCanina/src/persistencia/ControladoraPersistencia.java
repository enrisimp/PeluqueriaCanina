package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    ClienteJpaController cliJPA = new ClienteJpaController ();
    
    //método para alta
    public void crearCliente (Cliente cli) {
        try {
            cliJPA.create(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// método para baja
    public void eliminarCliente(int num_cliente) {
        try {
            cliJPA.destroy(num_cliente);
            //cliJPA.destroy(cli.getNum_cliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void eliminarCliente(Cliente cli) {
        try {
            cliJPA.destroy(cli.getNum_cliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
// método para modificar    
    public void modificarCliente(Cliente cli) {
        try {
            cliJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// método para lectura
    public List<Cliente> traerClientes() {
        List <Cliente> listaClientes = cliJPA.findClienteEntities(); //devuelve todos los registros en forma de lista
        return listaClientes;
    }

 // método para busqueda
    public Cliente traerCliente(int num_cliente) {
        Cliente cli = cliJPA.findCliente(num_cliente);
        // Cliente cli = cliJPA.findCliente(cli.getNum_cliente());
        return cli;
    }
    
    public Cliente traerCliente(Cliente cli) {
        return cliJPA.findCliente(cli.getNum_cliente());
    }
    
}
