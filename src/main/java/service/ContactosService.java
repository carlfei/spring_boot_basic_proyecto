package service;

import java.util.List;

import model.Contacto;

public interface ContactosService {	
	boolean altaContacto(Contacto contacto);

	void eliminarContacto(int idContacto);	
	List<Contacto> recuperarContactos();

}