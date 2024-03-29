package com.example.Ecommerce_BE.model.service;

import java.util.List;

import com.example.Ecommerce_BE.model.entity.EStatusProduct;
import com.example.Ecommerce_BE.model.entity.Product;

public interface ProductService {
	Product saveOrUpdate(Product product);
	Product getProductSellById(int id);
	Product getById(int id);
	List<Product> findByCensorship(EStatusProduct censorship );
	List<Product> getAllProductSale();
	List<Product> searchProductSellByTitleContain(String strSearch);
	List<Product> findByShopIdAndCensorship(int shopId, EStatusProduct censorship);
}
