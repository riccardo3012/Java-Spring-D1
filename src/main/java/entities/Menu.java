package entities;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Menu {
    public List<Pizza> pizza;
    public List<Bevande> bevande;
    public List<Topping> topping;


    @Override
    public String toString() {
        return "{" + pizza + bevande + topping + '}';
    }
}