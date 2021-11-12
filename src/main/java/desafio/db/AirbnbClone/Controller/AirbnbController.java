package desafio.db.AirbnbClone.Controller;

import desafio.db.AirbnbClone.Repository.AirbnbRepository;
import desafio.db.AirbnbClone.Model.Airbnb;
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

	
}


