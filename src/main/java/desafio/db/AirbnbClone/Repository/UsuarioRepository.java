package desafio.db.AirbnbClone.Repository;

import desafio.db.AirbnbClone.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {


}