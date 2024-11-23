package immutablePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/** 일급컬렉션
 * 내부 리스트의 복사본 (1) 이나 불변 리스트(2) 를 사용해서 외부의 변경으로부터 보호
 *
 * (1) : 원본 리스트를 보호하면서 외부에서 자유롭게 조작 가능한 도메인 로직일때[무결성이 중요하지 않을떄],
 *       매번 새로생성해서 메모리 소모하므로 비용 큼
 * (2) :
 */
public class OrderLines {
    private final List<OrderLine> lines;

    public OrderLines(List<OrderLine> lines) {
//        this.lines = lines;
         // (1)
         this.lines = Collections.unmodifiableList(new ArrayList<>(lines)); // 불변 리스트
    }

    public List<OrderLine> getLines() {
        return lines;
        // (2) return new ArrayList<>(lines);
    }
}
