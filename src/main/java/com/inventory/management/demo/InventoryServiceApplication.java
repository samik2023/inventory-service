package com.inventory.management.demo;

import com.inventory.management.demo.entity.Inventory;
import com.inventory.management.demo.repository.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
@Slf4j
public class InventoryServiceApplication {
	@Autowired
	private InventoryRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
