/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.espe.arqui.dao;

import ec.com.espe.arqui.common.dao.DefaultGenericDAOImple;
import ec.com.espe.arqui.modelo.Cliente;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author rdne1
 */
@LocalBean
@Stateless
public class ClienteDAO extends DefaultGenericDAOImple<Cliente, Integer> {
    public ClienteDAO() {
        super(Cliente.class);
    }
}
