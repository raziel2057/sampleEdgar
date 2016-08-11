/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.espe.arqui.servicios;

import ec.com.espe.arqui.dao.ClienteDAO;
import ec.com.espe.arqui.modelo.Cliente;
import ec.com.espe.arqui.validator.ValidacionException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author rdne1
 */
@LocalBean
@Stateless
public class ClienteServicio {
    @EJB
    private ClienteDAO clienteDAO;
    
    public List<Cliente> obtenerTodas(){
        return this.clienteDAO.findAll();
        
    }
  
    public Cliente obtenerPorID(Integer codigo){
        return this.clienteDAO.findById(codigo, false);
    }


    public void crearCliente(Cliente cliente) throws ValidacionException {

            this.clienteDAO.insert(cliente);
               
    }
    
    public void liberar()
    {
        this.clienteDAO.flush(); 
    }

    public void actualiarBoleto(Cliente cliente){
        this.clienteDAO.update(cliente);
    }

    public void eliminarBoleto(Integer codigo) {
        try {
            Cliente clienteTmp = this.obtenerPorID(codigo);
            this.clienteDAO.remove(clienteTmp);
        } catch (Exception e) {
            throw new ValidacionException("El Asiento " + codigo + " esta asociadado a otra tabla");
        }
    }
}
