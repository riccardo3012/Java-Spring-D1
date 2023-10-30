package entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    Topping getTomato() {
        return new Topping("Tomato", 40, 0.30);
    }

    @Bean
    Topping getCheese() {
        return new Topping("Cheese", 65, 0.30);
    }


@Bean (name = "pizza margherita")
 public Pizza pizzamargherita() {
    List<String> toppingList = new ArrayList<>();
    toppingList.add(getTomato().getNome());
    toppingList.add(getCheese().getNome());
    return new Pizza("Margherita", toppingList, 1000, 6.00);

}

@Bean
 Bevande getAcqua(){
        return new Bevande("Acqua" 10, 1.00);

}



}
