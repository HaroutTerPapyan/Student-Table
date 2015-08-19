/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harout
 */
import java.util.TreeMap;

public class Table<K extends Comparable<K>, T>  // K = key,  T = item 
{
	
	TreeMap<K,T> bst = new TreeMap<K,T>();
	int size = 0;
	
	public boolean isEmpty(){
		 return bst.isEmpty();
	}

	public int size(){
		return bst.size();
	}

	public void tableInsert(K key, T item) throws TableException {
		try {
			if ((bst.get(key))!=null){
				throw new TableException("Error: Student Exists ");
			}
		}
		catch(TableException e) {
			e.printStackTrace();
		}
		
		bst.put(key,item);
		
		/*
		 if(tree.contains(key))
		 	throw new TableException ( "key: " + key + " is already in table);
		 else
		 	 tree.put(key,item);
		  
		 */
	}

	public boolean tableDelete(K key) { 
		if(bst.containsKey(key)) {
			bst.remove(key);
			return true;
		}
		else {
			return false;
		}
	}

	public T tableRetrieve(K key){
		return bst.get(key);
	}  //return null if not found
	

	public void printTable(){ 
		TreeMap<K,T> cloneTable = new TreeMap<K,T>();
		/*TreeMap<K,T> tempTree = (TreeMap<K,T>)tree.clone()
		  while(!tempTree.isEmpty()) {
		  	System.out.println(tempTree.pollFirstEntry());
		  }
		*/
		
		while(!bst.isEmpty()) {
			System.out.println(bst.pollFirstEntry().toString());
			
		}
	}  //print in search key order
		
}

