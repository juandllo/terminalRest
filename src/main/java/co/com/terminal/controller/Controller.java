package co.com.terminal.controller;

import co.com.terminal.model.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.com.terminal.model.Servicio;
import co.com.terminal.repository.ServicioRepository;

@RestController
@RequestMapping("/v1")
@SuppressWarnings("unused")
public class Controller {
	
	@Autowired
	private ServicioRepository servicioRepository;

	@GetMapping(value = "/allServicio", produces = {"application/json"})
	public Iterable<Servicio> getServicio() {
		return servicioRepository.findAll();
	}

	@CrossOrigin
	@RequestMapping(value = "/crearServicio", method = RequestMethod.POST)
    public ResponseEntity<?> crearServicio(@RequestBody Servicio servicio) {

	    Respuesta respuesta = new Respuesta();
	    if (servicio.getNombre() == null || servicio.getNombre().matches("")) {
	        respuesta.setRequestMessage("El formulario está incompleto.");
	        respuesta.setServicio(servicio);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(respuesta);
        } else {
            if (servicio.getCodigo() > 0) {
                respuesta.setRequestMessage("El servicio ha sido actualizado.");
            } else {
                respuesta.setRequestMessage("El servicio ha sido almacenado.");
            }
            servicioRepository.save(servicio);
        }

        return ResponseEntity.status(HttpStatus.OK).body(respuesta);
    }
}
