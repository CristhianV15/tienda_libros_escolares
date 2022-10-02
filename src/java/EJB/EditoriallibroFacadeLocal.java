/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Editoriallibro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author VALLADOLID
 */
@Local
public interface EditoriallibroFacadeLocal {

    void create(Editoriallibro editoriallibro);

    void edit(Editoriallibro editoriallibro);

    void remove(Editoriallibro editoriallibro);

    Editoriallibro find(Object id);

    List<Editoriallibro> findAll();

    List<Editoriallibro> findRange(int[] range);

    int count();
    
}
