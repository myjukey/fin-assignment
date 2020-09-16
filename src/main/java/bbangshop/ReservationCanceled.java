
package bbangshop;

public class ReservationCanceled extends AbstractEvent {

    private Long reservationId;
    private Long breadId;
    private String status ;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
