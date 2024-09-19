package id.learn.CRUD_javaspringboot_simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phonebook {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false) //data tidak boleh null
private String nama;
@Column(nullable = false) //data tidak boleh null
private String nohp;
@Column(nullable = false) //data tidak boleh null
private String email;
@Column(nullable = false) //data tidak boleh null
private String address;
}
