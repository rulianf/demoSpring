package com.rulianfelipp.demospring.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rulianfelipp.demospring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria categoria1 = new Categoria(1,"Check List");
		Categoria categoria2 = new Categoria(2,"Text");
		Categoria categoria3 = new Categoria(3, "nome");
		
		List<Categoria> categorias = new ArrayList<>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		categorias.add(categoria3);
		return categorias;
		
	}
}
