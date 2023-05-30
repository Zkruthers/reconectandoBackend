package pe.edu.upc.people.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.people.dtos.PeopleDTO;
import pe.edu.upc.people.entities.People;
import pe.edu.upc.people.services.IPeopleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peoples")
public class PeopleController {
    @Autowired
    private IPeopleService pS;

    @PostMapping
    public  void insert(@RequestBody PeopleDTO dto){
        ModelMapper m= new ModelMapper();
        People p= m.map(dto,People.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PeopleDTO>list(){
        return pS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,PeopleDTO.class);
        }).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        pS.delete(id);

    }

    @GetMapping("/{id}")
    public PeopleDTO listId(@PathVariable("id") Integer id){
    ModelMapper m= new ModelMapper();
    PeopleDTO dto= m.map(pS.listId(id),PeopleDTO.class);
    return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody PeopleDTO dto){
        ModelMapper m= new ModelMapper();
        People p= m.map(dto, People.class);
        pS.insert(p);
    }

}
