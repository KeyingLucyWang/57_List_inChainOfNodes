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
		if ( numOfNodesBefore == 0) 
			return addAsHead( val);
      	else { 
		Node newNode = new Node( val);
        Node target = getNode( numOfNodesBefore);
	    Node temp = getNode( numOfNodesBefore - 1);
        
		temp.setReferenceToNextNode( newNode);
        newNode.setReferenceToNextNode( target);
		return true;
		}
	}

	 public Node getNode( int numOfNodesBefore){
      int counter = 0;
		for(Node test = headReference; test != null; test = test.getReferenceToNextNode()){
		        if (counter++ == numOfNodesBefore)
					return test;
		}
		return null;
	}

     public Object get( int numOfNodesBefore){
      return getNode( numOfNodesBefore).getCargoReference();
  }

    public Object set( int numOfNodesBefore, Object newCargoReference){
      	Object saveForReturn = null;
		Node target = getNode( numOfNodesBefore);
        
		saveForReturn = target.getCargoReference();
        target.setCargoReference( newCargoReference);
        return saveForReturn;
	}

    public boolean remove( int numOfNodesBefore){
      Node target = getNode( numOfNodesBefore - 1);
         target.setReferenceToNextNode( (target.getReferenceToNextNode()).getReferenceToNextNode());
    	return true;
  }
}
