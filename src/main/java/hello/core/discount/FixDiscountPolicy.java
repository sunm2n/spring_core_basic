package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) { // enum 타입은 == 쓰는게 맞다.
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
