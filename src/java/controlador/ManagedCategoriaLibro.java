/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import EJB.CategorialibroFacadeLocal;
import entidad.Categorialibro;
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

public class ManagedCategoriaLibro {
    @EJB
    CategorialibroFacadeLocal categorialibroFacadeLocal;
    private List<Categorialibro> listarCategoriaLibro;
    private Categorialibro categorialibro;

    public List<Categorialibro> getListarCategoriaLibro() {
        this.listarCategoriaLibro= categorialibroFacadeLocal.findAll();
        return listarCategoriaLibro;
    }

    public void setListarCategoriaLibro(List<Categorialibro> listarCategoriaLibro) {
        this.listarCategoriaLibro = listarCategoriaLibro;
    }

    public Categorialibro getCategorialibro() {
        return categorialibro;
    }

    public void setCategorialibro(Categorialibro categorialibro) {
        this.categorialibro = categorialibro;
    }
    
     @PostConstruct
    public void init(){
        categorialibro = new Categorialibro();
    }
    
    public void guardarCategoria(){
        this.categorialibroFacadeLocal.create(categorialibro);
    }
    
    public void eliminarCategoria (Categorialibro cl){
        this.categorialibroFacadeLocal.remove(cl);
    }
    
    public void encontrarCategoria(Categorialibro cl){
        this.categorialibro= cl;
    }
    
    public void modificarCategoria(){
        this.categorialibroFacadeLocal.edit(categorialibro);        
    }
}
