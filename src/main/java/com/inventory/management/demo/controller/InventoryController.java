package com.inventory.management.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventory.management.demo.entity.Inventory;
import com.inventory.management.demo.repository.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
@Slf4j
public class InventoryController {
    @Autowired
    private InventoryRepository repository;

    @GetMapping(value = "/inventory" ,produces =APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Inventory>> getAllInventory(){
        List<Inventory> inventory = repository.findAll();
        return ResponseEntity.ok(inventory);
    }
}