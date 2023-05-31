package pe.edu.upc.comentario.controllers;

import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.comentario.dtos.ComentarioDTO;
import pe.edu.upc.comentario.entities.Comentario;
import pe.edu.upc.comentario.services.IComentarioService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;
    @PostMapping
    public void insert(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);
    }
    @GetMapping
    public List<ComentarioDTO> list() {
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ComentarioDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto = m.map(cS.listId(id),ComentarioDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto,Comentario.class);
        cS.insert(c);
    }

    @PostMapping("/buscar")
    public List<ComentarioDTO> search(@RequestBody LocalDate fecha){
        return cS.find(fecha).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ComentarioDTO.class);
        }).collect(Collectors.toList());
    }
}
