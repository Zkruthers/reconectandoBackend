package pe.edu.upc.comentario.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "usuarioId", length = 60, nullable = false)
    private String usuarioId;
    @Column(name = "fechaPublicacion", nullable = false)
    private LocalDate fechaPublicacion;
    @Column(name = "descripcion", length = 35, nullable = false)
    private String descripcion;
    @Column(name = "publicacionId", length = 35, nullable = false)
    private String publicacionId;

    public Comentario() {
    }

    public Comentario(int idComentario, String usuarioId, LocalDate fechaPublicacion, String descripcion, String publicacionId) {
        this.idComentario = idComentario;
        this.usuarioId = usuarioId;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.publicacionId = publicacionId;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPublicacionId() {
        return publicacionId;
    }

    public void setPublicacionId(String publicacionId) {
        this.publicacionId = publicacionId;
    }
}
