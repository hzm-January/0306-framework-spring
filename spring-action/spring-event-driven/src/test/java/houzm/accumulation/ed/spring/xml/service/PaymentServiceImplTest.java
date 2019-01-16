package houzm.accumulation.ed.spring.xml.service;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * PaymentServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>01/16/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:ApplicationContext.xml")
@ActiveProfiles(value = "xml")
public class PaymentServiceImplTest {

    @Autowired
    private PaymentService paymentService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: paymentSuccess(String message, String id)
     */
    @Test
    public void testPaymentSuccess() throws Exception {
        long start = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        IntStream.rangeClosed(1, 1000).forEach(key -> {
//            executorService.execute(() -> {
//                System.out.println(key);
//                try {
//                    paymentService.paymentSuccess(""+key);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//        });
        IntStream.rangeClosed(1, 10000).forEach(key->{
            System.out.println(key);
            paymentService.paymentSuccess("success", ""+key);
        });


        while (true) {
            TimeUnit.SECONDS.sleep(1);
            long time = System.currentTimeMillis() - start;
            System.out.println("---- time: " + time);
        }
//        paymentService.paymentSuccess("success","1");
//TODO: Test goes here... 
    }

    /**
     * Method: setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
     */
    @Test
    public void testSetApplicationEventPublisher() throws Exception {
//TODO: Test goes here... 
    }


} 
