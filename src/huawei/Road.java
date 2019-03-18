package huawei;

import java.util.ArrayList;

public class Road {

	private String id; // 道路id
	private int length; // 道路长度
	private int speed; // 道路限速
	private int channel; // 车道数 若为双向则实际车道数*2
	private int from; // 起点路口id
	private int to; // 终点路口id
	private boolean isDuplex; //是否双向 
	private ArrayList<Integer> channels[]; //车道具现，数组大小为实际车道数，list长度为道路长度
	
	public Road(String s) {
		// 根据文件内容填充对应字段
		//道路id，道路长度，最高限速，车道数目，起始点id，终点id，是否双向
	}
	
	public void driveAllCarJustOnRoadToEndState() {}//让车在道路上前进一个时间单位，这些车最后都为不出路口的终止状态
	
	public void moveToNextRoad() {} // 车辆通过路口函数
}
