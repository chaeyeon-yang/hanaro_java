package Customer;

import data.CustDto;
import service.CustService;


public class CustInsertTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        // INSERT
        CustDto obj = CustDto.builder().id("id99").pwd("pwd99").name("james").build();
        try {
            service.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
