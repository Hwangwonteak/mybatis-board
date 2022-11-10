package com.hwt.freeboard01.dao.mapper;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.hwt.freeboard01.dto.FreeBoardDto;
import com.hwt.freeboard01.dto.MemberDto;

public interface IDao {
	//멤버관련 메서드
	public void joinMemberDao(String mid,String mpw,String mname,String memail);
	public int checkIdDao(String mid); 
	public int checkPwDao(String mid,String mpw); 
	public MemberDto memberInfoDao(String mid);
	
	//보드관련 메서드
	public void writeDao(String mid,String mpw,String mname,String memail);
	public ArrayList<FreeBoardDto> listDao();
	
}
