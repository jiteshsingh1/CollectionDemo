import java.util.HashSet;

public class setDemo {
    public static void main(String[] args) {

        // creat has set first
        HashSet<String> set = new HashSet<String>();

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
        // and data is unordered because of hasing
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

    }

}
