package com.hulu.excersice.binarytree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hulu.excersice.binarytree.service.BinaryTreeService;

@SpringBootApplication
public class SpringBootBinaryTreeApplication implements CommandLineRunner{
	
	@Autowired
	private BinaryTreeService binaryTreeService;

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootBinaryTreeApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this.binaryTreeService.isCousins(3, 75));
	}
}
