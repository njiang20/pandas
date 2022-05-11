/*
Fried Chicken :: Nina Jiang, Lea Kwok, Lindsay Phung
APCS pd7
HW96 -- BSTs is the Perfect Place for Shade / adding the methods for searching,
        height, and leaves
2022-05-11w
time spent: 1 hrs
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


  /*****************************************************
  * TreeNode search(int)
  * returns pointer to node containing target,
  * or null if target not found
  *****************************************************/

  TreeNode search( int target )
  {
    if (_root.getValue() == target) {
      return _root;
    } else if (_root.getLeft() != null) {
      _root = _root.getLeft();
      search(target);
    } else if (_root.getRight() != null) {
      _root = _root.getRight();
      search(target);
    }
    return null; //when target isn't found
  }

  TreeNode search(TreeNode root, int target) {
    if (root == null) {
      return null;
    } else if (root.getValue() == target) {
      return root;
    } else if (root.getLeft() != null) {
      root = root.getLeft();
      return search(root, target);
    } else if (root.getRight() != null) {
      root = root.getRight();
      return search(root, target);
    }
    return null; //when target isn't found
  }


  /*****************************************************
  * int height()
  * returns height of this tree (length of longest leaf-to-root path)
  * eg: a 1-node tree has height 1
  *****************************************************/
  public int height() {
    return height(_root);
  }

  public int height(TreeNode root)
  {
    if (root == null) {
      return 0;
    } else {
      if (_root.getLeft() != null) {
        return height(root.getLeft()) + 1;
      } else {
        return height(root.getRight()) + 1;
      }
    }
    //we checked for no nodes and our else if loop is meant for nodes > 1
  }


  /*****************************************************
  * int numLeaves()
  * returns number of leaves in tree
  *****************************************************/
  public int numLeaves() {
    return numLeaves(_root);
  }

  public int numLeaves(TreeNode root)
  {
    if (root == null) {
      return 0;
    } else if (root.getLeft() == null && root.getRight() == null) {
      return 1;
    } else if (root.getLeft() != null && root.getRight() == null) {
      return numLeaves(root.getLeft());
    } else if (root.getLeft() == null && root.getRight() != null) {
      return numLeaves(root.getRight());
    } else {
      return numLeaves(root.getLeft()) + numLeaves(root.getRight());
    }
    // } else if (root.getLeft() == null) {
    //   return numLeaves(_root.getRight()) + 1;
    // } else {
    //   return numLeaves(_root.getLeft()) + 1;
    // }
  }



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
    System.out.println("searching for 2: ");
    System.out.println(arbol.search(2));

    System.out.println( "\n-----------------------------");
    System.out.println("height: ");
    System.out.println(arbol.height());

    System.out.println( "\n-----------------------------");
    System.out.println("number of leaves: ");
    System.out.println(arbol.numLeaves());

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
       searching for 2:

       -----------------------------
       height:
       3
       -----------------------------
       number of leaves:
       3
       -----------------------------
    */
  }

}//end class
