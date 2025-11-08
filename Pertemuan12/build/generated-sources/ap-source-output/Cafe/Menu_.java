package Cafe;

import Cafe.Pesanan;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-07T18:18:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, Integer> harga;
    public static volatile CollectionAttribute<Menu, Pesanan> pesananCollection;
    public static volatile SingularAttribute<Menu, Integer> idMenu;
    public static volatile SingularAttribute<Menu, String> kategori;
    public static volatile SingularAttribute<Menu, String> namaMenu;

}