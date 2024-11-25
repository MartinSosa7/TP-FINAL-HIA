package ar.edu.unju.fi.tpfinal.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unju.fi.tpfinal.entity.Usuario;
import ar.edu.unju.fi.tpfinal.service.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService uService;

    @PostMapping("/save") 
    ResponseEntity<?> save(@RequestBody Usuario user){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(uService.save(user));
        }catch(Exception e){
            return ResponseEntity.internalServerError().body("error al guardar el usuario, " + e.getMessage());
        }
    }

    @GetMapping("/getAll")
    ResponseEntity<?> getAllUsers(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(uService.getAll());
        }catch(Exception e){
            return ResponseEntity.internalServerError().body("error al conseguir todos los usuarios, " + e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteUser(@PathVariable int id){
        try{
            uService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/edit/{id}")
    ResponseEntity<?> editUser(@PathVariable int id, @RequestBody Usuario user){
        try{
            return ResponseEntity.ok(uService.edit(user, id));
        }catch(NoSuchElementException e){
            return ResponseEntity.notFound().build();
        }catch (Exception e){
            return ResponseEntity.internalServerError().body("error editando el usuario: " + e.getMessage());
        }
    }
}
