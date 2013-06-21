public class m4 implements Comparator<m2> {

    @Override
    public int compare(m2 o1, m2 o2) {
        if(o1.getR_no() > o2.getR_no()) 
            return -1;
        else 
            return 1;
    }  
}
