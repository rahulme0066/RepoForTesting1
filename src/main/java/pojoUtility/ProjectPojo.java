package pojoUtility;

public class ProjectPojo {
	private String projectName;
	private String status;
	private String createdBy;
	private String teamSize;
	public ProjectPojo() {
		
	}
	public ProjectPojo(String projectName, String status, String createdBy, String teamSize) {
		super();
		this.projectName = projectName;
		this.status = status;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

}
