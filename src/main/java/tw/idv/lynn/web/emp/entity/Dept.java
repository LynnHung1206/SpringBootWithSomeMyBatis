package tw.idv.lynn.web.emp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tw.idv.lynn.core.pojo.Core;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dept extends Core {
	
	@PersistenceContext
	Session session;

	private static final long serialVersionUID = 1L;
	@Id
	private Integer deptno;
	private String dname;
	private String loc;
	@OneToMany(mappedBy = "dept")
	private List<Emp> emps;
	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

//	public static void main(String[] args) {
//		Emp emp = session.get(Emp.class, 7369);
//		System.out.println(emp.getDept().getDname());
//		System.out.println("===================");
//		Dept dept = emp.getDept();
//		System.out.println(dept.getDname());
//		System.out.println("===================");
//		for(Emp e : dept.getEmps()) {
//			System.out.println(e.getEname());
//		}
//	}
}
