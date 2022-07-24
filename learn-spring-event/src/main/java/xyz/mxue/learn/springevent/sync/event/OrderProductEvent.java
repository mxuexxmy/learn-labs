package xyz.mxue.learn.springevent.sync.event;

import org.springframework.context.ApplicationEvent;

/**
 * <h2> OrderProductEvent  </h2>
 *
 * @author mxuexxmy
 * @date 7/24/2022 1:58 PM
 */
public class OrderProductEvent extends ApplicationEvent {

    /** 该类型事件携带的信息 */
    private String orderId;

    public OrderProductEvent(Object source, String orderId) {
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderProductEvent{" +
                "orderId='" + orderId + '\'' +
                '}';
    }
}
