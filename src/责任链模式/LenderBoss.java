package ������ģʽ;


public class LenderBoss extends Leader{

	public LenderBoss(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		 if(leaveRequest.getLeaveDays() >= 10 && leaveRequest.getLeaveDays() < 30){
	            System.out.println("Ա����" + leaveRequest.getEmpName() + " ���������"+ leaveRequest.getLeaveDays()+" ���ɣ�" + leaveRequest.getReason() + " �ܾ���" + name + "����ͨ��");
	        }else {
	            System.out.println("Ī����" +leaveRequest.getEmpName() +"����ְ����Ȼ���"+leaveRequest.getLeaveDays() + "�죡");
	        }
		
	}

}
