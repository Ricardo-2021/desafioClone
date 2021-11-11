package desafio.db.AirbnbClone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
public class AirbnbController {

    @Autowired
    private AirbnbRepository airRepository;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Airbnb> findById(@PathVariable("id") Integer id) {
        Airbnb air = this.airRepository.findById(id);
        if (air == null) {
            return new ResponseEntity<Airbnb>(air, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Airbnb>(air, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Airbnb>> findAll() {
        List<Airbnb> air = this.airRepository.findAll();
        if (air.isEmpty()) {
            return new ResponseEntity<List<Airbnb>>(air, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Airbnb>>(air, HttpStatus.OK);
    }

	/*@RequestMapping(value = "{numeroCep}", method = RequestMethod.GET)
	public ResponseEntity<Cep> findByNumeroCep(@PathVariable("numeroCep") String numeroCep) {
		Cep cep = this.cepRepository.findByNumeroCep(numeroCep);
		if (cep == null) {
			return new ResponseEntity<Cep>(cep, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Cep>(cep, HttpStatus.OK);
	}

	@RequestMapping(value = "/cidades/{cidade}", method = RequestMethod.GET)
	public ResponseEntity<List<Cep>> findByCidade(@PathVariable("cidade") String cidade) {
		List<Cep> cep = this.cepRepository.findByCidade(cidade);
		if (cep.isEmpty()) {
			return new ResponseEntity<List<Cep>>(cep, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Cep>>(cep, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Cep> save(@RequestBody Cep cep, BindingResult bindingResult) {
		cepRepository.save(cep);
		if(bindingResult.hasErrors() || (cep == null)){
			return new ResponseEntity<Cep>(cep, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Cep>(cep, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Cep> deleteById(@PathVariable("id") Integer id) {
		Cep cepId = this.cepRepository.findById(id);
		cepRepository.delete(cepId);
		if (cepId == null) {
			return new ResponseEntity<Cep>(cepId, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Cep>(cepId, HttpStatus.OK);
	}*/
}


