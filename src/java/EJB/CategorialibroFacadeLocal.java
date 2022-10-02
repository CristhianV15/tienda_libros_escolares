/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Categorialibro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author VALLADOLID
 */
@Local
public interface CategorialibroFacadeLocal {

    void create(Categorialibro categorialibro);

    void edit(Categorialibro categorialibro);

    void remove(Categorialibro categorialibro);

    Categorialibro find(Object id);

    List<Categorialibro> findAll();

    List<Categorialibro> findRange(int[] range);

    int count();
    
}
