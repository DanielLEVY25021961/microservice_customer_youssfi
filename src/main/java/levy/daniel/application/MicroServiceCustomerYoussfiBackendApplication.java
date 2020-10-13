package levy.daniel.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import levy.daniel.application.model.persistence.metier.customer.dao.jpaspring.CustomerDAO;
import levy.daniel.application.model.persistence.metier.customer.entities.jpa.Customer;

/**
 * CLASSE MicroServiceCustomerYoussfiBackendApplication :<br/>
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
@SpringBootApplication
public class MicroServiceCustomerYoussfiBackendApplication { // NOPMD by dan on 04/10/2020 13:28

	
	
	
	/**
	 * Point d'entrée de l'application (Micro-Service).
	 * 
	 * @param pArgs : String[] : paramètres de lancement du Micro-Service.
	 */
	public static void main(final String... pArgs) {
		
		SpringApplication
			.run(MicroServiceCustomerYoussfiBackendApplication.class, pArgs);
		
	} // Fin de main(...)._________________________________________________
	
	
	
	/**
	 * méthode appliquée au démarrage du Micro-Service.
	 * 
	 * @param pCustomerDAO : CustomerDAO.
	 * 
	 * @return CommandLineRunner.
	 */
	@Bean
	public CommandLineRunner start(final CustomerDAO pCustomerDAO) {
		
		return args -> {
			
			final Customer customer1 = new Customer(null, "code1", "name1", "email1");
			final Customer customer2 = new Customer(null, "code2", "name2", "email2");
			final Customer customer3 = new Customer(null, "code3", "name3", "email3");
			
			pCustomerDAO.save(customer1);
			pCustomerDAO.save(customer2);
			pCustomerDAO.save(customer3);
			
			pCustomerDAO.findAll().forEach(System.out::println);
			
		};
		
	} // Fin de start(...).________________________________________________

	
	
} // FIN DE LA CLASSE MicroServiceCustomerYoussfiBackendApplication.---------
