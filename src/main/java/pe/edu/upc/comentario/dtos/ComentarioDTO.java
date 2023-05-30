package pe.edu.upc.comentario.dtos;

import java.time.LocalDate;

public class ComentarioDTO {

    private int idComentario;
    private String usuarioId;
    private LocalDate fechaPublicacion;
    private String descripcion;
    private String publicacionId;

    public int getIdComentario() {        return idComentario;    }

    public void setIdComentario(int idComentario) {        this.idComentario = idComentario;    }

    public String getUsuarioId() {        return usuarioId;    }

    public void setUsuarioId(String usuarioId) {        this.usuarioId = usuarioId;    }

    public LocalDate getFechaPublicacion() {        return fechaPublicacion;    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {        this.fechaPublicacion = fechaPublicacion;    }

    public String getDescripcion() {        return descripcion;    }

    public void setDescripcion(String descripcion) {        this.descripcion = descripcion;    }

    public String getPublicacionId() {        return publicacionId;    }

    public void setPublicacionId(String publicacionId) {        this.publicacionId = publicacionId;    }
}
