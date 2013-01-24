package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.INoticeDAO;
import com.ibm.model.Notice;
import com.ibm.util.MySqlUtil;
import com.ibm.util.TimeParser;

public class NoticeDAO extends BaseDAO implements INoticeDAO {

	public static void main(String[] args) {

		Notice notice = new Notice();
	//	INoticeDAO dao = new NoticeDAO();

		notice.setNoId(7);
		notice.setUserId(123);
		notice.setNoPubtime(TimeParser.getNow());

	}

	private String sql = "";

	@Override
	public boolean add(Object entity) {

		conn = MySqlUtil.getConnection();
		Notice notice = (Notice) entity;

		try {
			sql = "insert into Notice(user_id, no_title, no_content, no_pubtime) values(?,?,?,?) ";
			pst = conn.prepareStatement(sql);

			pst.setLong(1, notice.getUserId());
			pst.setString(2, notice.getNoTitle());
			pst.setString(3, notice.getNoContent());
			pst.setTimestamp(4, notice.getNoPubtime());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean delete(Object entity) {

		conn = MySqlUtil.getConnection();
		sql = "delete  from Notice where no_id = ? ";
		Notice notice = (Notice) entity;

		try {
			pst = conn.prepareStatement(sql);
			pst.setLong(1, notice.getNoId());
			return (pst.executeUpdate() != 0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List select() {

		conn = MySqlUtil.getConnection();
		sql = "select *  from Notice order by no_pubtime desc";
		List<Notice> list = new ArrayList<Notice>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Notice notice = new Notice();
				notice.setNoId(rs.getInt("no_id"));
				notice.setUserId(rs.getInt("user_id"));
				notice.setNoTitle(rs.getString("no_title"));
				notice.setNoContent(rs.getString("no_content"));
				notice.setNoPubtime(rs.getTimestamp("no_pubtime"));
				list.add(notice);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

	public Notice selectById(int noId) {

		conn = MySqlUtil.getConnection();
		sql = "select * from Notice where no_id = ? ";
		Notice notice = new Notice();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, noId);

			rs = pst.executeQuery();

			if (rs.next()) {
				notice.setNoId(rs.getInt("no_id"));
				notice.setNoTitle(rs.getString("no_title"));
				notice.setNoContent(rs.getString("no_content"));
				notice.setNoPubtime(rs.getTimestamp("no_pubtime"));
				notice.setUserId(rs.getInt("user_id"));
			} else {
				notice.setNoId(Integer.MIN_VALUE);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return notice;
	}

	@Override
	public boolean update(Object entity) {

		conn = MySqlUtil.getConnection();
		sql = "update   Notice set no_title = ? , no_content = ? where no_id = ? ";
		Notice notice = (Notice) entity;

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, notice.getNoTitle());
			pst.setString(2, notice.getNoContent());
			pst.setInt(3, notice.getNoId());
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	public List selectTop(int number) {

		conn = MySqlUtil.getConnection();
		sql = "select *  from Notice order by no_pubtime desc limit 0,? ";
		List<Notice> list = new ArrayList<Notice>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, number);
			rs = pst.executeQuery();
			while (rs.next()) {
				Notice notice = new Notice();
				notice.setNoId(rs.getInt("no_id"));
				notice.setUserId(rs.getInt("user_id"));
				notice.setNoTitle(rs.getString("no_title"));
				notice.setNoContent(rs.getString("no_content"));
				notice.setNoPubtime(rs.getTimestamp("no_pubtime"));
				list.add(notice);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

}
