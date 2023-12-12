package preparedstatementService;

import preparedstatementDAO.preparedstatementDAO;

public class preparedstatementService {

	public void insert() throws Exception {
		preparedstatementDAO psd = new preparedstatementDAO();
		psd.insert();

	}

	public void update() throws Exception {
		preparedstatementDAO psd = new preparedstatementDAO();
		psd.update();

	}

	public void delete() throws Exception {
		preparedstatementDAO psd = new preparedstatementDAO();
		psd.delete();

	}

	public void select() throws Exception {
		preparedstatementDAO psd = new preparedstatementDAO();
		psd.select();

	}
}
