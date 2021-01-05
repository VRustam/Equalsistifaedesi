package dersler;

import java.util.Objects;

public class equalsistifaedesi {
    public static void main(String[] args) {

        Kisi k1 = new Kisi(10,"aydin");
        System.out.println(k1);

        Kisi k2 = new Kisi(10,"aydin");
        System.out.println(k2);

        System.out.println(k1.equals(k2));
        System.out.println(k1.hashCode());

    }
}

class Kisi{

    int id;
    String ad;

    public Kisi(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kisi)) return false;
        Kisi kisi = (Kisi) o;
        return id == kisi.id &&
                ad.equals(kisi.ad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ad);
    }
}
