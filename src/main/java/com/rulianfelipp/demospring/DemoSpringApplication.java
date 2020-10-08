package com.rulianfelipp.demospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rulianfelipp.demospring.domain.Categoria;
import com.rulianfelipp.demospring.domain.Produto;
import com.rulianfelipp.demospring.repositories.CategoriaRepository;
import com.rulianfelipp.demospring.repositories.ProdutoRepository;

@SpringBootApplication
public class DemoSpringApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria (null, "Check List");
		Categoria cat2 = new Categoria (null, "Text");
		Categoria cat3 = new Categoria (null, "Numb");

		Produto prot1 = new Produto (null, "teste texto livre", 1.00);
		Produto prot2 = new Produto (null, "testte numero", 2.00);
		Produto prot3 = new Produto (null, "teste check list", 3.00);
		
		cat1.getProdutos().addAll(Arrays.asList(prot1,prot2,prot3));
		cat2.getProdutos().addAll(Arrays.asList(prot1,prot2));
		cat3.getProdutos().addAll(Arrays.asList(prot1));
		
		
		
		prot1.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3));
		prot2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		prot3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		produtoRepository.saveAll(Arrays.asList(prot1,prot2,prot3));
		
	}

}
	