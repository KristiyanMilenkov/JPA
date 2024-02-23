package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("general");
        //The name of the persistence unit is the name of the persistence unit in the persistence.xml file.
        //<persistence-unit name="general">

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

//        Create a new Teacher
//        Teacher teacher = new Teacher();
//        teacher.setName("Boris");
//        entityManager.persist(teacher);

        //Find teacher by id
        //Teacher fromDB = entityManager.find(Teacher.class, 1);
        //System.out.println(fromDB);

        //Remove teacher

        //Teacher fromDB = entityManager.find(Teacher.class, 1);
        //entityManager.remove(fromDB);
        entityManager.getTransaction().commit();



    }
}