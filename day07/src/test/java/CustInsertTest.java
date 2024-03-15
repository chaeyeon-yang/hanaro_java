import data.CustDto;
import service.CustService;


public class CustInsertTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id99").pwd("pwd99").name("james").build();
        try {
            service.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hello");
    }
}
