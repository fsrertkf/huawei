package huawei;

import java.util.HashMap;

public class Car {

	private String id; //����ID
	private String start; //����·��ID
	private String end; //Ŀ��·��ID
	private int maxSpeed; //����ٶ�
	private int speed; //ʵ���ٶ�
	private int startTime; //����ʱ��
	private String planRun; //�ƻ���ʻ·�� 501-502-503 ��·ID��
	private String Ran; //����ʻ·�� 499-500 ��·ID��
	private int direction; //��ʻ���� ·��ID ����501��·�ϴ�1·����ʻ��2����dirΪ2
	private int state; //״̬ 0-��ֹ���ڵ�·����ʻ�����λ·���� 1-�ȴ���׼����·�ڵĳ������Ǳ���·�ڵĳ��赲�ĳ���
	private String action; //�ڵ�ǰ��··��׼����ȡ����һ������ D-ֱ�� L-��ת R-��ת
	
	public Car(String s) {
		// �����ļ���������Ӧ�ֶ�
		//����id��ʼ���ء�Ŀ�ĵء�����ٶȡ�����ʱ��
		
	}
	
	public boolean isConflict(HashMap<Integer, Cross> cross,HashMap<Integer, Road> road) { //�жϵ�ǰ׼����·�ڵĳ���û��������·�ڳ���ͻ����ó���ת�������ҵ�·ֱ�еĳ�ͻ����ȴ���
		//������ʻ����õ�·��id������·�ڵ�·id�ֲ��Լ��ó�action��ÿ��ܳ�ͻ����id
		//�жϳ�ͻ�������Ƿ�������ȼ����ڱ����ĳ�
		return false;
	}
	
}
