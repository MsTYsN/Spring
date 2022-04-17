package iir4.g5.cours.springjpa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iir4.g5.cours.springjpa1.model.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
