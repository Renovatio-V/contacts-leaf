package renovatio.contacts.service;

import renovatio.contacts.model.Contact;
import java.util.List;

public interface IContactService {
    public List<Contact> ListContacts();

    public Contact searchContactById(Integer idContact);

    public void saveContact(Contact contact);

    public void deleteContact(Contact contact);
}
