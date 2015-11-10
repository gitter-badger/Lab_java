package paulshushpan.j_lab1;


public class Test extends ÑalculationDivider{
	public void test(){
		int testDividend[]={-12,0,12};
		for(int i=0;i<=2;i++){
			this.calculate(testDividend[i]);
			if(this.flagCompletlyProgram){
				System.out.println("Òåñò ïðè "+testDividend[i]+" ïîëîæèòåëüíûé.");
			}
			else{
				System.out.println("Òåñò ïðè "+testDividend[i]+" îòðèöàòåëüíûé.");
			}
		}
	}
}
