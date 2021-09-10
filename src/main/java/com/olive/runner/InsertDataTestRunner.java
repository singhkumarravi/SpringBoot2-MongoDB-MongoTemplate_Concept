package com.olive.runner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import com.olive.model.Book;
//@Component
public class InsertDataTestRunner implements CommandLineRunner{
	@Autowired
	private MongoTemplate temp;

	public void run(String... args) throws Exception {
		temp.remove(Book.class);
		System.out.println("Runner Class Started............");
        temp.save(new Book(10, "A", 300.0, "PL", "Hari Singh"));
        temp.save(new Book(11, "B", 400.0, "PL", "Henamt Singh"));
        temp.save(new Book(12, "C", 500.0, "PL", "Himansu Kumar"));
        temp.save(new Book(13, "D", 600.0, "PL", "Rohit Kumar"));
        temp.save(new Book(14, "F", 300.0, "PL","Mohit Kumar"));
        temp.findAll(Book.class)
        .forEach(System.out::println);
        
        
       System.out.println("Product Data Save into MongoDB");
      
	}

}
