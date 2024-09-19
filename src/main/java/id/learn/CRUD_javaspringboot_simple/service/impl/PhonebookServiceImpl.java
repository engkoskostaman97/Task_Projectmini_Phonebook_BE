package id.learn.CRUD_javaspringboot_simple.service.impl;

import id.learn.CRUD_javaspringboot_simple.model.Phonebook;
import id.learn.CRUD_javaspringboot_simple.repository.PhonebookRepository;
import id.learn.CRUD_javaspringboot_simple.service.PhonebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhonebookServiceImpl implements PhonebookService {

@Autowired
PhonebookRepository phonebookRepository;

@Override
public List<Phonebook> findAllPhonebooks() {
return phonebookRepository.findAll();
}

@Override
public Phonebook findPhonebookById(Long id) throws Exception {
Phonebook phonebook = phonebookRepository.findById(id).orElse(new Phonebook());
return phonebook;
}

@Override
public Phonebook saveorUpdatePhonebook(Phonebook phonebook) {
return phonebookRepository.save(phonebook);
}

@Override
public Phonebook updatePhonebook(Phonebook phonebook) {
    Phonebook existingPhonebook = phonebookRepository.findById(phonebook.getId()).get();
    existingPhonebook.setNama(phonebook.getNama());
    existingPhonebook.setNohp(phonebook.getNohp());
    existingPhonebook.setEmail(phonebook.getEmail());
    existingPhonebook.setAddress(phonebook.getAddress());

    Phonebook updatedData = phonebookRepository.save(existingPhonebook);
    return updatedData;
}


@Override
public void deletePhonebook(Long id) {
Phonebook phonebook = phonebookRepository.findById(id).orElse(new Phonebook());
phonebookRepository.delete(phonebook);
}


}