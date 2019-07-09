package org.app.runner;

import org.app.document.Product;
import org.app.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		repo.save(new Product(10, "A", 2.2));
		repo.save(new Product(11, "B", 3.2));
		repo.save(new Product(12, "C", 4.2));
		repo.save(new Product(13, "D", 5.2));
		repo.save(new Product(14, "E", 6.2));
		System.out.println("====================");
		repo.findAll()
	   .forEach(System.out::println);

	}

}
