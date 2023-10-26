package model;

import jakarta.persistence.*;

@Table
@Entity
public class disciplina{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDis;
    @Column
    private String  nomeDis;

    public disciplina(String nomeDis) {
        this.nomeDis = nomeDis;
    }

    public Integer getIdDis() {
        return idDis;
    }

    public void setIdDis(Integer idDis) {
        this.idDis = idDis;
    }

    public String getNomeDis() {
        return nomeDis;
    }

    public void setNomeDis(String nomeDis) {
        this.nomeDis = nomeDis;
    }
}
