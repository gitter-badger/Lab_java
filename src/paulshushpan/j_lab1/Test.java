package paulshushpan.j_lab1;


public class Test extends �alculationDivider{
	public void test(){
		int testDividend[]={-12,0,12};
		for(int i=0;i<=2;i++){
			this.calculate(testDividend[i]);
			if(this.flagCompletlyProgram){
				System.out.println("���� ��� "+testDividend[i]+" �������������.");
			}
			else{
				System.out.println("���� ��� "+testDividend[i]+" �������������.");
			}
		}
	}
}
