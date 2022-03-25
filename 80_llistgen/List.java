/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW80-- Generically Speaking
2022-03-25f
time spent: 1 hr
*/
/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0:
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
 **/

public interface List<Turtle>
{
  //add node to list, containing input Turtle as its data
  public boolean add( Turtle x );

  //insert at specified index
  public void add( int index, Turtle newVal );

  //remove node from list, return its data
  public Turtle remove( int index );

  //return data in element at position i
  public Turtle get( int i );

  //overwrite data in element at position i
  public Turtle set( int i, Turtle x );

  //return length of list
  public int size();

}//end interface
