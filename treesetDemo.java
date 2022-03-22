
import java.util.Iterator;
import java.util.TreeSet;

public class treesetDemo {
    public static void main(String[] args) {

        // creat has set first
        // Treeset is slower than hasset because it take additional time to sort.
        TreeSet<String> set = new TreeSet<String>();

        // now we have to add data of type string in the set
        // here in hasset data is not added in indexing approach
        set.add("delhi");
        set.add("gurgaon");
        set.add("noida");
        set.add("dwarka");
        set.add("noida");
        set.add("agra");
        set.add("ambala");
        set.add("rohtak");

        // data is unique, no duplicacy
        // and data is unordered but it is alphabetically sorted
        System.out.println("set is " + set);

        // we can remove data too
        set.remove("delhi");
        System.out.println("after removing delhi set is" + " " + set);

        // set collections have "contains" method too .
        if (set.contains("noida")) {
            System.out.println("set has noida in it.");
        }

        // we can print size of the set too.
        System.out.println("size of set is" + " " + set.size());

        // we can use itrator method
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

    }

}
