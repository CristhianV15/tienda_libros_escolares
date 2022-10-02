/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Categorialibro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author VALLADOLID
 */
@Stateless
public class CategorialibroFacade extends AbstractFacade<Categorialibro> implements CategorialibroFacadeLocal {

    @PersistenceContext(unitName = "TiendaLibrosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorialibroFacade() {
        super(Categorialibro.class);
    }
    
}
