package 责任链模式;


public class LenderBoss extends Leader{

	public LenderBoss(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		 if(leaveRequest.getLeaveDays() >= 10 && leaveRequest.getLeaveDays() < 30){
	            System.out.println("员工：" + leaveRequest.getEmpName() + " 请假天数："+ leaveRequest.getLeaveDays()+" 理由：" + leaveRequest.getReason() + " 总经理" + name + "审批通过");
	        }else {
	            System.out.println("莫非你" +leaveRequest.getEmpName() +"想离职？居然请假"+leaveRequest.getLeaveDays() + "天！");
	        }
		
	}

}
