package pe.edu.upc.people.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.people.entities.People;

@Repository
public interface IPeopleRepository extends JpaRepository<People, Integer> {


}
