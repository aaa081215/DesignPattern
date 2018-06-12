package 责任链模式;

/*
 *封装请假信息
 */
public class LeaveRequest {
	private String empName;
    private int leaveDays;
    private String reason;
    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
    public String getEmpName() {
        return this.empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getLeaveDays() {
        return this.leaveDays;
    }
    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
    public String getReason() {
        return this.reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

}
