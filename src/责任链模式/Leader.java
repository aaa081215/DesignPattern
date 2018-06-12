package ������ģʽ;

/**
 * �쵼�ĳ�����
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//�������ϵĺ�̶���
    public Leader(String name) {
        this.name = name;
    }
    //���ú�̶���
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
    //���������ҵ����ķ���
    public abstract void handleRequest(LeaveRequest leaveRequest);

}