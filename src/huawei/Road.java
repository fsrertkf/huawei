package huawei;

import java.util.ArrayList;

public class Road {

	private String id; // ��·id
	private int length; // ��·����
	private int speed; // ��·����
	private int channel; // ������ ��Ϊ˫����ʵ�ʳ�����*2
	private int from; // ���·��id
	private int to; // �յ�·��id
	private boolean isDuplex; //�Ƿ�˫�� 
	private ArrayList<Integer> channels[]; //�������֣������СΪʵ�ʳ�������list����Ϊ��·����
}
