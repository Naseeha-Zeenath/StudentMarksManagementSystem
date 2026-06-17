import java.util.*;
class Student{
	String id;
	String name;
	int prfMarks;
	int dbmsMarks;
	
	Student(){}
	
	Student(String id, String name, int prfMarks, int dbmsMarks){
		this.id = id;
		this.name = name;
		this.prfMarks = prfMarks;
		this.dbmsMarks = dbmsMarks;
	}
	
}

class Marks_Management{
	public static Student[] st = new Student[0];
	
	public static void addStudent(){
		increaseStudent();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Id         : ");
		String id = input.next();
		System.out.print("Enter Student Name       : ");
		String name = input.next();
		
		int prfMarks;
		int dbmsMarks;
		do{
			System.out.print("Enter Student PRF Marks  : ");
			prfMarks = input.nextInt();
			
		}while(prfMarks<0);
		
		do{
			System.out.print("Enter Student DBMS Marks : ");
			dbmsMarks = input.nextInt();
		}while(dbmsMarks<0);
		
		st[st.length-1] = new Student(id,name,prfMarks,dbmsMarks);
		
	}
	
	public static void increaseStudent(){
		Student[] temp = new Student[st.length+1];
		
		for(int i =0; i<st.length; i++){
			temp[i] = st[i];
		}
		st = temp;
	}
	public static void deleteStudent(){		
		System.out.println("\nDelete Student ");
		System.out.println("=================");
		int value =searchStudent();
		
		if(value >= 0){
			for(int j =value; j< st.length-1;j++){
				st[j] = st[j+1];
			}
			
			Student[] temp = new Student[st.length-1];	
			for(int i = 0; i<temp.length; i++){
				temp[i] = st[i];
			}
			
			st = temp;
		
		}
	}
	
	public static int searchStudent(){
		Scanner input = new Scanner(System.in);
		System.out.println("Search by \nId (Enter number 1) \nName(Enter number 2)");
		System.out.print("Enter option : ");
		int option = input.nextInt();
		
		String id= null;
		String name = null;
		
		if(option == 1){
			System.out.print("Enter Student Id : ");
			id = input.next();
		}else if(option == 2){
			System.out.print("Enter Student Name : ");
			name = input.next();
			
		}else{
			System.out.print("Invalid option...");
			
		}
		int value = -1;
		
		for(int i=0; i<st.length; i++){
			if((st[i].id).equals(id) || (st[i].name).equals(name)){
				System.out.println(st[i].id+"\t"+st[i].name+"\t"+st[i].prfMarks+"\t"+st[i].dbmsMarks);
				value = i;
			}
		}
		
		return value;
	}
	
	public static void updateStudent(){
		System.out.println("\nUpdate Student");
		System.out.println("=================");
		int value = searchStudent();
		Scanner input = new Scanner(System.in);
		
		if(value>= 0){
			System.out.println("Enter what do you want to update \n 1) Id \n 2) Name \n 3) PRF Marks \n 4) DBMS Marks");
			System.out.print("Enter Option : ");
			int option = input.nextInt();
			
			if(option == 1){
				System.out.print("Enter New Id : ");
				String id = input.next();
				
				st[value].id = id;
			} else if(option == 2){
				System.out.print("Enter New Id : ");
				String name = input.next();
				
				st[value].name = name;
			}else if(option == 3){
				System.out.print("Enter New Id : ");
				int prfMarks = input.nextInt();
				
				st[value].prfMarks = prfMarks;
			}else if(option == 4){
				System.out.print("Enter New Id : ");
				int dbmsMarks = input.nextInt();
				
				st[value].dbmsMarks = dbmsMarks;
			}
		}
	}

	
	public static void printStudent(){
		System.out.print("============================\n");
		for(int i=0; i<st.length; i++){
			System.out.println(st[i].id+"\t"+st[i].name+"\t"+st[i].prfMarks+"\t"+st[i].dbmsMarks);
		}
	}
	
	public static void main(String args[]){
		addStudent();
		addStudent();
		addStudent();
		printStudent();
		int search = searchStudent();
		updateStudent();
		printStudent();
		deleteStudent();
		printStudent();
		
	}
	
}









/*class Student{
	String id;
	String name;
	int prfMarks;
	int dbmsMarks;	
	
	public void print(){
		System.out.println(id+"\t"+name+"\t"+prfMarks+"\t"+dbmsMarks);
	}
}

class Marks_Management{
	public static void main(String args[]){
		
		Student[] st= new Student[1];
		int i = st.length-1;
		
		while(true){
		
			st[i] = new Student();
			
			Scanner input=new Scanner(System.in);
			System.out.print("Input Student Id : ");
			st[i].id=input.nextLine(); 
			
			System.out.print("Input Student Name : ");
			st[i].name=input.nextLine();
			
			System.out.print("Input PRF  Marks : ");
			st[i].prfMarks=input.nextInt();
			
			if(st[i].prfMarks<0){
					break;
			}
			
			System.out.print("Input DBMS Marks : ");
			st[i].dbmsMarks=input.nextInt();
			
			if(st[i].dbmsMarks<0){
					break;
			}
			
			Student[] temp = new Student[st.length+1];
			
			for(int j=0; j<st.length; j++){
				temp[j] = st[j];
			}
			
			st = temp;
			
			i++;

		}
	
        System.out.println("\nID\tName\tPRF\tDBMS");
        System.out.println("================================");
        
		for(Student s:st){
				s.print();
			}
		}	
}
*/
