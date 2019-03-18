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
}
