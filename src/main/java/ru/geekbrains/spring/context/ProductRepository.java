package ru.geekbrains.spring.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository implements RepoProduct {
    private List<Product> products;

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @PostConstruct
    public void initProducts(){
        products = new ArrayList<>(Arrays.asList(
            new Product(1L,"milk",new BigDecimal(65)),
            new Product(2L,"bread", new BigDecimal(45)),
            new Product(3L,"eggs", new BigDecimal(70)),
            new Product(4L,"chocolate",new BigDecimal(100)),
            new Product(5L, "tea", new BigDecimal(60))
        ));
    }

    public Product getProductById(long id){
        return products.get(Math.toIntExact(id - 1));
    }
}
