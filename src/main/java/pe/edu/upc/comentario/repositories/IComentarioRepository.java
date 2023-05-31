package pe.edu.upc.comentario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.comentario.entities.Comentario;
import pe.edu.upc.comentario.services.IComentarioService;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {

    @Query("from Comentario c where c.fechaPublicacion=:fecha")
    List<Comentario> buscarComentario(@Param("fecha")LocalDate fecha);

}
