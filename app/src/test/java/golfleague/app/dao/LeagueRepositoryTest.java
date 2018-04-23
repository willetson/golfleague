package golfleague.app.dao;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired; 


@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class LeagueRepositoryTest {
	private static final Logger log = LoggerFactory.getLogger(LeagueRepositoryTest.class);
	
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private LeagueRepository leagueRepository;

	@Test
	public void whenFindByName_thenReturnLeague() {
		// given
		League alex = new League("alex");
		entityManager.persist(alex);
		entityManager.flush();
	 
		// when
		League found = leagueRepository.findByName(alex.getName());
	 
		// then
		assertThat(found.getName())
		  .isEqualTo(alex.getName());
		
	}
	
	@Test
	public void whenPersist_thenStoreSeason() {
		// given
		League alex = new League("alex");
		Season season = new Season("2018");
		List<Season> seasons = new ArrayList<Season>();
		seasons.add(season);
		alex.setSeasons(seasons);
		
		entityManager.persist(season);
		entityManager.persist(alex);
		entityManager.flush();
			 
		// when
		League found = leagueRepository.findByName(alex.getName());
	 
		// then
		assertThat(found.getName())
		  .isEqualTo(alex.getName());
		
	}

/*
	public CommandLineRunner demo(LeagueRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new League("Jack"));
			repository.save(new League("Chloe"));
			repository.save(new League("Kim"));
			repository.save(new League("David"));
			repository.save(new League("Michelle"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (League league : repository.findAll()) {
				log.info(league.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(league -> {
					log.info("Customer found with findById(1L):");
					log.info("--------------------------------");
					log.info(league.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}
*/

}
