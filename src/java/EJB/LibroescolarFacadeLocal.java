/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Libroescolar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author VALLADOLID
 */
@Local
public interface LibroescolarFacadeLocal {

    void create(Libroescolar libroescolar);

    void edit(Libroescolar libroescolar);

    void remove(Libroescolar libroescolar);

    Libroescolar find(Object id);

    List<Libroescolar> findAll();

    List<Libroescolar> findRange(int[] range);
    
    int buscarStockLibro(int codigo);
    int count();
    
     List<Libroescolar> buscarMatematica(Libroescolar le);

     
}