package paulshushpan.j_lab1;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class СalculationDivider {
	public Vector<Integer> dividers = new Vector<Integer>();
	public Boolean flagCompletlyProgram = true;
	public void calculate (int dividend){
		int i;
		try{
			flagCompletlyProgram = true;
			if(dividend<=0){
				throw new Exception();
			}
		for(i=1;i<=dividend;i++){
			if(dividend%i==0){
				dividers.add(i);
				}
			}
		}
		catch(Exception e){
			flagCompletlyProgram = false;
		}
	}
	public int readFromKeyboard(){
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Введите натуральное число");
		return scan.nextInt();
		}
		catch(Exception e){
			System.out.println("Ошибка ввода. Введите, пожалуйста, натуральное число.");
			scan.close();
			return 0;
			}
		}
	public void printOnDisplay(){
		System.out.println("Делители натурального числа :");
		for(int i=0;i<dividers.size();i++){
				System.out.print(dividers.get(i)+" ");
			}
	}
	public int readFromFile(String readFileName){
				File readFile = new File(readFileName);
				try {
				BufferedReader readBuffer=new BufferedReader(new FileReader(readFile));
				int divider = Integer.parseInt(readBuffer.readLine());
				readBuffer.close();
				return divider;
				}
				catch(Exception e){
					System.out.println("Файл для считывания не найден. Проверьте правильность введенных аргументов.");
					return 0;
				}			
	}
	public void writeOnFile(String writeFileName){
		try{
			File writeFile=new File(writeFileName);
			if(!writeFile.exists()) writeFile.createNewFile();
			BufferedWriter writeBuffer=new BufferedWriter(new FileWriter(writeFile));
			String header,divider="";
			header="Делители натурального числа :";
			writeBuffer.write(header);
			writeBuffer.newLine();
			for(int i=0;i<dividers.size();i++){
					divider=" "+Integer.toString(dividers.get(i));
					writeBuffer.write(divider);
					}
			writeBuffer.close();
		}
		catch(Exception e){
			System.out.println("Ошибка записи в файл.");
			return;
		}
	}
}