package com.laonworks.toyboard.dao;

import org.apache.ibatis.annotations.Mapper;

import com.laonworks.toyboard.model.MemberBean;


@Mapper
public interface MemberDao {

	public int insertmember(MemberBean mb) throws Exception;

	public int emailcheck(String member_email) throws Exception;
}
