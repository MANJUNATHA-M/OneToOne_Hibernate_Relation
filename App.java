package com.hibernate.onetoone.OneToOne_Hibernate_Relation;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{


		Student stud=new Student();
//		stud.setSid(1);
//		stud.setSname("HELLO");
//		stud.setSStarting("9:30AM");
//		stud.setSLeaving("4:30PM");
//
		Student stud1=new Student();
//		stud1.setSid(2);
//		stud1.setSname("HI");
//		stud1.setSStarting("9:30AM");
//		stud1.setSLeaving("4:30PM");
//
		Student stud2=new Student();
//		stud2.setSid(3);
//		stud2.setSname("BYE");
//		stud2.setSStarting("9:30AM");
//		stud2.setSLeaving("4:30PM");
//
		ClassRoom room=new ClassRoom();
//		room.setCNumber(101);
//		room.setCBenchNo("2nd");
//		room.setCSection("A");
//
		ClassRoom room1=new ClassRoom();
//		room1.setCNumber(102);
//		room1.setCBenchNo("5th");
//		room1.setCSection("B");
//
		ClassRoom room2=new ClassRoom();
//		room2.setCNumber(103);
//		room2.setCBenchNo("1st");
//		room2.setCSection("A");
//		
//		// to set the values for newly add colomn to build relation
//		
//		stud.setClassRoom(room);
//		stud1.setClassRoom(room1);
//		stud2.setClassRoom(room2);
//		
//		

		Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(ClassRoom.class);
		SessionFactory sf=config.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();

//		ArrayList<Object>lists=new ArrayList<Object>();
//		lists.add(stud);
//		lists.add(room);
//		lists.add(stud1);
//		lists.add(room1);
//		lists.add(stud2);
//		lists.add(room2);

//		for(Object list: lists)
//		{
//			se.save(list);
//			System.out.println(list);
//		}

		
		//fetch 
		
//		stud=(Student)se.get(Student.class, 1);
//		System.out.println(stud);
//		room=(ClassRoom)se.get(ClassRoom.class, 101);
//		System.out.println(room);
//		
//		stud1=(Student)se.get(Student.class, 2);
//		System.out.println(stud1);
//		room1=(ClassRoom)se.get(ClassRoom.class, 102);
//		System.out.println(room1);
//		
//		stud2=(Student)se.get(Student.class, 3);
//		System.out.println(stud2);
//		room2=(ClassRoom)se.get(ClassRoom.class, 103);
//		System.out.println(room2);
		
		// fetch
		
//		room2=(ClassRoom)se.get(ClassRoom.class, 102);
//		System.out.println(room2);
		
		// delete
		
//		se.delete(room2);
//		System.out.println(room2);
		
		
		tr.commit();
		se.close();


	}
}
