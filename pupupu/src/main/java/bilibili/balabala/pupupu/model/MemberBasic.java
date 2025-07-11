package bilibili.balabala.pupupu.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class MemberBasic implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String passWord;

    private String userEmail;

    private String idi;
}