package dev.igor.fridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.igor.fridge.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
