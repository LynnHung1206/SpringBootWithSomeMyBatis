package tw.idv.lynn.core.dao;

import java.util.List;

import org.hibernate.Session;


public interface CoreDao<P, I> {
	int insert(P pojo);

	int deleteById(I id);

	int update(P pojo);

	P selectById(I id);

	List<P> selectAll();

//	在DAO的共同父介面先寫,後代都可以呼叫,可以不用一直寫一樣的東西
//	default Session getSession() {
//		return HibernateUtil.getSessionFactory().getCurrentSession();
////		return HibernateUtil.getSessionFactory().openSession();
//	}
}
