package ������ģʽ;

/*
 * ģ��Ա�������Ϊ
 */
public class Main {
public static void main(String[] args) {
	
	Leader a=new LenderDircetor("������");
	Leader b=new LenderManage("������");
	Leader c=new LenderBoss("���ϰ�");
	a.setNextLeader(b);
	b.setNextLeader(c);
	
	 //��ʼ���
    LeaveRequest leaveRequest = new LeaveRequest("Tom", 1, "go home");
    a.handleRequest(leaveRequest);
}
}
