/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioFactura;

public class Factura {
    
    private String nombreProducto;
    private double Importe;

    public Factura() {
    }

    public Factura(String nombreProducto, double Importe) {
        this.nombreProducto = nombreProducto;
        this.Importe = Importe;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    
    
}
