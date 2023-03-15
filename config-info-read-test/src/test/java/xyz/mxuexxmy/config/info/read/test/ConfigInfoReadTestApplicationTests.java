package xyz.mxuexxmy.config.info.read.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.mxuexxmy.config.info.read.test.config.ItemInfoConfigThree;

@SpringBootTest
class ConfigInfoReadTestApplicationTests {

    @Autowired
    private  ItemInfoConfigThree itemInfoConfigThree;

    @Test
    void contextLoads() {
    }

     @Test
     void test1() {
         System.out.println(itemInfoConfigThree.getLocation());
     }
}
