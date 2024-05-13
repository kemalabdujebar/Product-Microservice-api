package com.kemal.ProductMicroserviceapi.service;

import com.kemal.ProductMicroserviceapi.model.Product;
import com.kemal.ProductMicroserviceapi.model.Recommendtion;
import com.kemal.ProductMicroserviceapi.model.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    public Product getProduct(int productId){
        Recommendtion recommendtion = new Recommendtion();
        recommendtion.setProductId(productId);
        recommendtion.setContent("kemal");
        recommendtion.setRate(10);

        List<Recommendtion> recommendtionList = new ArrayList<>();
        recommendtionList.add(recommendtion);


        Review review = new Review();
        review.setProductId(productId);
        review.setContent("this is good");

        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);



        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("Product "+productId);
        product.setPrice(100);
        product.setWeight(23);
        product.setRecommendations(recommendtionList);
        product.setReviews(reviewList);

        return product;
    }
}
