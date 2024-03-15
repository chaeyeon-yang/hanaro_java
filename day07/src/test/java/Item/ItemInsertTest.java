package Item;

import data.ItemDto;
import service.ItemService;

public class ItemInsertTest {
    public static void main(String[] args) {
        ItemService service = new ItemService();
        // INSERT
        ItemDto obj = ItemDto.builder().name("snack").price(1000).build();
        try {
            service.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
