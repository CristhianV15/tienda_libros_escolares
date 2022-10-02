/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author VALLADOLID
 */
@Entity
@Table(name = "categorialibro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorialibro.findAll", query = "SELECT c FROM Categorialibro c")
    , @NamedQuery(name = "Categorialibro.findByIdCategoriaLibro", query = "SELECT c FROM Categorialibro c WHERE c.idCategoriaLibro = :idCategoriaLibro")
    , @NamedQuery(name = "Categorialibro.findByNombre", query = "SELECT c FROM Categorialibro c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Categorialibro.findByEstado", query = "SELECT c FROM Categorialibro c WHERE c.estado = :estado")})
public class Categorialibro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCategoriaLibro")
    private Integer idCategoriaLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private Character estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoria")
    private Collection<Libroescolar> libroescolarCollection;

    public Categorialibro() {
        estado=1;
    }
    

    public Categorialibro(Integer idCategoriaLibro) {
        this.idCategoriaLibro = idCategoriaLibro;
    }

    public Categorialibro(Integer idCategoriaLibro, String nombre, Character estado) {
        this.idCategoriaLibro = idCategoriaLibro;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getIdCategoriaLibro() {
        return idCategoriaLibro;
    }

    public void setIdCategoriaLibro(Integer idCategoriaLibro) {
        this.idCategoriaLibro = idCategoriaLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Libroescolar> getLibroescolarCollection() {
        return libroescolarCollection;
    }

    public void setLibroescolarCollection(Collection<Libroescolar> libroescolarCollection) {
        this.libroescolarCollection = libroescolarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaLibro != null ? idCategoriaLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorialibro)) {
            return false;
        }
        Categorialibro other = (Categorialibro) object;
        if ((this.idCategoriaLibro == null && other.idCategoriaLibro != null) || (this.idCategoriaLibro != null && !this.idCategoriaLibro.equals(other.idCategoriaLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Categorialibro[ idCategoriaLibro=" + idCategoriaLibro + " ]";
    }
    
}
