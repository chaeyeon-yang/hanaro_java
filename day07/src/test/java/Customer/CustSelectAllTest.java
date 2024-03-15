package Customer;

import data.CustDto;
import service.CustService;

public class CustSelectAllTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        // SELECT ALL
        try {
            service.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
