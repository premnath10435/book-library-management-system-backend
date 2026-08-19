package com.example.springboots.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboots.Entities.classEntities;
import com.example.springboots.RepositoryLayer.classRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class classcontrollers {

    @Autowired
    classRepository re;

    // ADD BOOK
    @PostMapping("/insert")
    public ResponseEntity<classEntities> insert(@RequestBody classEntities ce) {

        re.save(ce);

        System.out.println("Received Data: " + ce);

        return ResponseEntity.ok(ce);
    }

    // DISPLAY ALL BOOKS
    @GetMapping("/read")
    public ResponseEntity<List<classEntities>> readAll() {

        List<classEntities> books = re.findAll();

        return ResponseEntity.ok(books);
    }

    // DISPLAY BOOK BY ID
    @GetMapping("/read/{id}")
    public ResponseEntity<Optional<classEntities>> read(@PathVariable int id) {

        Optional<classEntities> ce = re.findById(id);

        return ResponseEntity.ok(ce);
    }

    // UPDATE BOOK
    @PutMapping("/update")
    public ResponseEntity<classEntities> update(@RequestBody classEntities up) {

        re.save(up);

        return ResponseEntity.ok(up);
    }

    // DELETE BOOK
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {

        re.deleteById(id);

        return ResponseEntity.ok("Record deleted successfully");
    }

    // FILTER BY CATEGORY
    @GetMapping("/category/{category}")
    public ResponseEntity<List<classEntities>> filterByCategory(
            @PathVariable String category) {

        List<classEntities> books = re.findByCategory(category);

        return ResponseEntity.ok(books);
    }
}