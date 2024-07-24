package renovatio.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import renovatio.contacts.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
