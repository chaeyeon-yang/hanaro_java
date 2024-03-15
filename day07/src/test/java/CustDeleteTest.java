import data.CustDto;
import service.CustService;

public class CustDeleteTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        // DELETE
        String gotoDelete = "id99";
        try {
            service.remove(gotoDelete);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
