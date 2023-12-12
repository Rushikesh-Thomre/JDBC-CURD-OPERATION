package preparedstatementController;

import preparedstatementService.preparedstatementService;

public class preparedstatementController {

	public void insert() throws Exception {
		preparedstatementService pss = new preparedstatementService();
		pss.insert();
	}

	public void update() throws Exception {
		preparedstatementService pss = new preparedstatementService();
		pss.update();
	}

	public void delete() throws Exception {
		preparedstatementService pss = new preparedstatementService();
		pss.delete();
	}

	public void select() throws Exception {
		preparedstatementService pss = new preparedstatementService();
		pss.select();
	}
	
	public static void main(String[] args) throws Exception {
		preparedstatementController psc= new preparedstatementController();
		
//		psc.insert();
//		psc.update();
//		psc.select();
//		psc.delete();
		
		
	}
}
