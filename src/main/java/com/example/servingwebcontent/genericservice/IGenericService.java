package com.example.servingwebcontent.genericservice;

import java.util.HashMap;
import java.util.List;

import com.example.servingwebcontent.model.TaCitas;
import com.example.servingwebcontent.model.TaPacientes;
import com.example.servingwebcontent.model.TaPropietarios;
import com.example.servingwebcontent.model.TaVeterinarios;

public interface IGenericService {



	List<TaVeterinarios> listarVeterinarios();

	List<TaPacientes> listarPacientes();

	List<TaPropietarios> listarPropietarios();

	List<TaCitas> listarCitas();

	HashMap<String, Object> saveVeterinarios(TaVeterinarios taVeterinarios);

	HashMap<String, Object> savePacientes(TaPacientes taPacientes);

	HashMap<String, Object> savePropietarios(TaPropietarios taPropietarios);

	HashMap<String, Object> saveCitas(TaCitas taCitas);
}
