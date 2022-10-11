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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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
    //listas
    private List<Libroescolar> listarMatematica;
    private int stock=-1; // para comparar !=0
    String verPagina;
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
    
    //Para mostrar el detalle del libro
    public void encontrarLibro(Libroescolar le){
        this.libroescolar= le;
        
    }
    
    public String validarStock(int codigo){
        stock = libroescolarFacadeLocal.buscarStockLibro(codigo);
        if(stock!=0){
            //Hay stock disponible, ir a libro_vermas
            verPagina = "/paginas/libro_vermas.xhtml";
            System.out.print("lo lograste prro");
        }
        else{
            //verPagina = "/paginas/libros_notifi_stock.xhtml";
            System.out.print("sigue intentando :v  prro");
        }
        return verPagina;
    }

    public List<Libroescolar> getListarMatematica() {
        this.listarMatematica= libroescolarFacadeLocal.buscarMatematica(libroescolar);
        return listarMatematica;
    }

    public void setListarMatematica(List<Libroescolar> listarMatematica) {
        this.listarMatematica = listarMatematica;
    }
}
                                