package id.learn.CRUD_javaspringboot_simple.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import id.learn.CRUD_javaspringboot_simple.model.Phonebook;
import id.learn.CRUD_javaspringboot_simple.service.PhonebookService;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api/phonebooks")
@CrossOrigin(origins = "http://localhost:3000")
public class PhonebookController {

@Autowired
private PhonebookService phonebookService;

//api get all
@GetMapping
public ResponseEntity<List<Phonebook>> getAllPhonebooks() {
return new ResponseEntity<>(phonebookService.findAllPhonebooks(),
HttpStatus.OK);
}

//api create 
@PostMapping
public ResponseEntity<Phonebook> savePhonebook(@Valid @RequestBody Phonebook phonebook) {
return new ResponseEntity<>(phonebookService.saveorUpdatePhonebook(phonebook),
HttpStatus.OK);
}

//api edit 
@PutMapping("/{id}")
public ResponseEntity<Phonebook> updateUser(@PathVariable("id") Long phonebookId,@Valid @RequestBody Phonebook phonebook){
    phonebook.setId(phonebookId);
    return new ResponseEntity<Phonebook>(phonebookService.updatePhonebook(phonebook),
    HttpStatus.OK
    );
}

// api get by id
@GetMapping("/{id}")
public ResponseEntity<Phonebook> getOneProduct(@PathVariable Long id) throws Exception {
return new ResponseEntity<Phonebook>(phonebookService.findPhonebookById(id),
HttpStatus.OK);
}

//api delete
@DeleteMapping("/{id}")
public String deletePhonebook(@PathVariable Long id) {
phonebookService.deletePhonebook(id);
return "delete sukses";
}
}
