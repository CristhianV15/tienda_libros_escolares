package entidad;

import entidad.Libroescolar;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-10-11T11:19:23")
@StaticMetamodel(Editoriallibro.class)
public class Editoriallibro_ { 

    public static volatile SingularAttribute<Editoriallibro, Character> estado;
    public static volatile SingularAttribute<Editoriallibro, Integer> idEditorial;
    public static volatile SingularAttribute<Editoriallibro, String> nombre;
    public static volatile CollectionAttribute<Editoriallibro, Libroescolar> libroescolarCollection;

}