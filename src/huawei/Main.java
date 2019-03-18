package huawei;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static HashMap<Integer, Car> cars;
	public static HashMap<Integer, Road> roads;
	public static HashMap<Integer, Cross> crosses;
	public static int crossToRoad[][];// 保存路口与道路关系邻接矩阵  6-502-5，则把[6][5]设为502
	
	public static void main(String[] args) {
		//读取文件创建对象
		cars.put(1001, new Car("1001,1,16,6,1"));
		roads.put(502, new Road("502, 10, 6, 5, 2, 3, 1"));
		crosses.put(6, new Cross("6, 504, 514, 505, 518"));
		//初始化crossToRoad
		while(!cars.isEmpty()){
			for(Map.Entry<Integer, Cross> entry:crosses.entrySet()) {//对每个路口遍历
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
	
	public static void driveCarInGarage() {// 将车库中的车行驶上路
		
	}
}
