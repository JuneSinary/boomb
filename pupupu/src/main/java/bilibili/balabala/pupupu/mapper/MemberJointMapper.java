package bilibili.balabala.pupupu.mapper;

import bilibili.balabala.pupupu.model.MemberJoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberJointMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberJoint record);

    int insertSelective(MemberJoint record);

    MemberJoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberJoint record);

    int updateByPrimaryKey(MemberJoint record);
}