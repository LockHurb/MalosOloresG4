package com.mycompany.malosoloresg4.ChangePreventersDispensables;

import com.mycompany.malosoloresg4.Couplers.Cliente;

public class ServicioDeEnvio {
    // Mal Olor: Lazy Class
    // Esta clase tiene muy poca funcionalidad y podría no justificar su existencia
    public void enviarProducto(Producto producto, Cliente cliente) {
        System.out.println("Enviando " + producto.nombre + " a " + cliente.getDireccion());
    }
}
