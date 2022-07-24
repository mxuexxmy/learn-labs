package xyz.mxue.learn.springevent.async.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h2> MsgEvent  </h2>
 *
 * @author mxuexxmy
 * @date 7/24/2022 2:30 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MsgEvent {

    /** 该类型事件携带的信息 */
    public String orderId;

}
