package pl.axolotl.cleanweb.services.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class PersonService {

    private final PersonRepo repo;

    public List<Person> getAllPersons() {
        return repo.findAll();
    }
}
