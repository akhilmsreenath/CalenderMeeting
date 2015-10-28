
import java.sql.Date;
import java.util.List;


public class meeting {
private int meetingId;
private List<Integer> employeesId;
private int roomId;
Date timeSlot ;
private int  IntervireSchedulerId;

public int getMeetingId() {
	return meetingId;
}
public void setMeetingId(int meetingId) {
	this.meetingId = meetingId;
}
public List<Integer> getEmployeesId() {
	return employeesId;
}
public void setEmployees(List<Integer> employeesId) {
	this.employeesId = employeesId;
}
public int getRoomId() {
	return roomId;
}
public void setRoomId(int roomId) {
	this.roomId = roomId;
}
public Date getTimeSlot() {
	return timeSlot;
}
public void setTimeSlot(Date timeSlot) {
	this.timeSlot = timeSlot;
}
public int getIntervireSchedulerId() {
	return IntervireSchedulerId;
}
public void setIntervireSchedulerId(int IntervireSchedulerId) {
	this.IntervireSchedulerId = IntervireSchedulerId;
}


}
