package entidad;

import entidad.Categorialibro;
import entidad.Detalleventa;
import entidad.Editoriallibro;
import entidad.Notificacioncliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-10-11T11:04:40")
@StaticMetamodel(Libroescolar.class)
public class Libroescolar_ { 

    public static volatile SingularAttribute<Libroescolar, Integer> idLibroEscolar;
    public static volatile SingularAttribute<Libroescolar, String> descripcion;
    public static volatile SingularAttribute<Libroescolar, Double> precio;
    public static volatile SingularAttribute<Libroescolar, Character> estado;
    public static volatile SingularAttribute<Libroescolar, String> imagen;
    public static volatile CollectionAttribute<Libroescolar, Detalleventa> detalleventaCollection;
    public static volatile SingularAttribute<Libroescolar, Editoriallibro> idEditorial;
    public static volatile SingularAttribute<Libroescolar, Integer> stock;
    public static volatile CollectionAttribute<Libroescolar, Notificacioncliente> notificacionclienteCollection;
    public static volatile SingularAttribute<Libroescolar, Categorialibro> idCategoria;
    public static volatile SingularAttribute<Libroescolar, String> nombre;

}