package com.codewithmosh.store;

import com.codewithmosh.store.entities.*;
import com.codewithmosh.store.repositories.UserRepository;
import com.codewithmosh.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        //  var user =  User.builder().name("panos").email("test@panos").password("pass").build();
//        var address = Address.builder().street("street").city("city").zip("12345").state("zip").build();
//        var profile = Profile.builder().bio("lorem ipsum").loyaltyPoints(10).build();
//        user.addAddress(address);
//        user.addTag("tag1");
//        user.addProfile(profile);
//
//
//        System.out.println(user);
//        var product = Product.builder().name("product").price(new BigDecimal("99.99")).build();
//        var category = Category.builder().name("category1").build();
//        var product2 = Product.builder().name("product2").price(new BigDecimal("199.99")).build();
//        category.addProduct(product);
//        category.addProduct(product2);
//        System.out.println(category);
//        user.getProducts().add(product);
//        product.getUsers().add(user);
//        System.out.println(user);
        var service = context.getBean(UserService.class);
        service.showEntityStates();
       // repository.save(user);
       // repository.deleteById(1L );
        service.showRelatedEntites();
    }

}
