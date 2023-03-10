package chapter6.model;

import java.math.BigDecimal;

public class OrderLine {
    private long id;
    private OrderLineType type;
    private long productId;
    private int quantity;
    private BigDecimal amount;

    private enum OrderLineType {
        PURCHASE,
        DISCOUNT
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", type=" + type +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderLineType getType() {
        return type;
    }

    public void setType(OrderLineType type) {
        this.type = type;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
