package desafio.db.AirbnbClone.Repository;

import desafio.db.AirbnbClone.Model.Airbnb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirbnbRepository  extends CrudRepository<Airbnb, Long> {

	List<Airbnb> findAll();
	Airbnb findById(int id);
	
}
