package project342;

import java.util.List;

public class StaffMember {
	public int Id;
	public int staffNo;
	public String staffName;
	public String staffSurname;
	public String staffStartDate;
	public String staffEmailAddress;
	public boolean AdminOrNot;
	

	
	
	
	
	public StaffMember(boolean admin,int id, int staffno, String staffname,String staffsurname, String staffstartdate, String staffemailaddress)
	{
	      this.staffNo = staffno;     
	      this.staffName = staffname;
	      this.staffSurname = staffsurname;
	      this.staffStartDate = staffstartdate;     
	      this.staffEmailAddress = staffemailaddress;    
	      this.Id = id;    
	      this.AdminOrNot = admin;
	      
	      
	}

}
