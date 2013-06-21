public class runner {
    public static void main(String args[]) {
        Configuration config = new Configuration().configure();
        SessionFactory sessFact = config.buildSessionFactory();
        Session sess = sessFact.openSession();
        Transaction trans = sess.beginTransaction();
        
        m1 o1 = new m1();
        m2 o2 = new m2();
        m3 o3 = new m3();
        
        TreeMap map = new TreeMap(new m4());
        TreeMap map1 = new TreeMap(new m4());
        
        o1.setS_name("suhail");
        o3.setTotal(100);
        
        
        m1 o4 = new m1();
        m2 o5 = new m2();
        m3 o6 = new m3();
        
        o4.setS_name("Sanika");
        o6.setTotal(200);
        
        map.put(o2, o3);
        map1.put(o5, o6);
        
        o1.setMap(map);
        o4.setMap(map1);
        
        sess.save(o1);
        sess.save(o4);
        sess.save(o2);
        sess.save(o5);
        
        trans.commit();
    }
}
