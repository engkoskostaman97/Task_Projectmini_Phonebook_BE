package id.learn.CRUD_javaspringboot_simple.repository;

import id.learn.CRUD_javaspringboot_simple.model.Phonebook;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PhonebookRepository extends JpaRepository<Phonebook, Long> {
}