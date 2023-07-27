package com.example.servingwebcontent.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.servingwebcontent.model.TaCitas;

public interface TaCitasRepository extends Repository<TaCitas, Integer>{

	List<TaCitas> findAll();
	
	TaCitas save(TaCitas citas);
}
