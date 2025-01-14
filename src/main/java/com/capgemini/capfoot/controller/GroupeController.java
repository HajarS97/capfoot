package com.capgemini.capfoot.controller;

import com.capgemini.capfoot.entity.Groupe;
import com.capgemini.capfoot.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupeController {

    @Autowired
    GroupService groupeService;

    @PostMapping("/supprimer/groupes")
    public void deleteGroupe(@PathVariable Long id){
        groupeService.delete(id);
    }

    @PostMapping("/modifier/groupes")
    public void updateGroupe(@RequestBody Groupe groupe, @PathVariable Long id){
        groupeService.update(groupe,id);
    }
    @GetMapping("/groupes")
    public List<Groupe> findAll(){
        return groupeService.findAll();
    }

    @GetMapping("/groupes/{id}")
    public Optional<Groupe> findById(@PathVariable("id") Long id){
        return groupeService.findById(id);
    }
}
