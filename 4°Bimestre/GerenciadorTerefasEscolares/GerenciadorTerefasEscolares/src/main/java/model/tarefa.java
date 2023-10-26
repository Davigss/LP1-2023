package model;

import jakarta.persistence.*;

@Table
@Entity
public class tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTar;
    @Column
    private String  titulo;
    @Column
    private String descricao;
   // @Column
   // private data de vencimento e
   @Column
   private boolean concluida;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDis")
    private disciplina disciplina;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCat")
    private categoria categoria;

    public tarefa(model.disciplina disciplina, model.categoria categoria) {
        this.disciplina = disciplina;
        this.categoria = categoria;
    }

    public model.disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(model.disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public model.categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(model.categoria categoria) {
        this.categoria = categoria;
    }

    public tarefa(String titulo, String descricao, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public Integer getIdTar() {
        return idTar;
    }

    public void setIdTar(Integer idTar) {
        this.idTar = idTar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "tarefa{" +
                "idTar=" + idTar +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", disciplina=" + disciplina +
                ", categoria=" + categoria +
                '}';
    }

    //metodos


}
