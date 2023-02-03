package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public interface DiscountPolicy {

    /**
     *
     * @return 할인 대상 금액
     */
    int discount(Member member,int price);


}
