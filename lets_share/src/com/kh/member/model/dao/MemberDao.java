package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kh.common.code.ErrorCode;
import com.kh.common.exception.DataAccessException;
import com.kh.common.template.JDBCTemplate;
import com.kh.member.model.vo.Member;

public class MemberDao {
	

	
	
	JDBCTemplate jdt = JDBCTemplate.getInstance();
	public MemberDao() {}
	public Member memberAuthenticate(Connection conn, String mbId,String mbpassword) {
		Member member = null;
		
				//쿼리 실행용 객체
				PreparedStatement pstm = null;
				
				//Select쿼리의 결과로 반환된 데이터를 저장하는 객체
				ResultSet rset = null;
		
	
		
		
		try {
			String query = "select * from SH_MEMBER where mb_id =? and mb_password=?";
			
			
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, mbId);
			pstm.setString(2, mbpassword);
			
			
			rset = pstm.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				
				member.setMbId(rset.getString("mb_id"));
				member.setMbPassword(rset.getString("mb_password"));
				member.setMbNick(rset.getString("mb_nick"));
				member.setMbtel(rset.getString("mb_tel"));
				member.setMbemail(rset.getString("mb_email"));
				member.setMblevel(rset.getString("mb_level"));
				member.setMbRegisterDate(rset.getDate("mb_register_Date"));
				
				
			}
		} catch (SQLException e) {
			
			throw new DataAccessException(ErrorCode.SM01,e);	
		}finally {
			jdt.close(rset,pstm);
		}return member;
		
	}
	public Member selectMemberById(Connection conn, String mbId) {
		Member member = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
	try {
		String query = "select * from sh_member where mb_id = ?";
		pstm = conn.prepareStatement(query);
		pstm.setString(1, mbId);
		
		rset = pstm.executeQuery();
		
		if(rset.next()) {
			member = new Member();
			member.setMbId(rset.getString("mb_id"));
			member.setMbPassword(rset.getString("mb_password"));
			member.setMbNick(rset.getString("mb_nick"));
			member.setMbtel(rset.getString("mb_tel"));
			member.setMbemail(rset.getString("mb_email"));
			member.setMbRegisterDate(rset.getDate("mb_registerDate"));
		}
	} catch (SQLException e) {
		throw new DataAccessException(ErrorCode.SM01,e);	
	} finally {
		jdt.close(rset,pstm);
	}
	
	return member;
}
	public Member selectMemberBylevel(Connection conn, String mblevel) {
		Member member = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
	try {
		String query = "select sh_grade.mb_gr_name from sh_member\r\n"
				+ "inner join sh_grade on sh_grade.mb_level = sh_member.mb_level\r\n"
				+ " where sh_grade.mb_gr_name = '일반 회원';";
		pstm = conn.prepareStatement(query);
		pstm.setString(1, mblevel);
		
		rset = pstm.executeQuery();
		
		if(rset.next()) {
			member = new Member();
			member.setMbId(rset.getString("mb_id"));
			member.setMbPassword(rset.getString("mb_password"));
			member.setMbNick(rset.getString("mb_nick"));
			member.setMbtel(rset.getString("mb_tel"));
			member.setMbemail(rset.getString("mb_email"));
			member.setMbRegisterDate(rset.getDate("mb_registerDate"));
		}
	} catch (SQLException e) {
		throw new DataAccessException(ErrorCode.SM01,e);	
	} finally {
		jdt.close(rset,pstm);
	}
	
	return member;
}
	public Member selectMemberBynick(Connection conn, String mbnick) {
		Member member = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
	try {
		String query = "select * from sh_member where mb_nick = ?";
		pstm = conn.prepareStatement(query);
		pstm.setString(1, mbnick);
		
		rset = pstm.executeQuery();
		
		if(rset.next()) {
			member = new Member();
			member.setMbId(rset.getString("mb_id"));
			member.setMbPassword(rset.getString("mb_password"));
			member.setMbNick(rset.getString("mb_nick"));
			member.setMbtel(rset.getString("mb_tel"));
			member.setMbemail(rset.getString("mb_email"));
			member.setMbRegisterDate(rset.getDate("mb_registerDate"));
		}
	} catch (SQLException e) {
		throw new DataAccessException(ErrorCode.SM01,e);	
	} finally {
		jdt.close(rset,pstm);
	}
	
	return member;
}
	
public ArrayList<Member> selectMemberList(Connection conn){
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			String query = "select * from sh_member";
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Member member = new Member();
				member.setMbId(rset.getString("mb_id"));
				member.setMbPassword(rset.getString("mb_password"));
				member.setMbNick(rset.getString("mb_nick"));
				member.setMbtel(rset.getString("mb_tel"));
				member.setMbemail(rset.getString("mb_email"));
				member.setMbpoint(rset.getInt("mb_point"));
				member.setMblevel(rset.getString("mb_level"));
				member.setMbRegisterDate(rset.getDate("mb_register_date"));
				member.setMbLeaveDate(rset.getDate("mb_leave_date"));
			
				memberList.add(member);
			}
			
		} catch (SQLException e) {
			throw new DataAccessException(ErrorCode.SM01,e);	
		}finally {
			jdt.close(rset,pstm);
		}
		
		return memberList;
	}
public int insertMember(Connection conn, Member member){
	
	int res = 0;
	PreparedStatement pstm = null;
	
	try {
		String query = "INSERT INTO SH_MEMBER(MB_ID, MB_PASSWORD,MB_NICK, MB_EMAIL, MB_TEL) "
				+"values(?,?,?,?,?)";
		pstm = conn.prepareStatement(query);
		pstm.setString(1, member.getMbId());
		pstm.setString(2,member.getMbPassword());
		pstm.setString(3, member.getMbNick());
		pstm.setString(4, member.getMbemail());
		pstm.setString(5, member.getMbtel());
		
		res = pstm.executeUpdate();
	} catch (SQLException e) {
		throw new DataAccessException(ErrorCode.IM01,e);
	}finally {
		jdt.close(pstm);
	}
	
	return res;
}
public int updateMember(Connection conn, Member member){
	int res = 0;
	PreparedStatement pstm = null;
	
	try {
		String query = "update sh_member set mb_password = ? where mb_id = ?";
		pstm = conn.prepareStatement(query);
		pstm.setString(1, member.getMbPassword());
		pstm.setString(2, member.getMbId());
		res = pstm.executeUpdate();
	} catch (SQLException e) {
		throw new DataAccessException( ErrorCode.UM01,e);
	}finally {
		jdt.close(pstm);
	}
	
	return res;
}

public int deleteMember(Connection conn, String mbId){
	int res = 0;
	PreparedStatement pstm = null;
	
	try {
		String query = "delete from sh_member where mb_id = ?";
		pstm = conn.prepareStatement(query);
		pstm.setString(1, mbId);
		res = pstm.executeUpdate();
	} catch (SQLException e) {
		throw new DataAccessException(ErrorCode.DM01,e);
	}finally {
		jdt.close(pstm);
	}
	
	return res;
}
public List<Member> selectMemberByRegdate(Connection conn, Date begin, Date end){
	
	List<Member> memberList = new ArrayList<>();
	PreparedStatement pstm = null;
	ResultSet rset = null;
	
	try {
		String query = "select * from sh_member where mb_register_date between ? and ?";
		pstm = conn.prepareStatement(query);
		pstm.setDate(1, begin);
		pstm.setDate(2, end);
		rset = pstm.executeQuery();
		
		while(rset.next()) {
			Member member = new Member();
			member.setMbId(rset.getString("mb_id"));
			member.setMbPassword(rset.getString("mb_password"));
			member.setMbNick(rset.getString("mb_nick"));
			member.setMbtel(rset.getString("mb_tel"));
			member.setMbemail(rset.getString("mb_email"));
			member.setMbLeaveDate(rset.getDate("mb_leave_date"));
			memberList.add(member);
		}
	} catch (SQLException e){
		throw new DataAccessException(ErrorCode.SM01,e);
	} finally {
		jdt.close(rset, pstm);
	}
	
	return memberList;
}
}