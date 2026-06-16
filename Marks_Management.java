import java.util.*;
class Marks_Management{
	public static String[] id = new String[1];
	public static String[] name = new String[1];
	public static int[] prfMarks = new int[1];
	public static int[] dbmsMarks = new int[1];
	
	public static void addStudent(){
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Id : ");
			id[id.length-1]= input.nextLine(); 
			
			System.out.print("Enter Name : ");
			name[name.length-1]= input.nextLine(); 
			
			System.out.print("Enter PRF Marks : ");
			prfMarks[prfMarks.length-1]= input.nextInt(); 
			
			System.out.print("Enter DBMS Marks : ");
			dbmsMarks[dbmsMarks.length-1]= input.nextInt(); 
			
			if(prfMarks[prfMarks.length-1]<0 || dbmsMarks[dbmsMarks.length-1]<0){
				break;
			}
			
			ingrimentArray();
		}

	}
	
	public static void ingrimentArray(){
		String[] temp_id = new String[id.length];
		String[] temp_name = new String[name.length];
		int[] temp_prfMarks = new int[prfMarks.length];
		int[] temp_dbmsMarks = new int[dbmsMarks.length];
		
		temp_id = id;
		temp_name = name;
		temp_prfMarks = temp_prfMarks;
		temp_dbmsMarks = temp_dbmsMarks;
		
		id = temp_id;
		name = temp_name;
		prfMarks = temp_prfMarks;
		dbmsMarks = temp_dbmsMarks;
		
	}
	
	public static void main(String args[]){
		addStudent();
	}
} 
