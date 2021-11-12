package desafio.db.AirbnbClone.Repository;

import desafio.db.AirbnbClone.Model.Airbnb;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AirbnbRepository  extends CrudRepository<Airbnb, Long> {

	List<Airbnb> findAll();
	Airbnb findById(int id);
	
}
