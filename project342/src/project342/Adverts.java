package project342;

import java.util.List;

public class Adverts {
	
	public int id;
	public String advertTitle;
	public String targetCompletionDate;
	public int actualAdvertCost;
	public int estimatedAdvertCost;

	
	
	public Adverts( int Id, String adv,String Date, int estCost, int actualCost) {
		this.id=Id;
		this.advertTitle = adv;
		this.targetCompletionDate = Date;
		this.actualAdvertCost = estCost;
		this.estimatedAdvertCost = actualCost;
	
	}

}
