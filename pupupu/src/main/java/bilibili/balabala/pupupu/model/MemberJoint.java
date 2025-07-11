package bilibili.balabala.pupupu.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class MemberJoint implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String idi;

    private String did;
}