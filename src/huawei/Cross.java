package huawei;

public class Cross {

	private int roads[]; //路口ID数组
	
	public Cross(String s) {
		// 根据文件内容填充对应字段
		//路口id,道路id,道路id,道路id,道路id  顺时针
	}
	
	public Road[] getRoads() {// 返回路口涉及到的至多四个道路对象 按id升序排列
		return null;
	}
	
	public String getAction(int road1,int road2) { //根据起点道路与终点道路获取下一步操作（ D-直行 L-左转 R-右转）
		return "D";
	}
	
	public boolean isNoCarWiat() {// 返回该路口是否还有在等待过路口的车（在道路临近路口一个限速距离内再无驶向路口的车）
		return false;
	}
}
