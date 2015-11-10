package paulshushpan.j_lab1;
import paulshushpan.j_lab1.*;

public class Main {
	public static void main(String[] args){
		ÑalculationDivider computation = new ÑalculationDivider();
		Test tester = new Test();
		tester.test();
		String readFileName=null, writeFileName=null;
		boolean flagReadFile=false, flagWriteFile=false;
		int dividend=0;
		if(args.length!=0){
				for(int i=0;i<args.length;i++){
					if(args[i].compareTo("-i")==0){
						flagReadFile=true;
						readFileName=args[i+1];
					}
					if(args[i].compareTo("-o")==0){
						flagWriteFile=true;
						writeFileName=args[i+1];
					}
				}
		}
			if(flagReadFile==false){
				dividend=computation.readFromKeyboard();
				computation.calculate(dividend);
			}
			else {
				dividend=computation.readFromFile(readFileName);
				computation.calculate(dividend);
			}
			if (flagWriteFile==false){
				computation.printOnDisplay();
			}
			else{
				computation.writeOnFile(writeFileName);
			}
		return;
	}
}
