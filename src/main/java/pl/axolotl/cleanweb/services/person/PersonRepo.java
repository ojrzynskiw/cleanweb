package pl.axolotl.cleanweb.services.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepo extends JpaRepository<Person, UUID> {
}
