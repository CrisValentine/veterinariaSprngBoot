package com.example.servingwebcontent.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.servingwebcontent.model.TaPacientes;

public interface TaPacientesRepository extends Repository<TaPacientes, Integer> {
	
	List<TaPacientes> findAll();
	
	TaPacientes save(TaPacientes pacientes);

}
