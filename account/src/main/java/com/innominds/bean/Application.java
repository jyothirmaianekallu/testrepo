package com.innominds.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	    public static void main(String[] args) {
	
	        SpringApplication.run(Application.class);
	
	    }
	    
	    @Bean
	    public CommandLineRunner saveAccount(AccountRepository repository) {
	    	
	    	return(args) ->{
	    	
	    	//	saving into table
	    		
	    	repository.save(new Account("jyothi",30000.00,new Address("hyd","AP","India")));
	    	repository.save(new Account("mounika",35000.87,new Address("vizag","AP","India")));
	    	
	    	//repository.save(new Account("frfwr",3673.00));
	    	//to get all the details in the table
	    	 for (Account account : repository.findAll()) {
	 			log.info(account.toString());
	 		}
			
			//to get the 1st entry in the table
	    	 Account account = repository.findOne(1L);
	    	 log.info("Acccount found with findOne(1L):");
			 log.info("--------------------------------");
			 log.info(account.toString());


	    	};
	
	}
	    
	   
}


