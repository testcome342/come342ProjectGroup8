

package project342;
import project342.Campaign;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public int Id;
	public String CompanyName;
	public String CompanyAddress;
	public String ContactName;
	public List<Campaign> CampaignList;
	
	
	
	
	public Client(int id, String companyName, String companyAddress, String contactName, List<Campaign> cmp)
	{
	      this.CompanyName = companyName;     
	      this.CompanyAddress = companyAddress;
	      this.ContactName = contactName;     
	      this.Id = id;    
	      this.CampaignList = cmp;
	}

	/*public void CreateClient(int Id, String CompanyName, String CompanyAddress, String ContactName) {
		  Client client1 = new Client(1, "Senturkler", "atasehir", "Furkan");
	      ArrayList<Client> client = new ArrayList<Client>();
	      client.add(client1);
	      Client client2 = new Client(2, "Kahramanlar", "Acibadem", "Mesut");
	      client.add(client2); 
	}*/
	
}

