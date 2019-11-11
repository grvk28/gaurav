package com.gaurav.dao;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gaurav.model.Customer;
import com.gaurav.model.Items;
import com.gaurav.model.R_type;
import com.gaurav.model.Room;
public class R_typedaoImpl implements R_typedao{
	@Autowired
	DataSource datasource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<R_type> gettypes(String type) {
		// TODO Auto-generated method stub
		List<R_type> list;
//		String sql2="select * from items,cart where items.iid=cart.iid and cart.uid='"+uid+"'";
		String sql="select R_type.type,R_type.feat,R_type.price from R_type inner join room on R_type.type=room.type where room.type='"+type+"'";
		list=(List<R_type>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<R_type>(R_type.class));
		return list;
	}
	
	
	public List<R_type> gettypes() {
		// TODO Auto-generated method stub
		List<R_type> list;
//		String sql2="select * from items,cart where items.iid=cart.iid and cart.uid='"+uid+"'";
		String sql="select * from R_type";
		list=(List<R_type>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<R_type>(R_type.class));
		return list;
	}
	
	public List<R_type> admingetitembycat(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	public void deleteItem(String type) {
		// TODO Auto-generated method stub
		
	}
	public void addR_type(int cid, R_type R_type) {
		// TODO Auto-generated method stub
		String sql="insert into R_type set cid=?,type=?,price=?,feat=?,nos=?";
		Object object[]= {cid,R_type.getType(),R_type.getPrice(),R_type.getFeat(),R_type.getNos()};
		jdbcTemplate.update(sql,object);
	}
	public void deleteItem(int cid) {
		// TODO Auto-generated method stub
		
	}
	public List<Items> admingetitembycat(int catid) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<R_type> getitembycat(int catcid) {
		// TODO Auto-generated method stub
		List<R_type> list;
		String sql="select * from R_type where cid= "+catcid+"";
		list=(List<R_type>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<R_type>(R_type.class));
		return list;
	}
	public void saveOrUpdate(Customer Customer,int cid,String username) {
		 String sql = "INSERT INTO Customer(cdate,odate,guests,rooms,cid,username) VALUES (?,?,?,?,?,?)";
		 jdbcTemplate.update(sql,new Object[] {Customer.getCdate(),Customer.getOdate(),Customer.getRooms(),Customer.getGuests(),cid,username});
		}
	public void decrearebyx(int rooms) {
		// TODO Auto-generated method stub
		String sql="update R_type set nos=nos";
		//Object object[]= {rooms.getRno()};
		jdbcTemplate.update(sql);
	}
	public void delete(Room room) {
		// TODO Auto-generated method stub
		String sql="delete ";
		Object object[]= {room.getRno()};
		jdbcTemplate.update(sql,object);
	}
	
	public List<R_type> get_details(int cid,String username) {
		// TODO Auto-generated method stub
		List<R_type>list1;
		String sql1="select max(bid) from Customer where username='"+username+"'";
		Long mx=jdbcTemplate.queryForObject(sql1,Long.class);
		String sql="select cdate,odate,rooms,price from  Customer inner join R_type using (cid)  where cid="+cid+" and username='"+username+"' and bid="+mx+"";
		list1=(List<R_type>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<R_type>(R_type.class));
		return list1;
		
	}
	public List<R_type> get_details1(String UserName) {
		// TODO Auto-generated method stub
		List<R_type>list1;
		String sql=" select Customer.cdate,Customer.odate,Customer.rooms,R_type.price from Customer inner join R_type using (cid)  where username='"+UserName+"'";
		
		list1=(List<R_type>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<R_type>(R_type.class));
		return list1;
		
	}
	public int getTotal(int cid) {
		// TODO Auto-generated method stub
		String sql="select datediff(Customer.odate,Customer.cdate)*Customer.rooms*R_type.price as total from Customer inner join R_type on Customer.cid=R_type.cid order by bid desc limit 1";
		int mx=jdbcTemplate.queryForObject(sql,int.class);
		return mx;
	}
	public List<R_type> getavailable(int cid) {
		// TODO Auto-generated method stub
		List<R_type>list;
		String sql=" select cid,Customer.cdate, R_type.type,R_type.feat,R_type.nos-sum(rooms) as available from Customer inner join R_type using (cid)  where Customer.cid="+cid+" group by Customer.cid,Customer.cdate";
		
		list=(List<R_type>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<R_type>(R_type.class));
		return list;
	}
	
}