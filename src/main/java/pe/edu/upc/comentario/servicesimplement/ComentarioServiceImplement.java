package pe.edu.upc.comentario.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.comentario.entities.Comentario;
import pe.edu.upc.comentario.repositories.IComentarioRepository;
import pe.edu.upc.comentario.services.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {

    @Autowired
    private IComentarioRepository cR;

    @Override
    public void insert(Comentario comentario) {
        cR.save(comentario);
    }

    @Override
    public List<Comentario> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idComentario) {
        cR.deleteById(idComentario);
    }

    @Override
    public Comentario listId(int idComentario) {
        return cR.findById(idComentario).orElse(new Comentario());
    }
}
