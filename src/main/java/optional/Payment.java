package optional;

import java.time.LocalDateTime;

public class Payment {
    Long id;
    String ordNo;
    LocalDateTime regDt;
    LocalDateTime inputDt;

    public Payment(Long id, String ordNo, LocalDateTime regDt, LocalDateTime inputDt) {
        this.id = id;
        this.ordNo = ordNo;
        this.regDt = regDt;
        this.inputDt = inputDt;
    }

    public Long getId() {
        return id;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public LocalDateTime getInputDt() {
        return inputDt;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", ordNo='" + ordNo + '\'' +
                ", regDt=" + regDt +
                ", inputDt=" + inputDt +
                '}';
    }

    public void setOrderTime(LocalDateTime inputDt) {
        this.inputDt = inputDt;
    }
}
