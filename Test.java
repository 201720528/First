package test2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise exercise = new Exercise();
		Print print = new Print();
		//��ӡ����
		print.printHeader();		
		//��������
		exercise.createExercise();		
		//��ӡ����
		print.printExercise();			
		//��Ӧ���
		print.printCalculations();
	}

}
