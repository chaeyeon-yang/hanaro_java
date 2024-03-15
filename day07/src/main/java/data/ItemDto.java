package data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {
    private int id;
    private String name;
    private long price;
    // 등록 일시
    private Date regdate;
    // 수정 일시
    private Date updatedate;
}
