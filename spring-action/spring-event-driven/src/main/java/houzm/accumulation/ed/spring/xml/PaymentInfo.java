package houzm.accumulation.ed.spring.xml;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 14:19
 * description:
 */
@Data
@AllArgsConstructor
public class PaymentInfo implements Serializable {
    private static final long serialVersionUID = 7339701802012004687L;
    private String id;
    private int status;
    private String serialNo;
}
