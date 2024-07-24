package renovatio.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renovatio.contacts.model.Contact;
import renovatio.contacts.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService implements IContactService{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> ListContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact searchContactById(Integer idContact) {
        return contactRepository.findById(idContact).orElse(null);
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);
    }
}
