package Customer;

import service.CustService;

public class CustSelectTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        String gotoGetInfo = "id02";
        // SELECT
        try {
            service.get(gotoGetInfo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
