package huawei;

import java.util.HashMap;

public class Car {

	private String id; //车辆ID
	private String start; //出发路口ID
	private String end; //目的路口ID
	private int maxSpeed; //最大速度
	private int speed; //实际速度
	private int startTime; //出发时间
	private String planRun; //计划行驶路线 501-502-503 道路ID串
	private String Ran; //已行驶路线 499-500 道路ID串
	private int direction; //行驶方向 路口ID 如在501道路上从1路口行驶向2，则dir为2
	private int state; //状态 0-终止（在道路上行驶了最大单位路径） 1-等待（准备出路口的车，或是被出路口的车阻挡的车）
	private String action; //在当前道路路口准备采取的下一步动作 D-直行 L-左转 R-右转
	
	public Car(String s) {
		// 根据文件内容填充对应字段
		//车辆id，始发地、目的地、最高速度、出发时间
		
	}
	
	public boolean isConflict(HashMap<Integer, Cross> cross,HashMap<Integer, Road> road) { //判断当前准备过路口的车有没有与其他路口车冲突，如该车左转，则与右道路直行的冲突，需等待。
		//根据行驶方向得到路口id，根据路口道路id分布以及该车action获得可能冲突车道id
		//判断冲突车道上是否存在优先级高于本车的车
		return false;
	}
	
}
