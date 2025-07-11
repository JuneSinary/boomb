package bilibili.balabala.pupupu.mapper;

import bilibili.balabala.pupupu.model.MemberBasic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberBasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberBasic record);

    int insertSelective(MemberBasic record);

    MemberBasic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberBasic record);

    int updateByPrimaryKey(MemberBasic record);
}