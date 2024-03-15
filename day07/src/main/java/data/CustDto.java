package data;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter setter toString의 역할을 해줌
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String  pwd;
    private String name;


}
