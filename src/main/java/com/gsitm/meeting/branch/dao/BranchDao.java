package com.gsitm.meeting.branch.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsitm.meeting.branch.dto.Branch;
import com.gsitm.meeting.room.dto.MeetingRoom;

public interface BranchDao {
	

	public List<Branch> branchList();
	
	public void branchDelete(String branchId);
	
	public Branch branchOne(String branchId);
	
	public void branchUpdate(Branch branch);
	
	public void branchCreate(Branch branch);
	
	public String BranchGetRecent();
	
	public List<MeetingRoom> meetingRoomListInBranch(String branchId);

}
	