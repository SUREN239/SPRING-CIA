package suren.family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suren.family.model.Family;
import suren.family.repository.FamilyRepo;

import java.util.List;

@RestController
public class FamilyController {
    @Autowired
    private FamilyRepo familyRepo;

    @GetMapping("/family")
    List<Family> getAllFamilyMembers()
    {
        Family family = new Family();
        family.setName("John");
        family.setAge(187);
        family.setRelation("Spouse");
        return familyRepo.findAll();
    }

}
