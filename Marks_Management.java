import java.util.*;
class Student{
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
