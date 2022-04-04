/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW87-- The English Do Not Wait In Line for Soup
2022-04-04m
time spent: 1.5 hrs
*/

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
