package bbangshop;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name="Assignment")
public class Assignment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long assignmentId;
    private Long reservationId;
    private Long breadId;
    private String bakerName;

    @PostPersist
    public void onPostPersist(){
        ReservationAccepted reservationAccepted = new ReservationAccepted();
        BeanUtils.copyProperties(this, reservationAccepted);
        reservationAccepted.setReservationId(this.getReservationId());
        reservationAccepted.setBakerName(this.getBakerName());
        reservationAccepted.setStatus("breadSucceed");
        reservationAccepted.publishAfterCommit();
    }
    @PostRemove
    public void onPostRemove(){
        ReservationCanceled reservationCanceled = new ReservationCanceled();
        BeanUtils.copyProperties(this, reservationCanceled);
        reservationCanceled.setStatus("breadCanceled");
        reservationCanceled.publishAfterCommit();
    }

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
    public String getBakerName() {
        return bakerName;
    }

    public void setBakerName(String bakerName) {
        this.bakerName = bakerName;
    }


    public Long getBreadId() {
        return breadId;
    }

    public void setBreadId(Long breadId) {
        this.breadId = breadId;
    }





}
