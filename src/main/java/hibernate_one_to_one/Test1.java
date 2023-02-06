package hibernate_one_to_one;

public class Test1 {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory();
//
//        Session session = null;
//
////        try {
////            Session session = factory.getCurrentSession();
////            Employee employee = new Employee("Zai","Tregulov",
////                    "IT", 500);
////            Detail detail = new Detail("Baku","123456789",
////                    "zaurtregulov@gmail.com");
////            employee.setEmpDetail(detail);
////            session.beginTransaction();
////
////            session.save(employee);
////
////            session.getTransaction().commit();
////            System.out.println("Done!");
////
//
//        try {
////            session = factory.getCurrentSession();
////            Employee employee = new Employee("Zaur", "Tregulov", "IT", 500);
////            Detail detail = new Detail("Baku", "12345670", "rutkovski.dp@gmail.com");
////            employee.setEmpDetail(detail);
////            session.beginTransaction();
////
////            session.save(employee);
////
////            session.getTransaction().commit();
////            System.out.println("Done!");
//
////            session = factory.getCurrentSession();
////            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
////            Detail detail = new Detail("Moskov", "12345670", "olegka@gmail.com");
////            employee.setEmpDetail(detail);
////            session.beginTransaction();
////
////            session.save(employee);
////
////            session.getTransaction().commit();
////            System.out.println("Done!");
////
////            session = factory.getCurrentSession();
////            session.beginTransaction();
////            Employee employee = session.get(Employee.class, 2);
////            session.delete(employee);
//
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//        } finally {
//            factory.close();
//            session.close();
//        }
//    }
}
