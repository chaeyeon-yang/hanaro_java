import data.CustDto;
import service.CustService;

public class CustUpdateTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        // UPDATE
        CustDto updateValue = CustDto.builder().id("id01").pwd("pwd01").build();
        try {
            service.modify(updateValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
