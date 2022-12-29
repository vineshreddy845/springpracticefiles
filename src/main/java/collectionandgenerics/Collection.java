package collectionandgenerics;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String args[])
    {
        List list = new ArrayList(); // before generic assigned.

        list.add(1);   // where we can assign any data to List.
        list.add("naney");

     // now we are assignning generics. we use generic for List store particular type of data.
        List<Integer> value = new ArrayList<Integer>();
        value.add(1);
        value.add(2);
        value.add(3);
        for(Integer i: value)
        {
            System.out.println(i);
        }
        // In list we can have duplicate values. we don't want we can use set collection

    }
}
