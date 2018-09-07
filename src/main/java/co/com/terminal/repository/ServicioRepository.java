package co.com.terminal.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.terminal.model.Servicio;

public interface ServicioRepository extends CrudRepository<Servicio, Long> {
	Servicio findByNombre(String nombre);
}
