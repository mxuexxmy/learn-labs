package xyz.mxue.learn.springevent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.mxue.learn.springevent.async.publisher.OrderService;

/**
 * <h2> OrderServiceTest  </h2>
 *
 * @author mxuexxmy
 * @date 7/24/2022 2:10 PM
 */
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void buyOrderTest() {
        orderService.buyOrder("732171109");
    }

}
