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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "libroescolar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libroescolar.findAll", query = "SELECT l FROM Libroescolar l")
    , @NamedQuery(name = "Libroescolar.findByIdLibroEscolar", query = "SELECT l FROM Libroescolar l WHERE l.idLibroEscolar = :idLibroEscolar")
    , @NamedQuery(name = "Libroescolar.findByNombre", query = "SELECT l FROM Libroescolar l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "Libroescolar.findByDescripcion", query = "SELECT l FROM Libroescolar l WHERE l.descripcion = :descripcion")
    , @NamedQuery(name = "Libroescolar.findByStock", query = "SELECT l FROM Libroescolar l WHERE l.stock = :stock")
    , @NamedQuery(name = "Libroescolar.findByPrecio", query = "SELECT l FROM Libroescolar l WHERE l.precio = :precio")
    , @NamedQuery(name = "Libroescolar.findByImagen", query = "SELECT l FROM Libroescolar l WHERE l.imagen = :imagen")
    , @NamedQuery(name = "Libroescolar.findByEstado", query = "SELECT l FROM Libroescolar l WHERE l.estado = :estado")})
public class Libroescolar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLibroEscolar")
    private Integer idLibroEscolar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock")
    private int stock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private Character estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLibroEscolar")
    private Collection<Notificacioncliente> notificacionclienteCollection;
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoriaLibro")
    @ManyToOne(optional = false)
    private Categorialibro idCategoria;
    @JoinColumn(name = "idEditorial", referencedColumnName = "idEditorial")
    @ManyToOne(optional = false)
    private Editoriallibro idEditorial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLibroEscolar")
    private Collection<Detalleventa> detalleventaCollection;

    public Libroescolar() {
    }

    public Libroescolar(Integer idLibroEscolar) {
        this.idLibroEscolar = idLibroEscolar;
    }

    public Libroescolar(Integer idLibroEscolar, String nombre, String descripcion, int stock, double precio, String imagen, Character estado) {
        this.idLibroEscolar = idLibroEscolar;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.imagen = imagen;
        this.estado = estado;
    }

    public Integer getIdLibroEscolar() {
        return idLibroEscolar;
    }

    public void setIdLibroEscolar(Integer idLibroEscolar) {
        this.idLibroEscolar = idLibroEscolar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Notificacioncliente> getNotificacionclienteCollection() {
        return notificacionclienteCollection;
    }

    public void setNotificacionclienteCollection(Collection<Notificacioncliente> notificacionclienteCollection) {
        this.notificacionclienteCollection = notificacionclienteCollection;
    }

    public Categorialibro getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categorialibro idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Editoriallibro getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Editoriallibro idEditorial) {
        this.idEditorial = idEditorial;
    }

    @XmlTransient
    public Collection<Detalleventa> getDetalleventaCollection() {
        return detalleventaCollection;
    }

    public void setDetalleventaCollection(Collection<Detalleventa> detalleventaCollection) {
        this.detalleventaCollection = detalleventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibroEscolar != null ? idLibroEscolar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libroescolar)) {
            return false;
        }
        Libroescolar other = (Libroescolar) object;
        if ((this.idLibroEscolar == null && other.idLibroEscolar != null) || (this.idLibroEscolar != null && !this.idLibroEscolar.equals(other.idLibroEscolar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Libroescolar[ idLibroEscolar=" + idLibroEscolar + " ]";
    }
    
}
