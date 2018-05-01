package project342;

import java.util.List;

public class CreatingConceptNote {
	
	public int Id;
	public String title;
	public String CreatingDate;
	public String NoteText;
	public StaffMember Staff;
	public Campaign Campaign;
	
	
	
	
	public CreatingConceptNote(int id, String ct,String date, String txt, StaffMember staff, Campaign campaign) {
		if (staff.AdminOrNot == false) {
		
		this.Id=id;
		this.title = ct;
		this.CreatingDate = date;
		this.NoteText = txt;
		this.Staff = staff;	
		this.Campaign = campaign;
		}
		else {
			System.out.println("staff is not creative");
		}
	}
	

}
