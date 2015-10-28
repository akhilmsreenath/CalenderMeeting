import java.sql.Date;
import java.util.List;


public class meeting {
private int meetingId;
private List<Integer> employeesId;
private int roomId;
Date timeSlot ;
private int  IntervireSchedulerId;
private int leaderId;
private int TeamId;




public int getMeetingId() {
	return meetingId;
}
public void setMeetingId(int meetingId) {
	this.meetingId = meetingId;
}

public List<Integer> getEmployeesId() {
	return employeesId;
}
public void setEmployeesId(List<Integer> employeesId) {
	this.employeesId = employeesId;
}
public int getLeaderId() {
	return leaderId;
}
public void setLeaderId(int leaderId) {
	this.leaderId = leaderId;
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
public int getTeamId() {
	return TeamId;
}
public void setTeamId(int teamId) {
	TeamId = teamId;
}
