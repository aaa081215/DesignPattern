package ������ģʽ;

public class LenderDircetor extends Leader{
	public LenderDircetor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
	       if(leaveRequest.getLeaveDays()  < 3){
	            System.out.println("Ա����" + leaveRequest.getEmpName() + " ���������"+ leaveRequest.getLeaveDays()+" ���ɣ�" + leaveRequest.getReason() + " ����" + name + "����ͨ��");
	        }else {
	            if(this.nextLeader != null){
	                this.nextLeader.handleRequest(leaveRequest);
	            }
	        }
		
	}
}
