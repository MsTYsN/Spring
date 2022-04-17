package spring.cours.jpa.atelier2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.Tache;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Integer>{
	@Query("select t from Tache t where t.projet.idProjet=:idProjet")
	List<Tache> getTaches(@Param("idProjet") int idProjet);
	@Query("select p from ProjetDev p")
	List<ProjetDev> getProjetDev();
	@Query("select p from ProjetDev p where idProjet=:idP")
	ProjetDev getProjetDev(@Param("idP") int idP);
}
