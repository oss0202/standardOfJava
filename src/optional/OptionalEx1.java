package optional;

import java.time.LocalDateTime;
import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<Payment> payment = Optional.ofNullable(new Payment(11L, "1234", LocalDateTime.now(), LocalDateTime.now()));
        payment.map(payObj -> {
            LocalDateTime ordDateTime = payObj.getInputDt();
            payObj.setOrderTime(ordDateTime);
            return payObj;
        }).ifPresent(payObj -> {
            System.out.println(payObj.toString());
        });
    }
}
