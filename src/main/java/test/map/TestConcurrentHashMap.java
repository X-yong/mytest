package test.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {

	public static void main(String[] args) {
		Map map= new ConcurrentHashMap();
		//key ���� value Ϊnull ʱ�ᱨ��
		map.put(null, null);

	}

}
