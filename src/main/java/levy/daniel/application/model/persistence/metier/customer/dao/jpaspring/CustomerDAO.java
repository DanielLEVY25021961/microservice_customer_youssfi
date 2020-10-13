package levy.daniel.application.model.persistence.metier.customer.dao.jpaspring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import levy.daniel.application.model.persistence.metier.customer.entities.jpa.Customer;

/**
 * INTERFACE CustomerDAO :<br/>
 * .<br/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author Daniel Lévy
 * @version 1.0
 * @since 4 oct. 2020
 */
@RepositoryRestResource
public interface CustomerDAO extends JpaRepository<Customer, Long> {
	
	

} // FIN DE L'INTERFACE CustomerDAO.-----------------------------------------
