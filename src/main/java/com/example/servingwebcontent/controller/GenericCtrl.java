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
	@Autowired
	private IGenericService service;

	public GenericCtrl() {
		super();
	}

	@PostMapping("/agregarVeterinario")
	public Map<String, Object> agregarVeterinario(@RequestBody TaVeterinarios vet) {
		ArrayList<HashMap<String, Object>> retArrList = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> savingResult;
		savingResult = service.saveVeterinarios(vet);

		return savingResult;

	}

	@PostMapping("/agregarPropietario")
	public Map<String, Object> agregarPropietario(@RequestBody TaPropietarios propDto) {
		HashMap<String, Object> hashMap;
		hashMap = service.savePropietarios(propDto);

		return hashMap;

	}

	@PostMapping("/agregarPacientes")
	public Map<String, Object> agregarPacientes(@RequestBody TaPacientes pacientes) {
		HashMap<String, Object> hashMap;
		hashMap = service.savePacientes(pacientes);

		return hashMap;

	}

	@PostMapping("/agregarCitas")
	public Map<String, Object> agregarCitas(@RequestBody TaCitas citas) {
		HashMap<String, Object> hashMap;
		hashMap = service.saveCitas(citas);

		return hashMap;

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
