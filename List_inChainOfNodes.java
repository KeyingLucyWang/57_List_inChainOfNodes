/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

   
    /**
      Construct an empty list
     */
    public List_inChainOfNodes(){
      headReference = null;
    }

    /**
      @return the number of elements in this list
     */
    public int size() {
      int counter = 0;
      for( Node testNode = headReference; testNode != null; testNode = testNode.getReferenceToNextNode()){
        counter++;
      }
      return counter;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
      String result = "[";
      for (Node testNode = headReference; testNode != null; testNode = testNode.getReferenceToNextNode()){
        result += testNode.getCargoReference() + ",";
      }
      return this.size() + " elements " + result + "]";
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        Node newNode = new Node( val);
        newNode.setReferenceToNextNode( headReference);
        headReference = newNode;
        return true;
     }

     public boolean add (int numOfNodesBefore, Object val) {
       int counter = 0;
       Node newNode = new Node( val);
       Node temp = null;
        for(Node test = headReference; test != null; test = test.getReferenceToNextNode()){
          if (counter++ == numOfNodesBefore)
              temp = test.getReferenceToNextNode();
              test.setReferenceToNextNode( newNode);
              newNode.setReferenceToNextNode( temp);
        }
        return true;
     }

     public Object get( int numOfNodesBefore){
      int counter = 0;
		    for(Node test = headReference; test != null; test = test.getReferenceToNextNode()){
		        if (counter++ == numOfNodesBefore)
		            return test.getCargoReference();
		    }	    
		return null;
  }

    public Object set( int numOfNodesBefore, Object newCargoReference){
      int counter = 0;
      Object saveForReturn = null;
      for(Node test = headReference; test != null; test = test.getReferenceToNextNode()){
            if (counter++ == numOfNodesBefore){
              saveForReturn = test.getCargoReference();
              test.setCargoReference( newCargoReference);
              return saveForReturn;}
        }  
        return null;   
	}

    public boolean remove( int numOfNodesBefore){
      int counter = 0;
      for(Node test = headReference; test != null; test = test.getReferenceToNextNode()){
        if ( counter++ == numOfNodesBefore - 1)
          test.setReferenceToNextNode( (test.getReferenceToNextNode()).getReferenceToNextNode());
    }
    return true;
  }
}
