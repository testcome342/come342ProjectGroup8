package project342;
import java.util.ArrayList;

import project342.Campaign;
import project342.Client;
public class test {

	
	public static void main(String []args) 
	
	{
		  
		  
		  StaffMember staff1 = new StaffMember(true, 1, 123, "Ahmet","Kemal","Ocak","ahmet@ahmet.com");
		  StaffMember staff2 = new StaffMember(false, 2, 1234, "Mehmet","Sinan", "Mart", "Mehmet@Mehmet.com");
		  StaffMember staff3 = new StaffMember(true, 3, 1235, "Cahit","Mert", "Mart", "cahit@cahit.com");
		  StaffMember staff4 = new StaffMember(false, 4, 123456, "Ayþe","Keskin", "Kasým", "ayse@ayse.com");
		  StaffMember staff5 = new StaffMember(false, 5, 1234567, "Fatma","Hürkuþ", "Eylül", "fatma@fatma.com");
		  
		  ArrayList<StaffMember> staffmemberlist1 = new ArrayList<StaffMember>();
		  staffmemberlist1.add(staff1);
		  staffmemberlist1.add(staff2);
		  
		  ArrayList<StaffMember> staffmemberlist2 = new ArrayList<StaffMember>();
		  staffmemberlist2.add(staff3);
		  staffmemberlist2.add(staff4);
		  staffmemberlist2.add(staff5);
		
		  Campaign campaign1=new Campaign(3, "Bilgisayar", "Mayýs", "Haziran", 1500,staffmemberlist1);
		  Campaign campaign2=new Campaign(4, "Telefon", "Nisan", "Temmuz", 1300,staffmemberlist2);
		  
	      ArrayList<Campaign> campaignlist1 = new ArrayList<Campaign>();
		  campaignlist1.add(campaign1);
		  
		  ArrayList<Campaign> campaignlist2 = new ArrayList<Campaign>();
	      campaignlist2.add(campaign2);
		  
	      Client client1 = new Client(1, "Senturkler", "atasehir", "Furkan",campaignlist1);
		  Client client2 = new Client(2, "Kahramanlar", "Acibadem", "Mesut",campaignlist2);
	      ArrayList<Client> client = new ArrayList<Client>();
	      client.add(client1);
	      client.add(client2); 
	      
	      
	      CreatingConceptNote makale = new CreatingConceptNote(1, "note1", "27.10.2018", "örnek notjasdjkasjdkasjdkla",staff2 , campaign1);
	      

	}
}
