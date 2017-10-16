package dk.lightsaber.milage.server.entities.simple;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dk.lightsaber.milage.server.pdo.PersistenceContext;
import dk.lightsaber.milage.server.pdo.model.CarPdo;
import dk.lightsaber.milage.server.pdo.model.UserPdo;
import dk.lightsaber.milage.server.pdo.repository.ICarJpaRepository;
import dk.lightsaber.milage.server.pdo.repository.IUserJpaRepository;

public class SimpleTest {

	@Autowired
	public static IUserJpaRepository userJpaRepo;
	@Autowired
	public static ICarJpaRepository carJpaRepo;
	
	@Transactional
	public static void main(String[] args) {

		ApplicationContext app = new AnnotationConfigApplicationContext(PersistenceContext.class);

		UserPdo user = new UserPdo();
		user.setFirstName("Rolf");
		user.setLastName("Kristensen");
		user.setEmail("rek@steria.dk");
		user.setPassword("test");
		
		CarPdo car = new CarPdo();
		car.setFuel_type("Diesel");
		car.setMake("Hyundai");
		car.setModel("I30");
		car.setModel_specific("1.6 CRDI");
		car.setName("Cashmerebrown");
		car.setNominated_mixed_milage(27f);
		car.setUserPdo(user);

		userJpaRepo = app.getBean(IUserJpaRepository.class);
		userJpaRepo.save(user);

		System.out.println("id: " + user.getId());

//		if(1==1)
//		throw new RuntimeException("test rollback");
		
		carJpaRepo = app.getBean(ICarJpaRepository.class);
		carJpaRepo.saveAndFlush(car);


		
		
//		1.000.000.000.004
/*
		srv = app.getBean("iMilageService", IMilageService.class);
		
		System.out.println(srv.findAll().get(0).getKmDriven());
*/
	}

}
