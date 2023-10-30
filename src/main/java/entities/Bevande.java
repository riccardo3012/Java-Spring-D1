package entities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bevande {
    private String nome;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + nome +
                ", calories=" + calorie +
                ", price=" + prezzo +
                '}';

    }

}

