package com.example.servingwebcontent.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servingwebcontent.genericservice.IGenericService;
import com.example.servingwebcontent.model.TaCitas;
import com.example.servingwebcontent.model.TaPacientes;
import com.example.servingwebcontent.model.TaPropietarios;
import com.example.servingwebcontent.model.TaVeterinarios;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * @author cescobar
 * fecha 06/07/2020
 * controller global para conexion entre microservicios.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Control de cambios
 * Fecha_______Autor_____Cambio
 *  
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

@RestController
//@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/api/v1")
public class GenericCtrl {
	private Map<String, String> requestBody;
	private static final String GENERIC_CONTROLLER = "/genericController";
	@Autowired
	private IGenericService service;
	private String url = "";

	public GenericCtrl() {
		super();
	}

	@PostMapping("/agregarVeterinario")
	public List<HashMap<String, Object>> agregarVeterinario(@RequestBody TaVeterinarios vet) {
		ArrayList<HashMap<String, Object>> retArrList = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> savingResult;
		savingResult = service.saveVeterinarios(vet);

		retArrList.add(savingResult);

		return retArrList;

	}

	@PostMapping("/agregarPropietario")
	public List<HashMap<String, Object>> agregarPropietario(@RequestBody TaPropietarios propDto) {

		service.savePropietarios(propDto);

		return new ArrayList<>();

	}

	@PostMapping("/agregarPacientes")
	public List<HashMap<String, Object>> agregarPacientes(@RequestBody TaPacientes pacientes) {

		service.savePacientes(pacientes);

		return new ArrayList<>();

	}

	@PostMapping("/agregarCitas")
	public List<HashMap<String, Object>> agregarCitas(@RequestBody TaCitas citas) {

		service.saveCitas(citas);

		return new ArrayList<>();

	}

	@GetMapping("/getCitas")
	public List<TaCitas> getCitas() {

		return service.listarCitas();

	}

	@GetMapping("/getPropietarios")
	public List<TaPropietarios> getPropietarios() {

		return service.listarPropietarios();

	}

	@GetMapping("/getVeterinarios")
	public List<TaVeterinarios> getVeterinarios() {

		return service.listarVeterinarios();

	}

	@GetMapping("/getPacientes")
	public List<TaPacientes> getPacientes() {

		return service.listarPacientes();

	}

}
