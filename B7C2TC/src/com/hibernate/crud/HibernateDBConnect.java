package com.hibernate.crud;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateDBConnect {
	private static SessionFactory objSF;

	public static SessionFactory getSessionFactory() {
		if (objSF == null) {

			try {
				Configuration objcfg = new Configuration();
				Properties objprop = new Properties();
				objprop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				objprop.put(Environment.URL, "jdbc:mysql://localhost:3306/b7_hibernate1");
				objprop.put(Environment.USER, "root");
				objprop.put(Environment.PASS, "nikhilgowda");
				objprop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				objprop.put(Environment.SHOW_SQL, "true");
				objprop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				objprop.put(Environment.HBM2DDL_AUTO, "update");

				objcfg.setProperties(objprop);
				objcfg.addAnnotatedClass(Users.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(objcfg.getProperties()).build();
				System.out.println("Hibernate java configuration service regirsty created");
				objSF = objcfg.buildSessionFactory(serviceRegistry);

			} catch (HibernateException e) {
				System.out.println(e);
			}
		}
		return objSF;

	}

}