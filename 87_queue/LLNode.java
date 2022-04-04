public class LLNode<Turtle>
{
  //instance vars
  private Turtle _value;
  private LLNode<Turtle> _nextNode; //linkage to next node

  // constructor
  public LLNode( Turtle value, LLNode next )
  {
    _value = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public Turtle getCargo()
  {
    return _value;
  }

  public LLNode<Turtle> getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public Turtle setCargo( Turtle newCargo )
  {
    _value = newCargo;
    return _value;
  }

  public LLNode<Turtle> setNext( LLNode<Turtle> newNext )
  {
    _nextNode = newNext;
    return _nextNode;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    String idk = "(";
    idk += _value + " " + _nextNode;
    return idk + ")";
  }


}//end class LLNode
