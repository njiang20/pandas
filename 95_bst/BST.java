/*
Fried Chicken :: Nina Jiang, Lea Kwok, Lindsay Phung
APCS pd7
HW95 -- Algorithm as Data Structure
2022-05-10t
time spent:  hrs
*/

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

 public class BST
 {

   //instance variables / attributes of a BST:
   TreeNode _root;

   /**
    * default constructor
    */
   BST()
   {
     _root = null;
   }


   /**
    * void insert( int )
    * Adds a new data element to tree.
    */
   public void insert( int newVal )
   {
     TreeNode newNode = new TreeNode( newVal );

     if ( _root == null ) {
       _root = newNode;
       return;
     }
     insert( _root, newNode );
   }
   //recursive helper for insert(int)
   public void insert( TreeNode stRoot, TreeNode newNode )
   {
     if ( newNode.getValue() < stRoot.getValue() ) {
       //if no left child, make newNode the left child
       if ( stRoot.getLeft() == null )
         stRoot.setLeft( newNode );
       else //recurse down left subtree
         insert( stRoot.getLeft(), newNode );
       return;
     }
     else { // new val >= curr, so look down right subtree
       //if no right child, make newNode the right child
       if ( stRoot.getRight() == null )
         stRoot.setRight( newNode );
       else //recurse down right subtree
         insert( stRoot.getRight(), newNode );
       return;
     }
   }//end insert()




   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

   // each traversal should simply print to standard out
   // the nodes visited, in order

   //process root, recurse left, recurse right
   public void preOrderTrav()
   {
     preOrderTrav( _root );
   }
   public void preOrderTrav( TreeNode currNode )
   {
     if ( currNode == null )
 	    return;
     System.out.print( currNode.getValue() + " " );
     preOrderTrav( currNode.getLeft() );
     preOrderTrav( currNode.getRight() );
   }

   //recurse left, process root, recurse right
   public void inOrderTrav()
   {
     inOrderTrav( _root );
   }
   public void inOrderTrav( TreeNode currNode )
   {
     if ( currNode == null )
       return;
     inOrderTrav( currNode.getLeft() );
     System.out.print( currNode.getValue() + " " );
     inOrderTrav( currNode.getRight() );
   }

   //recurse left, recurse right, process root
   public void postOrderTrav()
   {
     postOrderTrav( _root );
   }
   public void postOrderTrav( TreeNode currNode )
   {
     if ( currNode == null )
       return;
     postOrderTrav( currNode.getLeft() );
     postOrderTrav( currNode.getRight() );
     System.out.print( currNode.getValue() + " "  );
   }

   //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



   //main method for testing
   public static void main( String[] args )
   {
     BST arbol = new BST();

     //PROTIP: sketch state of tree after each insertion
     //        ...BEFORE executing these.
     arbol.insert( 4 );
     arbol.insert( 2 );
     arbol.insert( 5 );
     arbol.insert( 6 );
     arbol.insert( 1 );
     arbol.insert( 3 );

     System.out.println( "\n-----------------------------");
     System.out.println( "pre-order traversal:" );
     arbol.preOrderTrav();

     System.out.println( "\n-----------------------------");
     System.out.println( "in-order traversal:" );
     arbol.inOrderTrav();

     System.out.println( "\n-----------------------------");
     System.out.println( "post-order traversal:" );
     arbol.postOrderTrav();

     System.out.println( "\n-----------------------------");
     /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



     /**
        EXPECTED OUTPUT:
        -----------------------------
        pre-order traversal:
        4 2 1 3 5 6
        -----------------------------
        in-order traversal:
        1 2 3 4 5 6
        -----------------------------
        post-order traversal:
        1 3 2 6 5 4
        -----------------------------
     */
   }

 }//end class
