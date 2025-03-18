package stephanware.basic;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;

public class MultiDataTypeArray {

    public static void main(String[] args)
    {
        MultiDataTypeArray obj1 = new MultiDataTypeArray();
        obj1.MixedDataTypeArray_usingObject();
        obj1.MixedDataTypeArray_usingArrayList();
    }

    public void MixedDataTypeArray_usingObject()
    {
        Object[] mixedArray = new Object[5];

        // Add elements of different data type :
        mixedArray[0] = "hello, world"; //String
        mixedArray[1] = 98;       //Integer
        mixedArray[2] = 3.4321;  //double
        mixedArray[3] = true;   // boolean
        mixedArray[4] = 'A';     // char(character)

        for (Object element : mixedArray) {
            System.out.println("Element using Object[] : " + element);
        }
    }

    public void MixedDataTypeArray_usingArrayList()
    {
        ArrayList<Object> mixedList = new ArrayList<>();

        //Add elements of different data-types
        mixedList.add("Hello");
        mixedList.add(42);
        mixedList.add(3.14);
        mixedList.add(true);
        mixedList.add('A');

        // Print the mixed list of elements

        for(Object element : mixedList)
        {
            System.out.println("Element using ArrayList<Object> : " + element);
        }
    }


}
