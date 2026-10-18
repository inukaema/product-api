package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {



    @Autowired private ProductServices productServices;
    @GetMapping("/products")
   public List<Product> getAllproducts(){
        return productServices.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return productServices.getProductById(id).orElse(null);
    }

    @PostMapping ("/product")
    public Product addProduct(@RequestBody Product Product){
        return productServices.addProduct(Product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productServices.deleteProduct(id);
    }
    @GetMapping("/products/search")
    public List<Product>search(@RequestParam String name){
        return productServices.findByName(name);
    }
}


