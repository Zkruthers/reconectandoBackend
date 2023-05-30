package pe.edu.upc.people.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.people.entities.People;
import pe.edu.upc.people.repositories.IPeopleRepository;
import pe.edu.upc.people.services.IPeopleService;

import java.util.List;

@Service
public class PeopleServiceImplement implements IPeopleService {

    @Autowired
    private IPeopleRepository pR;

    @Override
    public void insert(People people) {
        pR.save(people);
    }

    @Override
    public List<People> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPeople) {
        pR.deleteById(idPeople);
    }

    @Override
    public People listId(int idPeople) {
        return pR.findById(idPeople).orElse(new People());
    }

}
