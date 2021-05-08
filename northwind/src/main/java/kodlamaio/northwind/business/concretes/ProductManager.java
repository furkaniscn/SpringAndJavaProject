package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired // Spring gidip arka planda buna karşılık gelebilecek ve productDao'nun sınıfı
				// olabilecek bir sınıf tanımlıyor ve bu using fieldin bir başka yazımı bunu
				// onun yerine yazabiliriz
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
