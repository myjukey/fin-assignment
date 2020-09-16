
package bbangshop;

public class ReservationAccepted extends AbstractEvent {

    private Long assignmentId;
    private Long reservationId;
    private Long breadId;
    private String status ;
    private String bakerName ;

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

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

    public String getBakerName() {
        return bakerName;
    }

    public void setBakerName(String bakerName) {
        this.bakerName = bakerName;
    }




}
