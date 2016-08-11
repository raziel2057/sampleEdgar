/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.espe.arqui.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rdne1
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "CODIGO_C", nullable = false)
    private Integer codigo;
    
    @Column(name = "IDENTIFICACION_C", nullable = false)
    private String identificacion;
    
    @Column(name = "NOMBRES_C", nullable = false)
    private String nombre;
    
    @Column(name = "NUM_TARJETA_C", nullable = false)
    private String numTarjeta;

    public Cliente() {
    }

    public Cliente(Integer codigo, String identificacion, String nombre, String numTarjeta) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.numTarjeta = numTarjeta;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", identificacion=" + identificacion + ", nombre=" + nombre + ", numTarjeta=" + numTarjeta + '}';
    }
    
    
}
