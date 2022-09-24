package hello.core.order;

public interface OrderService {
    //클라이언트는 주문생성할 때 회원ID, 상품명, 상품가격을 넘긴다

    Order createOrder(Long memberId, String itemName, int itemPrice);


}
