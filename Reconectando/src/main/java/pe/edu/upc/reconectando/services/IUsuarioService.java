package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();
}
