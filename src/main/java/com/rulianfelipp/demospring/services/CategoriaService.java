package com.rulianfelipp.demospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rulianfelipp.demospring.domain.Categoria;
import com.rulianfelipp.demospring.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria>obj = categoriaRepository.findById(id);
		return obj.orElse(null);
	}
}
