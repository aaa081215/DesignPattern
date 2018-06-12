package 责任链模式;

/*
 * 模拟员工请假行为
 */
public class Main {
public static void main(String[] args) {
	
	Leader a=new LenderDircetor("王主任");
	Leader b=new LenderManage("王经理");
	Leader c=new LenderBoss("王老板");
	a.setNextLeader(b);
	b.setNextLeader(c);
	
	 //开始请假
    LeaveRequest leaveRequest = new LeaveRequest("Tom", 1, "go home");
    a.handleRequest(leaveRequest);
}
}
