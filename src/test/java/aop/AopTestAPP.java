package aop;

import com.itcast.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.itcast")
public class AopTestAPP {

    @Autowired
    ProductService productService;

    public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(AopTestAPP.class);
        springApplication.run(args);
    }


}
