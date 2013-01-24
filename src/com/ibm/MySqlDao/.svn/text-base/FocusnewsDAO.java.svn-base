package com.ibm.MySqlDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.IDao.IFocusnewsDAO;
import com.ibm.model.Focusnews;
import com.ibm.util.MySqlUtil;

public class FocusnewsDAO extends BaseDAO implements IFocusnewsDAO {

	public static void main(String[] args) {
		// Focusnews news = new Focusnews();
		IFocusnewsDAO dao = new FocusnewsDAO();
		// ��Ӳ�������
		// news.setFocusContent("���ǽ�����������");
		// news.setFocusTitle("�������ű���");
		// news.setFocusPubtime(TimeParser.getNow());
		// news.setUserId(123);
		// System.out.println("ִ�н�� "+dao.add(news));
		//		
		// ���²�������
		// news.setFocusContent("���ǽ�����������");
		// news.setFocusTitle("�������ű���(���ǸĹ��)");
		// news.setFocusPubtime(TimeParser.getNow());
		// news.setUserId(123);

		// System.out.println("ִ�н�� "+dao.update(news));

		// ɾ���������
		// news.setFocusId(1);
		// System.out.println("ִ�н�� "+dao.delete(news));

		// ��ѯ��������
		// List<Focusnews> list = dao.select();
		// int i=1;
		// for (Focusnews news : list){
		// System.out.println(i+"\n"+"�������� ��"+news.getFocusPubtime()+"���� ��"+news.getFocusTitle());
		// i++;
		// }
		// ��ݹؼ��ֲ�ѯ��������
		// String keywords = "��������";
		// List<Focusnews> list = dao.selectByKeywords(keywords);
		// int i=1;
		// for (Focusnews news : list){
		// System.out.println(i+"\n"+"���� ��"+news.getFocusTitle()+"\n ��������IDֵ��"+news.getFocusId());
		// i++;
		// }
		// ��ѯǰ10��������
		String keywords = "��������";
		List<Focusnews> list = dao.selectByKeywords(keywords);
		int i = 1;
		for (Focusnews news : list) {
			System.out.println(i + "\n" + "���� ��" + news.getFocusTitle()
					+ "\n ��������IDֵ��" + news.getFocusId());
			i++;
		}
		Focusnews test = dao.selectById(-1);

		System.out.println(test.getFocusId());
	}

	private String sql = "";

	/**
	 * ���һ����������
	 * 
	 * @param entity
	 */
	@Override
	public boolean add(Object entity) {

		conn = MySqlUtil.getConnection();

		sql = "insert into FocusNews (user_id,focus_title,focus_content,focus_pubtime) values(? , ? , ? , ?)";

		Focusnews news = (Focusnews) entity;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, news.getUserId());
			pst.setString(2, news.getFocusTitle());
			pst.setString(3, news.getFocusContent());
			pst.setTimestamp(4, news.getFocusPubtime());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * ɾ��һ���������Ÿ�ݴ�������IDֵ
	 */
	@Override
	public boolean delete(Object entity) {

		conn = MySqlUtil.getConnection();

		sql = "delete from FocusNews where focus_id = ? ";

		Focusnews news = (Focusnews) entity;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, news.getFocusId());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * ѡ�����еĽ�������
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List select() {

		conn = MySqlUtil.getConnection();

		sql = "select * from FocusNews ";

		List<Focusnews> list = new ArrayList<Focusnews>();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Focusnews news = new Focusnews();
				news.setFocusId(rs.getInt("focus_id"));
				news.setUserId(rs.getInt("user_id"));
				news.setFocusTitle(rs.getString("focus_title"));
				news.setFocusContent(rs.getString("focus_content"));
				news.setFocusPubtime(rs.getTimestamp("focus_pubtime"));
				list.add(news);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * ���IDѡ��һ����������
	 */
	public Focusnews selectById(int id) {
		conn = MySqlUtil.getConnection();

		sql = "select * from FocusNews where focus_id = ?";

		Focusnews news = new Focusnews();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				news.setFocusId(rs.getInt("focus_id"));
				news.setUserId(rs.getInt("user_id"));
				news.setFocusTitle(rs.getString("focus_title"));
				news.setFocusContent(rs.getString("focus_content"));
				news.setFocusPubtime(rs.getTimestamp("focus_pubtime"));
			} else {
				news.setFocusId(Integer.MIN_VALUE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return news;
	}

	/**
	 * �ڱ������ݺ����������в�ѯ��ؼ��ֵ�����
	 * 
	 * @param �ؼ���
	 * @return List<Focusnews> ��ϵ����ż���
	 */
	public List<Focusnews> selectByKeywords(String keywords) {

		conn = MySqlUtil.getConnection();

		sql = "select * from FocusNews where focus_content like ?  or focus_title like ? ";

		List<Focusnews> list = new ArrayList<Focusnews>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "%" + keywords + "%");
			pst.setString(2, "%" + keywords + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				Focusnews news = new Focusnews();
				news.setFocusId(rs.getInt("focus_id"));
				news.setFocusTitle(rs.getString("focus_title"));
				news.setFocusContent(rs.getString("focus_content"));
				news.setFocusPubtime(rs.getTimestamp("focus_pubtime"));
				news.setUserId(rs.getInt("user_id"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * ��ʱ��ݼ�˳��ѡ��ǰ������¼
	 * 
	 * @param number
	 *            ָʾ����
	 */
	public List<Focusnews> selectTop(int number) {

		conn = MySqlUtil.getConnection();

		sql = "select * from FocusNews order by focus_pubtime desc limit 0,?";

		List<Focusnews> list = new ArrayList<Focusnews>();
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, number);
			rs = pst.executeQuery();

			while (rs.next()) {
				Focusnews news = new Focusnews();
				news.setFocusId(rs.getInt("focus_id"));
				news.setFocusContent(rs.getString("focus_content"));
				news.setFocusPubtime(rs.getTimestamp("focus_pubtime"));
				news.setFocusTitle(rs.getString("focus_title"));

				list.add(news);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * ����һ������������Ϣ
	 * 
	 * @param Focusnews
	 * @return boolean �����Ƿ�ɹ�
	 */
	@Override
	public boolean update(Object entity) {

		conn = MySqlUtil.getConnection();

		sql = "update FocusNews set focus_title = ? , focus_content = ? where focus_id = ? ";

		Focusnews news = (Focusnews) entity;

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, news.getFocusTitle());
			pst.setString(2, news.getFocusContent());
			pst.setInt(3, news.getFocusId());

			return (pst.executeUpdate() != 0);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
