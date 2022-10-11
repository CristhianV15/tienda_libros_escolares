/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Libroescolar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author VALLADOLID
 */
@Stateless
public class LibroescolarFacade extends AbstractFacade<Libroescolar> implements LibroescolarFacadeLocal {

    @PersistenceContext(unitName = "TiendaLibrosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroescolarFacade() {
        super(Libroescolar.class);
    }

    @Override
    public int buscarStockLibro(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
