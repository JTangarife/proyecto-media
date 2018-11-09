/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Usuario
 */
public class Deudas {
    
    public String id;
    public String idusuario;
    public String valor_deudas;

    public Deudas(String idusuario, String valor_deudas, String id) {
        this.idusuario = idusuario;
        this.valor_deudas = valor_deudas;
        this.id = id;
    }
}

