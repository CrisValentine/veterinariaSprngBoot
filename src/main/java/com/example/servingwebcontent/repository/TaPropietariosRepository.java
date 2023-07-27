package com.example.servingwebcontent.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.servingwebcontent.model.TaPropietarios;

public interface TaPropietariosRepository extends Repository<TaPropietarios, Integer>{

	
	List<TaPropietarios> findAll();
	
	TaPropietarios save(TaPropietarios prop);
}
