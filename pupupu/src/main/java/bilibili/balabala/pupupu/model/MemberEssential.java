package bilibili.balabala.pupupu.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class MemberEssential implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String did;

    private String idid;

    private String identity;

    private String key;

    private String status;
}