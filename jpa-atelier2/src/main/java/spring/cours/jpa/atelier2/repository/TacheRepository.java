package spring.cours.jpa.atelier2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.cours.jpa.atelier2.model.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Integer>{

}
