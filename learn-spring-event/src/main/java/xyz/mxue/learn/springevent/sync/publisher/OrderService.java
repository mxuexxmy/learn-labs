package xyz.mxue.learn.springevent.sync.publisher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import xyz.mxue.learn.springevent.sync.event.OrderProductEvent;

/**
 * <h2> OrderService  </h2>
 *
 * @author mxuexxmy
 * @date 7/24/2022 2:09 PM
 */
@Slf4j
@RequiredArgsConstructor
public class OrderService {

    /** 注入ApplicationContext用来发布事件 */
    private final ApplicationContext applicationContext;

//    /**
//     * 下单
//     *
//     * @param orderId 订单ID
//     * @return string
//     */
//    public String buyOrder(String orderId) {
//        long start = System.currentTimeMillis();
//        // 1.查询订单详情
//
//        // 2.检验订单价格 （同步处理）
//        applicationContext.publishEvent(new OrderProductEvent(this, orderId));
//
//        // 3.短信通知（异步处理）
//
//        long end = System.currentTimeMillis();
//        log.info("任务全部完成，总耗时：({})毫秒", end - start);
//        return "购买成功";
//    }

}
