package entidad;

import entidad.Libroescolar;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-10-09T19:33:30")
@StaticMetamodel(Categorialibro.class)
public class Categorialibro_ { 

    public static volatile SingularAttribute<Categorialibro, Character> estado;
    public static volatile SingularAttribute<Categorialibro, Integer> idCategoriaLibro;
    public static volatile SingularAttribute<Categorialibro, String> nombre;
    public static volatile CollectionAttribute<Categorialibro, Libroescolar> libroescolarCollection;

}