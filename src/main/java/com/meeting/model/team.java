import java.util.List;


public class team {
	private int teamId;
	private String teamName;
	private int LeaderId;
	private List<Integer> employeeIds;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getLeaderId() {
		return LeaderId;
	}
	public void setLeaderId(int leaderId) {
		LeaderId = leaderId;
	}
	public List<Integer> getEmployeeIds() {
		return employeeIds;
	}
	public void setEmployeeIds(List<Integer> employeeIds) {
		this.employeeIds = employeeIds;
	}

}
