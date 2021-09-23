package tacos.data;

import org.springframework.data.repository.Repository;
import tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends Repository<Ingredient, String> {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
