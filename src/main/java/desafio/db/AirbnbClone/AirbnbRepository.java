package desafio.db.AirbnbClone;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AirbnbRepository  extends CrudRepository<Airbnb, Long> {

	List<Airbnb> findAll();
	Airbnb findById(int id);
	
}
