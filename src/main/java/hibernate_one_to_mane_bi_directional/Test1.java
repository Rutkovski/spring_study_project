package hibernate_one_to_mane_bi_directional;

import hibernate_one_to_mane_bi_directional.entity.Department;
import hibernate_one_to_mane_bi_directional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("Sales",
//                    800,1500);
//            Employee employee = new Employee("Zaur", "Tregulov", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1500);
//            Employee employee3 = new Employee("Anton", "Sidorov", 1200);
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            System.out.println(department.getEmps());
//
//
//            session.beginTransaction();
//            session.save(department);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//*********************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class,7);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("подгрузим наших работников");
            department.getEmps().get(0);


            session.getTransaction().commit();

            System.out.println("Show employees from department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
////*********************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//*********************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,4);
//
//
//            session.delete(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");


        } finally {
            factory.close();
            session.close();
        }
    }
}
