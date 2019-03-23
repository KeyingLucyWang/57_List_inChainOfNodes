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
}