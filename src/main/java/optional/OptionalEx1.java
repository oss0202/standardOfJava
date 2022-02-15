package optional;

import java.time.LocalDateTime;
import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<Payment> optPayment = Optional.ofNullable(new Payment(11L, "1234", LocalDateTime.now(), LocalDateTime.now()));
        optPayment.map(payObj -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalDateTime ordDateTime = LocalDateTime.now();//payObj.getInputDt();
            payObj.setOrderTime(ordDateTime);
            return payObj;
        }).ifPresent(System.out::println);

        Optional.ofNullable(optPayment);
    }
}
