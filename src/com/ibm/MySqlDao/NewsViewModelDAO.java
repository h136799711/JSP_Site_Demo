/**
 * 
 */
package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.INewsViewModelDAO;
import com.ibm.ViewModel.NewsViewModel;
import com.ibm.util.MySqlUtil;

/**
 * @author admin
 * 
 */
public class NewsViewModelDAO extends BaseDAO implements INewsViewModelDAO {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<NewsViewModel> list = new ArrayList<NewsViewModel>();
		INewsViewModelDAO dao = new NewsViewModelDAO();

		list = dao.selectFromTables();

		for (int i = 0; i < list.size(); i++) {
		//	NewsViewModel nvm = list.get(i);
			// System.out.println((i + 1) + "���ű���: " + nvm.getNewsTitle()
			// + "\n��������:" + nvm.getNewstypeName() + "\n�û���: "
			// + nvm.getUserName());
		}
	}

	private String sql = "";

	public NewsViewModel selectByNewsId(int newsId) {

		conn = MySqlUtil.getConnection();

		sql = "SELECT "
				+ " news.news_id,"
				+ " news.user_id,"
				+ " news.news_title,"
				+ " news.news_content,"
				+ " news.news_pubtime,"
				+ " news.newstype_id,"
				+ " users.user_name,"
				+ " users.user_account,"
				+ " users.user_password,"
				+ " newstype.newstype_name"
				+ " FROM"
				+ " news"
				+ " Inner Join users ON news.user_id = users.user_id "
				+ " Inner Join newstype ON news.newstype_id = newstype.newstype_id "
				+ " where News.newstype_id = Newstype.newstype_id and News.user_id = Users.user_id and News.news_id = ? ";

		NewsViewModel nvm = new NewsViewModel();
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, newsId);
			rs = pst.executeQuery();

			if (rs.next()) {
				nvm.setNewsId(rs.getInt("news_id"));
				nvm.setUserId(rs.getInt("user_id"));
				nvm.setUserName(rs.getString("user_name"));
				nvm.setUserName(rs.getString("user_name"));
				nvm.setUserAccount(rs.getString("user_account"));
				nvm.setNewsTitle(rs.getString("news_title"));
				nvm.setNewsContent(rs.getString("news_content"));
				nvm.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				nvm.setNewstypeId(rs.getInt("newstype_id"));
				nvm.setNewstypeName(rs.getString("newstype_name"));
			} else {
				nvm.setNewsId(Integer.MIN_VALUE);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nvm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.IDao.IBaseDAO#select()
	 */
	@SuppressWarnings("unchecked")
	public List selectFromTables() {

		conn = MySqlUtil.getConnection();

		sql = "SELECT "
				+ " news.news_id,"
				+ " news.user_id,"
				+ " news.news_title,"
				+ " news.news_content,"
				+ " news.news_pubtime,"
				+ " news.newstype_id,"
				+ " users.user_name,"
				+ " users.user_account,"
				+ " newstype.newstype_name"
				+ " FROM"
				+ " news"
				+ " Inner Join users ON news.user_id = users.user_id "
				+ " Inner Join newstype ON news.newstype_id = newstype.newstype_id "
				+ " where News.newstype_id = Newstype.newstype_id and News.user_id = Users.user_id";

		List<NewsViewModel> list = new ArrayList<NewsViewModel>();
		try {
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				NewsViewModel nvm = new NewsViewModel();
				nvm.setNewsId(rs.getInt("news_id"));
				nvm.setUserId(rs.getInt("user_id"));
				nvm.setUserName(rs.getString("user_name"));
				nvm.setUserName(rs.getString("user_name"));
				nvm.setUserAccount(rs.getString("user_account"));
				nvm.setNewsTitle(rs.getString("news_title"));
				nvm.setNewsContent(rs.getString("news_content"));
				nvm.setNewsPubtime(rs.getTimestamp("news_pubtime"));
				nvm.setNewstypeId(rs.getInt("newstype_id"));
				nvm.setNewstypeName(rs.getString("newstype_name"));

				list.add(nvm);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
