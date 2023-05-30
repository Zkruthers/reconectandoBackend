package pe.edu.upc.people.services;

import pe.edu.upc.people.PeopleApplication;
import pe.edu.upc.people.entities.People;

import java.util.List;

public interface IPeopleService {

    public void insert (People people);
    List<People>list();
    public void delete(int  idPeople);
    public People listId(int idPeople);

}
