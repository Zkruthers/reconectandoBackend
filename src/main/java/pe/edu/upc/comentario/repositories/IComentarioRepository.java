package pe.edu.upc.comentario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.comentario.entities.Comentario;
import pe.edu.upc.comentario.services.IComentarioService;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {


}
