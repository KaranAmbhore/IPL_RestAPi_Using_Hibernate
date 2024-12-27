package com.ipl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.ipl.entities.Team;

@Repository
public class TeamDao {

//	@Autowired
//	private Configuration configuration;
//	private SessionFactory factory;
//	private Session session;
//	private Transaction transaction;

	public String addTeam(Team team) {
//
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Team.class);
//		SessionFactory factory = configuration.buildSessionFactory();
//		Session session = factory.openSession();
//		
//		Transaction tr = session.beginTransaction();
////		Team team = new Team(2, "MI", "Mumbai", "Mahela Jayawardene");
//		
//		session.save(team);
//		tr.commit();
//		
		return "Player Added successfully...";
	}

}
