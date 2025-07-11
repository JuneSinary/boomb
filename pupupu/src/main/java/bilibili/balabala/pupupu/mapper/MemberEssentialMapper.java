package bilibili.balabala.pupupu.mapper;

import bilibili.balabala.pupupu.model.MemberEssential;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberEssentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberEssential record);

    int insertSelective(MemberEssential record);

    MemberEssential selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberEssential record);

    int updateByPrimaryKey(MemberEssential record);
}