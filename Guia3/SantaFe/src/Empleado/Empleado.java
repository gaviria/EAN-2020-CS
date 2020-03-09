
package Empleado;

import java.text.DecimalFormat;

/**
 * Maneja la información de los empleadol del centro comercial
 */
public class Empleado {

    // Atributos
    private int numero;
    private String usuario;
    private String cargo;
    private String departamento;
    private int saldo;

    // Constructor
    public Empleado(int numero, String usuario, int saldo, String cargo, String departamento) {
        this.numero = numero;
        this.usuario = usuario;
        this.saldo = saldo;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNúmero(int numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("$###,###.##");
        String saldoStr = format.format(saldo);
        return "Empleado{" + "id=" + numero + ", usuario=" + usuario + ", saldo=" + saldoStr + ", cargo=" + cargo + ", departamento=" + departamento +'}';
    }

    public void consignar(int monto) throws Exception {
        if (saldo > 0) {
            this.saldo = monto;
        }
        else {
            throw new Exception("Error en los valores");
        }
    }

}
