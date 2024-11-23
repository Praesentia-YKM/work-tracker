package immutablePractice;

import java.util.ArrayList;
import java.util.List;

public class DirectModificationExample {
    public static void main(String[] args) {
        List<OrderLine> initialOrderLines = new ArrayList<>();
        initialOrderLines.add(new OrderLine("ItemA", 2));
        initialOrderLines.add(new OrderLine("ItemB", 3));

        OrderLines orderLines = new OrderLines(initialOrderLines);

        System.out.println("원래 주문라인: " + orderLines.getLines());

        List<OrderLine> fetchedLines = orderLines.getLines();
        
        // 불변리스트로 감싸도 원래 가변인 리스트 자체는 수정이 됨 
        // -> 이거 막으려면 setter를 두면안됨 즉, 밸류타입(OrderLine)에 대하여 final필드여야함
        fetchedLines.get(0).setItemName("Item 외부에서 set");
        fetchedLines.get(0).setQuantity(10); // ItemA요소 변경

        // 감싼 리스트 자체는 수정 안됨
        fetchedLines.add(new OrderLine("ItemC", 5));
        fetchedLines.remove(1); // ItemB지움

        System.out.println("변경된 주문라인: " + orderLines.getLines());
   }
}
