package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.People;

public class Program {

	public static void main(String[] args) {
	
		People p1 = new People(null, "1Nac Red", "nacRR@nac.com");
		People p2 = new People(null, "2Nac Brown", "nacBB@nac.com");
		People p3 = new People(null, "3Nac Green", "nacGG@nac.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Done!");
		
		em.close();
		emf.close();
	}

}
