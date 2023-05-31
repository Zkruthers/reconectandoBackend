package pe.edu.upc.comentario.services;

import pe.edu.upc.comentario.entities.Comentario;

import java.util.List;

public interface IComentarioService {

    public void insert(Comentario comentario);
    List<Comentario> list();
    public void delete(int idComentario);
    public Comentario listId(int idComentario);

}
