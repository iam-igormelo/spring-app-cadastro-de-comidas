package dev.igor.fridge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.igor.fridge.model.Food;
import dev.igor.fridge.service.FoodService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/food")
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        foodService.delete(id);
    }
}
