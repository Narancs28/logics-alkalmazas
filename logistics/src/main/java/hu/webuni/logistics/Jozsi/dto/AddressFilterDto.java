package hu.webuni.logistics.Jozsi.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AddressFilterDto {
	
	private LocalDateTime createDateTimeStart;
	private LocalDateTime createDateTimeEnd;	
	private String employeeName;
	private String approverName;
	private Boolean approved;
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	public AddressFilterDto() {
		
	}

	public AddressFilterDto(LocalDateTime createDateTimeStart, LocalDateTime createDateTimeEnd, String employeeName,
			String approverName, Boolean approved, LocalDate startDate, LocalDate endDate) {
		super();
		this.createDateTimeStart = createDateTimeStart;
		this.createDateTimeEnd = createDateTimeEnd;
		this.employeeName = employeeName;
		this.approverName = approverName;
		this.approved = approved;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDateTime getCreateDateTimeStart() {
		return createDateTimeStart;
	}

	public void setCreateDateTimeStart(LocalDateTime createDateTimeStart) {
		this.createDateTimeStart = createDateTimeStart;
	}

	public LocalDateTime getCreateDateTimeEnd() {
		return createDateTimeEnd;
	}

	public void setCreateDateTimeEnd(LocalDateTime createDateTimeEnd) {
		this.createDateTimeEnd = createDateTimeEnd;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getApproverName() {
		return approverName;
	}

	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	
	
}
