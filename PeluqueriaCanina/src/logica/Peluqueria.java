package logica;

import igu.Pantalla;

public class Peluqueria {

    public static void main(String[] args) {
        Controladora control = new Controladora ();
        Pantalla pant = new Pantalla(control);
        pant.setVisible(true); //para que quede visible
        pant.setLocationRelativeTo(null); // centrado y al medio
        
        /*Cliente cli = new Cliente(0, "huesos", "galgo", "marron", "SI", "SI", "Bart", "555-0001", "Perro Malo");
        Cliente cli2 = new Cliente(1, "wick", "galgo", "marron", "SI", "SI", "Bart", "555-0001", "Perro Malo");
        */
        
        //control.crearCliente(cli);
        //control.crearCliente(cli2);
        
        //control.eliminarCliente(cli2.getNum_cliente());
        //control.eliminarCliente(cli);
        
        //cli2.setNombre_perro("Muertito");
        //cli2.setNombre_duenio("Wick");
    }
    
}