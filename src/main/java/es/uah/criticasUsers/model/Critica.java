package es.uah.criticasUsers.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import es.uah.criticasUsers.model.User;
import jakarta.persistence.*;
import org.hibernate.Hibernate;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Criticas", schema = "user_critica_db")
public class Critica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCritica;

    @Column(name = "idFilm" , nullable = false)
    private Integer idFilm;

    @Column(name = "valoracion", nullable = false)
    private String valoracion;

    @Column(name = "nota", nullable = false)
    private Integer nota;

    @Column(name = "fecha", nullable = false)
    private Date fecha;


    @ManyToOne
    @JoinColumn(name = "Users_idUser", referencedColumnName = "idUser" ,nullable = false)
    @JsonIgnoreProperties("Criticas")


    private User user;


    public Critica(Integer idFilm, String valoracion, Integer nota, Date fecha, User user) {
        this.idFilm = idFilm;
        this.valoracion = valoracion;
        this.nota = nota;
        this.fecha = fecha;
        this.user = user;
    }

    public Critica() {
    }

    public Integer getIdCritica() {
        return idCritica;
    }

    public void setIdCritica(Integer idCritica) {
        this.idCritica = idCritica;
    }


    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public  Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Critica critica = (Critica) o;
        return idCritica != null && Objects.equals(idCritica, critica.idCritica);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}
