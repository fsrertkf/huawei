package huawei;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static HashMap<Integer, Car> cars;
	public static HashMap<Integer, Road> roads;
	public static HashMap<Integer, Cross> crosses;
	public static int crossToRoad[][];// ����·�����·��ϵ�ڽӾ���  6-502-5�����[6][5]��Ϊ502
	
	public static void main(String[] args) {
		//��ȡ�ļ���������
		cars.put(1001, new Car("1001,1,16,6,1"));
		roads.put(502, new Road("502, 10, 6, 5, 2, 3, 1"));
		crosses.put(6, new Cross("6, 504, 514, 505, 518"));
		//��ʼ��crossToRoad
		while(!cars.isEmpty()){
			for(Map.Entry<Integer, Cross> entry:crosses.entrySet()) {//��ÿ��·�ڱ���
				Cross cross=entry.getValue();
				while(!cross.isNoCarWiat()) {
					for(Road road:cross.getRoads()) {
						road.driveAllCarJustOnRoadToEndState();
						road.moveToNextRoad();
					}
				}
			}
			driveCarInGarage();
		}
	}
	
	public static void driveCarInGarage() {// �������еĳ���ʻ��·
		
	}
}
