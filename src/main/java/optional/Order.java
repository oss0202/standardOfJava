package optional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

/* 주문 */
public class Order {
    private Long id;
    private LocalDateTime date;
    private Member member;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    /**
     *  주문을 한 회원이 살고 있는 도시를 반환한다
     *  */
    public String getCityOfMemberFromOrder(Order order) {
        return order.getMember().getAddress().getCity();
    }

    /**
     *  Optional사용
     *  주문을 한 회원이 살고 있는 도시를 반환한다
     *  */
    public String getOptCityOfMemberFromOrder(Order order) {
        return Optional.ofNullable(order)
                .map(Order::getMember)
                .map(Member::getAddress)
                .map(Address::getCity)
                .orElse("Seoul");
    }

    /**
     * 주어진 시간(분) 내에 생성된 주문을 한 경우에만 해당 회원 정보 구하기
     */
    public Member getMemberIfOrderWithin(Order order, int min) {
//        if (order != null && order.getDate().getTime() > System.currentTimeMillis() - min * 1000) {
        if (order != null && Timestamp.valueOf(order.getDate()).getTime() > System.currentTimeMillis() - min * 1000) {
            return order.getMember();
        }
        return null;
    }
    /**
     * Optional사용
     * 주어진 시간(분) 내에 생성된 주문을 한 경우에만 해당 회원 정보 구하기
     */
    public Optional<Member> getOptMemberIfOrderWithin(Order order, int min) {
        return Optional.ofNullable(order)
                .filter(o -> Timestamp.valueOf(o.getDate()).getTime() > System.currentTimeMillis() - min * 1000)
                .map(Order::getMember);
    }
}
