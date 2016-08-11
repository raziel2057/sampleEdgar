/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.espe.arqui.web;

import ec.com.espe.arqui.modelo.Cliente;
import ec.com.espe.arqui.servicios.ClienteServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author rdne1
 */
@ViewScoped
@ManagedBean
public class ClienteBean implements Serializable {
    @EJB
    private ClienteServicio clienteServicio;
    
    private List<Cliente> clientes;
    private Cliente clienteSelected;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getClienteSelected() {
        return clienteSelected;
    }

    public void setClienteSelected(Cliente clienteSelected) {
        this.clienteSelected = clienteSelected;
    }
    
    
    
    @PostConstruct
    public void inicializar() {
        this.clientes=this.clienteServicio.obtenerTodas();
    }
}
