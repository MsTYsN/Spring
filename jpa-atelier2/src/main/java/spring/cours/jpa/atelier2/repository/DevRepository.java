package spring.cours.jpa.atelier2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.cours.jpa.atelier2.model.Developpeur;

@Repository
public interface DevRepository extends JpaRepository<Developpeur, Integer>{
	@Query("select d from Developpeur d where d.email=:email")
	Developpeur findByEmail(String email);
	@Query("select d from Developpeur d JOIN d.taches t where t.projet.idProjet=:idP")
	List<Developpeur> getDevs(@Param("idP") int idProjet);
}
