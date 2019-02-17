package aop;

import com.itcast.product.Product;
import com.itcast.product.security.CurrentUserHolder;
import com.itcast.product.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={AopTestAPP.class})
public class AopTest {

    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void aopTest(){
        CurrentUserHolder.set("tom");
        Product product= new Product();
        productService.add(product);
    }

    @Test
    public void aopTest2(){
        CurrentUserHolder.set("tom");
        Product product = new Product();
        productService.delete(product);
    }

}
