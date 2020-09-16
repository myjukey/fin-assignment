
package bbangshop;

public class ReservationCancelRequested extends AbstractEvent {

    private Long reservationId;
    private Long breadId;

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

}
