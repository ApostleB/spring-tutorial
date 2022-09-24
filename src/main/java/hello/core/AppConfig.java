package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //설정정보 구성정보를 담당하는 뜻
public class AppConfig {
    //애플리케이션 전체 구성을 한눈에 파악하기 쉽다.

    @Bean   //각 메서드에 Bean을 적어주면 다 스프링 컨테이너에 등록
    public MemberService memberService(){
        //생성자 주입
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
        //고정할인 -> Rate
    }
}

/*
* AppConfig는 애플리케이션의 실제 동작에 필요한 구현 객체를 생성한다.
* MemberServiceImpl
* MemoryMemberRepository
* OrderServiceImpl
* FixDiscountPolicy
*
* AppConfig는 생성한 객체 인스턴스의 참조(레퍼런스)를 생성자를 통해서 주입(연결)해준다.
* MemberServiceImpl -> MemoryMemberRepository
* OrderServiceImpl -> MemoryMemberRepository, FixDiscountPolicy
*
* */