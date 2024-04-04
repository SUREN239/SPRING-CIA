package suren.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suren.family.model.Family;

public interface FamilyRepo extends JpaRepository<Family, Long> {

}
