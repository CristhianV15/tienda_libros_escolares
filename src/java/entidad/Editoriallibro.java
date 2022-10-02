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
@Table(name = "editoriallibro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Editoriallibro.findAll", query = "SELECT e FROM Editoriallibro e")
    , @NamedQuery(name = "Editoriallibro.findByIdEditorial", query = "SELECT e FROM Editoriallibro e WHERE e.idEditorial = :idEditorial")
    , @NamedQuery(name = "Editoriallibro.findByNombre", query = "SELECT e FROM Editoriallibro e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Editoriallibro.findByEstado", query = "SELECT e FROM Editoriallibro e WHERE e.estado = :estado")})
public class Editoriallibro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEditorial")
    private Integer idEditorial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private Character estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEditorial")
    private Collection<Libroescolar> libroescolarCollection;

    public Editoriallibro() {
    }

    public Editoriallibro(Integer idEditorial) {
        this.idEditorial = idEditorial;
    }

    public Editoriallibro(Integer idEditorial, String nombre, Character estado) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Integer idEditorial) {
        this.idEditorial = idEditorial;
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
        hash += (idEditorial != null ? idEditorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editoriallibro)) {
            return false;
        }
        Editoriallibro other = (Editoriallibro) object;
        if ((this.idEditorial == null && other.idEditorial != null) || (this.idEditorial != null && !this.idEditorial.equals(other.idEditorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Editoriallibro[ idEditorial=" + idEditorial + " ]";
    }
    
}
