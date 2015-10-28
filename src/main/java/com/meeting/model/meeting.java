import java.sql.Date;
import java.util.List;


public class meeting {
private int meetingId;
private List<Employee> employees;
private Room room;
Date timeSlot ;
public int getMeetingId() {
	return meetingId;
}
public void setMeetingId(int meetingId) {
	this.meetingId = meetingId;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
public Room getRoom() {
	return room;
}
public void setRoom(Room room) {
	this.room = room;
}
public Date getTimeSlot() {
	return timeSlot;
}
public void setTimeSlot(Date timeSlot) {
	this.timeSlot = timeSlot;
}



}