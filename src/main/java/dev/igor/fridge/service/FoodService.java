package dev.igor.fridge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.igor.fridge.model.Food;
import dev.igor.fridge.repository.FoodRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    //LISTAR
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    //CRIAR
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    //DELETAR
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }
}
