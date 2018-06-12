package 责任链模式;

public class LenderManage extends Leader{

	public LenderManage(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
	       if(leaveRequest.getLeaveDays() >= 3 && leaveRequest.getLeaveDays() < 10){
	            System.out.println("员工：" + leaveRequest.getEmpName() + " 请假天数："+ leaveRequest.getLeaveDays()+" 理由：" + leaveRequest.getReason() + " 经理" + name + "审批通过");
	        }else {
	            if(this.nextLeader != null){
	                this.nextLeader.handleRequest(leaveRequest);
	            }
	        }
		
	}

}
