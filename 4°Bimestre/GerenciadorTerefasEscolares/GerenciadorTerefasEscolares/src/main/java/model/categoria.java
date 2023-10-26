package model;

import jakarta.persistence.*;

@Table
@Entity
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCat;
    @Column
    private String  nomeCat;

    public categoria(String nomeCat) {
        this.nomeCat = nomeCat;
    }

    public Integer getIdCat() {
        return idCat;
    }

    public void setIdCat(Integer idCat) {
        this.idCat = idCat;
    }

    public String getNomeCat() {
        return nomeCat;
    }

    public void setNomeCat(String nomeCat) {
        this.nomeCat = nomeCat;
    }

    @Override
    public String toString() {
        return "categoria{" +
                "idCat=" + idCat +
                ", nomeCat='" + nomeCat + '\'' +
                '}';
    }
}
