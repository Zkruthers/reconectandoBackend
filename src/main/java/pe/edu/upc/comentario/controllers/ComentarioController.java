package pe.edu.upc.comentario.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.comentario.dtos.ComentarioDTO;
import pe.edu.upc.comentario.entities.Comentario;
import pe.edu.upc.comentario.services.IComentarioService;

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


}
