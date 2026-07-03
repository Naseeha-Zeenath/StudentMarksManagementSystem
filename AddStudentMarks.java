import javax.swing.*;
import java.awt.*;

class AddStudent extends JFrame{
	private JButton addBtn;
	private JButton cancelBtn;
	private JTextField inputStudentId;
	private JTextField inputName;
	private JTextField inputPRF;
	private JTextField inputDBMS;
	
	AddStudent(){
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Add Student Form");
		title.setHorizontalAlignment(JLabel.CENTER);
		add("North",title);
		
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		addBtn = new JButton("ADD");
		cancelBtn = new JButton("CANCEL");
		btnPanel.add(addBtn);
		btnPanel.add(cancelBtn);
		add("South",btnPanel);
		 
		 
		 
		JPanel lablePanel = new JPanel();
		lablePanel.setLayout(new GridLayout(4,1));
		
		JLabel[] lableArr = new JLabel[4];
		String[] lableText = {"Student Id", "Name", "PRF Marks","DBMS Marks"};
		
		for(int i=0; i<lableArr.length; i++){
			lableArr[i]= new JLabel(lableText[i]);
			lablePanel.add(lableArr[i]);
		}
		
		add("West",lablePanel);
		
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(4,1));
		
		inputStudentId= new JTextField(10);
		JPanel idAlignmentPanel = new JPanel (new FlowLayout(FlowLayout.LEFT));
		idAlignmentPanel.add(inputStudentId);
		inputPanel.add(idAlignmentPanel);
		
		inputName= new JTextField(20);
		JPanel nameAlignmentPanel = new JPanel (new FlowLayout(FlowLayout.LEFT));
		nameAlignmentPanel.add(inputName);
		inputPanel.add(nameAlignmentPanel);
		
		inputPRF= new JTextField(5);
		JPanel prfAlignmentPanel = new JPanel (new FlowLayout(FlowLayout.LEFT));
		prfAlignmentPanel.add(inputPRF);
		inputPanel.add(prfAlignmentPanel);
		
		inputDBMS= new JTextField(5);
		JPanel dbmsAlignmentPanel = new JPanel (new FlowLayout(FlowLayout.LEFT));
		dbmsAlignmentPanel.add(inputDBMS);
		inputPanel.add(dbmsAlignmentPanel);
		
		
		add("East",inputPanel);
	}
	
}



class AddStudentMarks{
	public static void main(String args[]){
		new AddStudent().setVisible(true);
	}
}

