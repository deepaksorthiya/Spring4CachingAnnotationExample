package com.ecw.service;

import com.ecw.model.Product;

public interface ProductService {

	Product getByName(String name);

	void refreshAllProducts();

	Product updateProduct(Product product);

}
