/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EJB.LibroescolarFacadeLocal;
import entidad.Categorialibro;
import entidad.Editoriallibro;
import entidad.Libroescolar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author VALLADOLID
 */
@ManagedBean
@SessionScoped
public class ManagedLibroEscolar {
     @EJB
    LibroescolarFacadeLocal libroescolarFacadeLocal;
    private List<Libroescolar> listarLibroEscolar;
    private Libroescolar libroescolar;
    private Categorialibro catlibro;
    private Editoriallibro edlibro;

    public List<Libroescolar> getListarLibroEscolar() {
        this.listarLibroEscolar= libroescolarFacadeLocal.findAll();
        return listarLibroEscolar;
    }

    public void setListarLibroEscolar(List<Libroescolar> listarLibroEscolar) {
        this.listarLibroEscolar = listarLibroEscolar;
    }

    public Libroescolar getLibroescolar() {
        return libroescolar;
    }

    public void setLibroescolar(Libroescolar libroescolar) {
        this.libroescolar = libroescolar;
    }
    
    //Metodos CRUD
    @PostConstruct
    //Se inician un constructor con las entidades que se usuraran
    public void init(){
        this.libroescolar = new Libroescolar();
        this.catlibro= new Categorialibro();
        this.edlibro= new Editoriallibro();
    }
    
    //Los metodos para esta clase son de encontrar libro para la busqueda y la de mostrar
    //No hay mantenimiento de guardar/eliminar libro  
    public void encontrarLibro(Libroescolar le){
        this.libroescolar= le;
    }
    
}
                                