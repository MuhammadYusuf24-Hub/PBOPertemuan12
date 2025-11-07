package Cafe;

import Cafe.Menu;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-07T18:18:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pesanan.class)
public class Pesanan_ { 

    public static volatile SingularAttribute<Pesanan, Integer> jumlah;
    public static volatile SingularAttribute<Pesanan, String> namaPelanggan;
    public static volatile SingularAttribute<Pesanan, Integer> idPesanan;
    public static volatile SingularAttribute<Pesanan, Menu> idMenu;

}