package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.INewsDAO;
import com.ibm.model.News;
import com.ibm.util.MySqlUtil;

public class NewsDAO extends BaseDAO implements INewsDAO {

	public static void main(String[] args) {
	//	News news = new News();
	//	INewsDAO dao = new NewsDAO();
//		dao.getCountByTypeId(3);
		
	//	System.out.println(dao.selectAt(-1, 2).size());
	}

	private String sql = "";

	/**
	 * ���һ�����Ŷ���
	 * 
	 * @param Object
	 *            ���Ŷ���
	 * @return boolean
	 */
	@Override
	public boolean add(Object entity) {

		conn = MySqlUtil.getConnection();

		sql = "insert into News (user_id,news_title,news_content,news_pubtime,newstype_id) values(? , ? , ? , ? , ?)";

		News news = (News) entity;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, news.getUserId());
			pst.setString(2, news.getNewsTitle());
			pst.setString(3, news.getNewsContent());
			pst.setTimestamp(4, news.getNewsPubtime());
			pst.setInt(5, news.getNewstypeId());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * ɾ��һ�����Ŷ���
	 * 
	 * @param Object
	 *            ���Ŷ���
	 * @return boolean
	 */
	@Override
	public boolean delete(Object entity) {

		conn = MySqlUtil.getConnection();

		sql = "delete from News where news_id = ? ";

		News news = (News) entity;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, news.getNewsId());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * �����������Ŷ���
	 * 
	 * @return List
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List select() {

		conn = MySqlUtil.getConnection();

		sql = "select * from News ";

		List<News> list = new ArrayList<News>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * �ڱ������ݺ����������в�ѯ��ؼ��ֵ�����
	 * 
	 * @param �ؼ���
	 * @return List<News> ��ϵ����ż���
	 */
	public List<News> selectByKeywords(String keywords) {

		conn = MySqlUtil.getConnection();

		sql = "select * from News where news_content like ?  or news_title like ? ";

		List<News> list = new ArrayList<News>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "%" + keywords + "%");
			pst.setString(2, "%" + keywords + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * �������ID���������б�
	 * 
	 * @param typeId
	 *            ����ID
	 * @return List<News> �����б�
	 */
	public List<News> selectByTypeId(int typeId) {

		conn = MySqlUtil.getConnection();

		sql = "select * from News where newstype_id = ? ";

		List<News> list = new ArrayList<News>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, typeId);
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * ����һ�����Ŷ���
	 * 
	 * @param Object
	 *            ���Ŷ���
	 * @return boolean
	 */
	@Override
	public boolean update(Object entity) {

		conn = MySqlUtil.getConnection();

		sql = "update News set news_title = ? , news_content = ? , news_pubtime = ? ,newstype_id = ? where news_id = ? ";

		News news = (News) entity;

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, news.getNewsTitle());
			pst.setString(2, news.getNewsContent());
			pst.setTimestamp(3, news.getNewsPubtime());
			pst.setInt(4, news.getNewstypeId());
			pst.setInt(5, news.getNewsId());

			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public int getCountByTypeId(int typeId) {
		conn = MySqlUtil.getConnection();

		sql = " select count(*) from News where newstype_id = ? ";

		int cnt = -1;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, typeId);

			rs = pst.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt(1);
			}
			// System.out.println(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	public List<News> select(int number) {

		conn = MySqlUtil.getConnection();

		sql = "select * from News order by news_pubtime desc limit 0,? ";

		List<News> list = new ArrayList<News>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, number);
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<News> select(int number, int typeId) {
		conn = MySqlUtil.getConnection();

		sql = "select * from News where newstype_id = ? order by news_pubtime desc limit 0,?  ";

		List<News> list = new ArrayList<News>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, typeId);
			pst.setInt(2, number);
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<News> selectByKeywords(String keywords, int newstypeId) {
		conn = MySqlUtil.getConnection();

		sql = "select * from News where newstype_id = ? and ( news_content like ?  or news_title like ? ) ";

		List<News> list = new ArrayList<News>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, newstypeId);
			pst.setString(2, "%" + keywords + "%");
			pst.setString(3, "%" + keywords + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	/**
	 * 分页查询之用
	 */
	public List<News> selectAt(int start, int limit) {
		conn = MySqlUtil.getConnection();

		sql = "select * from News order by news_pubtime desc limit ?,?  ";
	
		List<News> list = new ArrayList<News>();
	
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, start);
			pst.setInt(2, limit);
			rs = pst.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNewsId(rs.getInt("news_id"));
				news.setNewsTitle(rs.getString("news_title"));
				news.setNewsContent(rs.getString("news_content"));
				news.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				news.setNewstypeId(rs.getInt("newstype_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
