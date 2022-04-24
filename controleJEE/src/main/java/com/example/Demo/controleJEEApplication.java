package com.example.Demo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Demo.entities.Livre;
import com.example.Demo.service.LivreService;

@SpringBootApplication
public class controleJEEApplication implements CommandLineRunner {
	@Autowired
	 private LivreService livreService;
	public static void main(String[] args) {
		SpringApplication.run(controleJEEApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Livre l1=new Livre(null,"4","maison4",new Date(),"khalid",30,"1246",new Date(),true);
		System.out.println("###########################	Insert	###########################################");
		livreService.saveLivre(new Livre(null,"1","maison1",new Date(),"samir",12,"123456789",new Date(),true));
		livreService.saveLivre(new Livre(null,"2","maison2",new Date(),"hassan",300,"123546",new Date(),true));
		livreService.saveLivre(l1);

		
	}

}
