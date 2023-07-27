package com.example.servingwebcontent.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.servingwebcontent.model.TaVeterinarios;

public interface TaVeterinariosRepository extends Repository<TaVeterinarios, Integer> {
	List<TaVeterinarios> findAll();

	TaVeterinarios save(TaVeterinarios vet);
}
