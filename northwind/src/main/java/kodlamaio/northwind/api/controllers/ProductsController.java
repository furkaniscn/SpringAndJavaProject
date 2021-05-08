package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController // Sen bir controllersin demek bu
@RequestMapping("/api/products") // kodlama.io/api/products bir istek gelirse bu controller karşılayıp kara
									// verecek ve bune domain diyoruz
public class ProductsController { // Dış dünya ile iletişim kurduğumuz yer

	// @Autowired // Birden fazla servis kullanacağımız zaman bunu tek tek her
	// servise yazmamız lazım
	private ProductService productService;

	@Autowired // Kim ProductService'i implemente etmiş onu buluyor ve spring arka planda
				// ProductManager'i newliyor ve newlenmiş nesneyi buraya yani productService'e
				// getiriyor
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") // kodlama.io/api/product/getall şeklinde bir şey yazarsam sistemde bu çalışacak
	public List<Product> getAll() {
		return this.productService.getAll();

	}
}
