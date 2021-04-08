package ru.geekbrains.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class Cart{

    private List<Product> clientCartOfProducts;

    private ProductRepository productRepository;

    @Autowired
    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getClientCartOfProducts() {
        return clientCartOfProducts;
    }

    /*
    public void addProductInCart(long id){
        clientCartOfProducts = new ArrayList<>(Arrays.asList().add(productRepository.getProducts().get(Math.toIntExact(id - 1))));
    }
    */

    public void removeProductFromCartById(long id){
        clientCartOfProducts.remove(Math.toIntExact(id - 1));
    }
}
