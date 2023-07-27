package com.example.servingwebcontent.serviceimpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servingwebcontent.genericservice.IGenericService;
import com.example.servingwebcontent.model.TaCitas;
import com.example.servingwebcontent.model.TaPacientes;
import com.example.servingwebcontent.model.TaPropietarios;
import com.example.servingwebcontent.model.TaVeterinarios;
import com.example.servingwebcontent.repository.TaCitasRepository;
import com.example.servingwebcontent.repository.TaPacientesRepository;
import com.example.servingwebcontent.repository.TaPropietariosRepository;
import com.example.servingwebcontent.repository.TaVeterinariosRepository;

@Service
public class GenericServiceImpl implements IGenericService {
	
	private static final String MENSAJE = "mensaje";
	private static final String SUCCESS = "success";
	private static final String GUARDADO = "guardado";


	@Autowired
	TaPacientesRepository pacientes;

	@Autowired
	TaPropietariosRepository propietario;

	@Autowired
	TaVeterinariosRepository veterinario;

	@Autowired
	TaCitasRepository citas;

		

	@Override
	public List<TaVeterinarios> listarVeterinarios() {
		return veterinario.findAll();
	}

	@Override
	public List<TaPacientes> listarPacientes() {
		return pacientes.findAll();
	}

	@Override
	public List<TaPropietarios> listarPropietarios() {
		return propietario.findAll();
	}

	@Override
	public List<TaCitas> listarCitas() {
		return citas.findAll();
	}

	@Override
	public HashMap<String, Object> saveVeterinarios(TaVeterinarios vet) {

		HashMap<String, Object> hashMap = new HashMap<>();

		try {
			TaVeterinarios saveAccion = veterinario.save(vet);
			if (saveAccion != null) {
				hashMap.put(MENSAJE, GUARDADO);
				hashMap.put(SUCCESS, true);
			}
		} catch (Exception e) {
			hashMap.put(MENSAJE, e.getMessage());
			hashMap.put(SUCCESS, false);
			System.out.println("Error: " + e.getMessage());
		}
		return hashMap;
	}

	@Override
	public HashMap<String, Object> savePacientes(TaPacientes pac) {
		HashMap<String, Object> hashMap = new HashMap<>();

		try {
			TaPacientes saveAccion = pacientes.save(pac);
			if (saveAccion != null) {
				hashMap.put(MENSAJE, GUARDADO);
				hashMap.put(SUCCESS, true);
			}
		} catch (Exception e) {
			hashMap.put(MENSAJE, e.getMessage());
			hashMap.put(SUCCESS, false);
			System.out.println("Error: " + e.getMessage());
		}
		return hashMap;
	}

	@Override
	public HashMap<String, Object> savePropietarios(TaPropietarios prop) {
		HashMap<String, Object> hashMap = new HashMap<>();

		try {
			TaPropietarios saveAccion = propietario.save(prop);
			if (saveAccion != null) {
				hashMap.put(MENSAJE, GUARDADO);
				hashMap.put(SUCCESS, true);
			}
		} catch (Exception e) {
			hashMap.put(MENSAJE, e.getMessage());
			hashMap.put(SUCCESS, false);
			System.out.println("Error: " + e.getMessage());
		}
		return hashMap;
	}

	@Override
	public HashMap<String, Object> saveCitas(TaCitas appoinment) {
		HashMap<String, Object> hashMap = new HashMap<>();

		try {
			TaCitas saveAccion = citas.save(appoinment);
			if (saveAccion != null) {
				hashMap.put(MENSAJE, GUARDADO);
				hashMap.put(SUCCESS, true);
			}
		} catch (Exception e) {
			hashMap.put(MENSAJE, e.getMessage());
			hashMap.put(SUCCESS, false);
			System.out.println("Error: " + e.getMessage());
		}
		return hashMap;
	}

}
