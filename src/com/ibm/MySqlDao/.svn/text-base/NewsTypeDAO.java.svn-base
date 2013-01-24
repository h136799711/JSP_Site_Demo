/**
 * 
 */
package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.INewsTypeDAO;
import com.ibm.model.NewsType;
import com.ibm.util.MySqlUtil;

/**
 * @author admin
 * 
 */
public class NewsTypeDAO extends BaseDAO implements INewsTypeDAO {

	public static void main(String[] args) {
		NewsType Ntype = new NewsType();
		INewsTypeDAO dao = new NewsTypeDAO();

		Ntype.setNewstypeName("������Ѷ");
		// dao.add(Ntype);

		// System.out.println("ִ�н�� "+dao.select().size());
		// System.out.println("ִ�н�� "+dao.delete(Ntype));
		System.out.println("ִ�н�� " + dao.add(Ntype));
		// System.out.println("ִ�н�� "+dao.update(Ntype));
	}

	private String sql = "";

	@Override
	public boolean add(Object entity) {

		conn = MySqlUtil.getConnection();
		NewsType Ntype = (NewsType) entity;

		sql = "insert into NewsType ( newstype_name ) values ( ? ) ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, Ntype.getNewstypeName());
			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean delete(Object entity) {

		conn = MySqlUtil.getConnection();
		sql = "delete  from NewsType where newstype_id = ? ";
		NewsType Ntype = (NewsType) entity;

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, Ntype.getNewstypeId());
			return (pst.executeUpdate() != 0);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List select() {

		conn = MySqlUtil.getConnection();
		sql = "select *  from NewsType ";
		List<NewsType> list = new ArrayList<NewsType>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				NewsType Ntype = new NewsType();
				Ntype.setNewstypeId(rs.getInt("newstype_id"));
				Ntype.setNewstypeName(rs.getString("newstype_name"));
				list.add(Ntype);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public NewsType selectById(int newstypeId) {

		conn = MySqlUtil.getConnection();
		sql = "select *  from NewsType where newstype_id = ?";

		NewsType Ntype = new NewsType();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, newstypeId);
			rs = pst.executeQuery();
			if (rs.next()) {
				Ntype.setNewstypeId(rs.getInt("newstype_id"));
				Ntype.setNewstypeName(rs.getString("newstype_name"));
			} else {
				Ntype.setNewstypeId(Integer.MIN_VALUE);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Ntype;

	}

	@Override
	public boolean update(Object entity) {

		conn = MySqlUtil.getConnection();
		sql = "update   NewsType set newstype_name = ?  where newstype_id = ? ";
		NewsType Ntype = (NewsType) entity;

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, Ntype.getNewstypeName());
			pst.setLong(2, Ntype.getNewstypeId());

			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
