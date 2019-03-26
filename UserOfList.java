/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            // /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               // for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
//*ERROR*
  // System.out.println( "added d at index 3: " + list.add( 3, "d") + ". "
  //                     + "Now: " + list);

	System.out.println( "get list element of index 0: " + list.get( 0));
  System.out.println( "get list element of index 2: " + list.get( 2));
  System.out.println( "get list element of index 3: " + list.get( 3));

  System.out.println( "modified element of index 2 from " + list.set( 2, "g") + " to g");

  System.out.println( "remove list element of index 3: " + list.remove( 3) + ". "
                      + "Now: " + list);
    }
}
