package huawei;

public class Cross {

	private int roads[]; //·��ID����
	
	public Cross(String s) {
		// �����ļ���������Ӧ�ֶ�
		//·��id,��·id,��·id,��·id,��·id  ˳ʱ��
	}
	
	public Road[] getRoads() {// ����·���漰���������ĸ���·���� ��id��������
		return null;
	}
	
	public String getAction(int road1,int road2) { //��������·���յ��·��ȡ��һ�������� D-ֱ�� L-��ת R-��ת��
		return "D";
	}
	
	public boolean isNoCarWiat() {// ���ظ�·���Ƿ����ڵȴ���·�ڵĳ����ڵ�·�ٽ�·��һ�����پ���������ʻ��·�ڵĳ���
		return false;
	}
}
