package guru.springframework.bootstrap;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = LogManager.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product shirt = new Product();
        shirt.setDescription("T-Shirt Red");
        shirt.setPrice(new BigDecimal("499"));
        shirt.setImageUrl("https://cdn.shopify.com/s/files/1/0028/6559/4412/products/Angry-Birds-T-shirt-Red-The-Banyan-Tee-1654592163-_1.jpg?v=1654893464");
        shirt.setProductId("2352");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setDescription("Mug");
        mug.setImageUrl("https://i.etsystatic.com/23564917/r/il/60629b/2743767292/il_340x270.2743767292_nly8.jpg");
        mug.setProductId("1689");
        mug.setPrice(new BigDecimal("399"));
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());
        
        Product jacket = new Product();
        jacket.setDescription("Jacket");
        jacket.setImageUrl("https://m.media-amazon.com/images/I/31jxIrzPr1L._SL500_.jpg");
        jacket.setProductId("1686");
        jacket.setPrice(new BigDecimal("799"));
        productRepository.save(jacket);

        log.info("Saved jacket - id:" + jacket.getId());
        
        Product tshirt = new Product();
        tshirt.setDescription("T-shirt King Pig");
        tshirt.setImageUrl("https://m.media-amazon.com/images/I/A13usaonutL._CLa%7C2140%2C2000%7C919LA2n93YL.png%7C0%2C0%2C2140%2C2000%2B0.0%2C0.0%2C2140.0%2C2000.0_AC_UL1500_.png");
        tshirt.setProductId("1672");
        tshirt.setPrice(new BigDecimal("499"));
        productRepository.save(tshirt);

        log.info("Saved tshirt - id:" + tshirt.getId());
        
        Product toy = new Product();
        toy.setDescription("Toy Bomb");
        toy.setImageUrl("https://i0.wp.com/theincidentalparent.com/wp-content/uploads/2019/08/IMG_20190827_172708.jpg?resize=750%2C750&ssl=1");
        toy.setProductId("1675");
        toy.setPrice(new BigDecimal("349"));
        productRepository.save(toy);

        log.info("Saved toy - id:" + toy.getId());
        
        Product bag = new Product();
        bag.setDescription("Bag Chuck");
        bag.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61m88tdCPxL._SS400_.jpg");
        bag.setProductId("1677");
        bag.setPrice(new BigDecimal("549"));
        productRepository.save(bag);

        log.info("Saved bag - id:" + bag.getId());
        
        Product sticker = new Product();
        sticker.setDescription("Sticker Hal");
        sticker.setImageUrl("https://cdn.dribbble.com/users/363544/screenshots/1295381/media/df4e4bb8a4c9dbad71517fe6e182425b.jpg?compress=1&resize=400x300");
        sticker.setProductId("1627");
        sticker.setPrice(new BigDecimal("149"));
        productRepository.save(sticker);

        log.info("Saved sticker - id:" + sticker.getId());
    }
}
