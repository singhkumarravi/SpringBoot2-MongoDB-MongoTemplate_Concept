package com.olive.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.olive.model.Book;
@Component
public class Test implements CommandLineRunner {
    @Autowired
	private MongoTemplate tm;
    
	public void run(String... args) throws Exception {
		/*
	   Query q =new Query();
	   //where bookCost>=400.0
	   q.addCriteria(Criteria.where("bookCost").gte(400.0));
	   //select * from book + query
	   List<Book> list = tm.find(q, Book.class);
	   list.forEach(System.out::println);
        */
		
		/*
	  //Update Data
		Query update=new Query();
		//where boookName=A
		 update.addCriteria(Criteria.where("bookName").is("A"));
		  
		 //here updating the record author and BookType
		 Update up=new Update();
	        up.set("author", "R.K");
	     up.set("bookType", "POEM");
	     Book book = tm.findAndModify (update,up ,Book.class);
		  System.out.println(book); 
		*/
		
		/*
		//delete the Record
		Query deleteQuery=new Query();
		//where bookCost!=300 
		deleteQuery.addCriteria(Criteria.where("bookCost").ne(300.0));
		tm.findAllAndRemove(deleteQuery, Book.class)
		.forEach(System.out::println);
		*/
		
		
		
		
		
		
		
	}

}
