package desafio.db.AirbnbClone.Controller;


import desafio.db.AirbnbClone.Model.Usuario;
import desafio.db.AirbnbClone.Repository.AirbnbRepository;
import desafio.db.AirbnbClone.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
public class UsuarioController {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario, BindingResult bindingResult) {
        usuarioRepository.save(usuario);
        if(bindingResult.hasErrors() || (usuario == null)){
            return new ResponseEntity<Usuario>(usuario, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
    }
}
