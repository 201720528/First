package test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


public class Exercise {
	//�洢��
	//������Ŀ
	public  HashMap<String,Integer> createExercise() {
		//HashSet ����ȥ���ظ�����Ŀ
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

		//������
		int count = 0;
		
		//����50����Ŀ
		while(count<50) {
			//�洢�����
			GenerateEquations generateEquations = new GenerateEquations();
			Stack<String> stack = generateEquations.generateEquations();	
			String str = null;
			//���������
			int[] num = createRandom();
			//���ڼ�����
			int out = calculate(stack,num[0],num[1]);			
			if(out>=0&&out<=100) {//��������������������
				
				while(!stack.empty()) {
					str = num[0]+stack.pop()+num[1];
				}
				str = str + "=";
				while(str.length()<=8) {
					str +=" ";
				}
				count++;
				hashMap.put(str, out);
			}else {//����������������ѭ��
				continue;
			}
			
		}
		return hashMap;
	}
	
	//˽�з���--���������
	private  int[] createRandom() {
		int[] num = new int[2];
		num[0] = (int)(Math.random()*100);
		num[1] = (int)(Math.random()*100);
		return num;
	}
	//˽�з���--���ڼ�����
	private static int calculate(Stack<String> stack,int num1,int num2) {
		
		int out = 0;
		if(stack.peek()=="+") {
			out = num1 + num2;
		}
		if(stack.peek()=="-") {
			out = num1 - num2;
		}
		return out;
	}
	
}
