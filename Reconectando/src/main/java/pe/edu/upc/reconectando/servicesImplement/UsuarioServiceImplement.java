package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Usuario;
import pe.edu.upc.reconectando.repositories.IUsuarioRepository;
import pe.edu.upc.reconectando.services.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }
}
