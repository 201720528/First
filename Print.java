package test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Print {

	public static int[] result = new int[50];
	//��Ŀ˵��
	public  void printHeader() {
		System.out.println("����50 ��100 ���ڼӷ�/������ʽ��ϰ��");
	}
	
	//��ӡ��Ŀ
	public  void printExercise() {
		
		Exercise exercise = new Exercise();
		HashMap<String,Integer> hashMap = exercise.createExercise();
		//��ȡmap���ϵ�ȫ��keyֵ
		Set<String> keys = hashMap.keySet();
		//ͨ������������keys
		Iterator<String> it = keys.iterator();
		int count=0;
		while(it.hasNext()) {
			String key = it.next();
			Integer value = hashMap.get(key);
			result[count] = value;
			if(count%5==0) {
				System.out.println();
			}
			count++;
			System.out.print(count+"��"+key+"\t");
			
		}
	}
	
	//��ӡ���
	public  void printCalculations() {
		//��ȡ��
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("�����£�");
		int count = 0;
		for(int v:result) {
			if(count%5==0) {
				System.out.println();
			}
			count++;
			System.out.print(count+"��"+v+"\t");
			
		}
	}
	
	
}
