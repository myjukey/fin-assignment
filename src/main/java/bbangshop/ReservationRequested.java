package bbangshop;

public class ReservationRequested extends AbstractEvent {

    private Long reservationId;
    private Long breadId;
    private Integer quantity;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getBreadId() {
        return breadId;
    }

    public void setBreadId(Long breadId) {
        this.breadId = breadId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



}
