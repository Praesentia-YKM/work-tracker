package immutablePractice;

/**
 *  final 로 둬서 밸류타입에 대한 불변성 확보
 *  외부에서 꺼내서 값 변경 가능하니까..
 */
public class OrderLine {
//  private final String itemName;
//  private final int quantity;
    private String itemName;
    private int quantity;

    public OrderLine(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
