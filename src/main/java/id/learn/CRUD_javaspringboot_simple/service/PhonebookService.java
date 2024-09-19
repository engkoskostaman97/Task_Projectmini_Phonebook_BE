package id.learn.CRUD_javaspringboot_simple.service;
import id.learn.CRUD_javaspringboot_simple.model.Phonebook;

import java.util.List;

public interface PhonebookService {
List<Phonebook> findAllPhonebooks();
Phonebook findPhonebookById(Long id) throws Exception;
Phonebook saveorUpdatePhonebook(Phonebook phonebook);
Phonebook updatePhonebook(Phonebook phonebook);
void deletePhonebook(Long id);

}