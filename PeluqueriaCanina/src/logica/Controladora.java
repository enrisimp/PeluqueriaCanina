
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia control = new ControladoraPersistencia(); // crea tabla de datos
    
    
    public void crearCliente (String nombre_perro, String raza, String color, String alergico, String atención_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        Cliente cli = new Cliente();
        cli.setNombre_perro(nombre_perro);
        cli.setRaza(raza);
        cli.setColor(color);
        cli.setAlergico(alergico);
        cli.setAtención_especial(atención_especial);
        cli.setNombre_duenio(nombre_duenio);
        cli.setCelular_duenio(celular_duenio);
        cli.setObservaciones(observaciones);
        
        control.crearCliente(cli);
    }
            
    public void crearCliente (Cliente cli) {
        control.crearCliente(cli);
    }
    public void eliminarCliente(int num_cliente) {
        control.eliminarCliente(num_cliente);
    }
    public void eliminarCliente(Cliente cli) {
        control.eliminarCliente(cli);
    }
    public void modificarCliente(Cliente cli) {
        control.modificarCliente(cli);
    }

    public List<Cliente> traerClientes() {
        return control.traerClientes();
    }

    public Cliente traerCliente(int num_cliente) {
        return control.traerCliente(num_cliente);
    }
    
    public Cliente traerCliente(Cliente cli) {
        return control.traerCliente(cli);

    }
}
