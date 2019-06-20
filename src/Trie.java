
import java.util.HashMap;


public class Trie {

	
	private class TrieNode
	{
		HashMap<Character,TrieNode> child;
		boolean LastNode=false;
		
		public TrieNode() {
			child=new HashMap<>();
			LastNode=false;
		}
	}
	
	private final TrieNode root;
	
	public Trie() {
		root=new TrieNode();
	}
	
	
	/*Operations on trie
	 * Inserting a String into the tri nodes
	 * Search for a string
	 * Delete a string or character from the trie
	 * */
	
	public void insert(String word){
		TrieNode current=root;
		
		for (int i = 0; i < word.length(); i++) {
			char c=word.charAt(i);
			TrieNode node=current.child.get(c);
			
			if(node==null) { // Character is not in the tri so we add it to the trie
				node=new TrieNode(); //Creating a new node which will be help to reference next node
				System.out.println(c+" is inserted");
				current.child.put(c, node);	
			}
			current=node;
			
		}	
		current.LastNode=true;
		System.out.println("The word:"+word+" is inserted to the trie");
		
	}
	
	//Searching a word in Trie
	
	public boolean searching(String word) {
		// TODO Auto-generated method stub
		TrieNode current=root;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			TrieNode node=current.child.get(c);
			
			if(node==null) { //means no charecter is  found so no need to iterate over a string
				System.out.println("The String doesnot exist in the trie!");
				return false;
				
			}
			current=node;
		}
		if(current.LastNode==true) {
			System.out.println(" Input word: "+word+" exist in the tree");
			
		}
		else {
			System.out.println("the input word is the suffiex of the present word");
		}
		return current.LastNode;
	}
	
	
	//Delete a word from the tree
	private final void delete(String word) {
		// TODO Auto-generated method stub
		if(searching(word)) {
			delete(root,word,0);
		}
	}
	public boolean delete(TrieNode parent,String word,int index) {
		
		char c=word.charAt(index);
		boolean del;
		//gives us the next object of the current node
		TrieNode current=parent.child.get(c);
		
		/*Case1: when a given word's prefix is the same as the Prefix of other word (Alexa,Aleho)
		 *Case2: when the last character of the word is the prefix of existing word (Alexa, Alexander)
		 *Case3: Other word is the prefix of the word that we are trying to delete (Dhruv, Dhr)
		 *Case4: Individual word found! good to go- delete
		 * */
		
		if(current.child.size()>1) { //case1: 
			System.out.println("This is the CASE 1#");
			delete(current,word,index+1);
			return false;
		}
		
		if(index==word.length()-1) {// check if it as the last word
			//if the word we want to delete is depended on one word we cant delete it so
			if(current.child.size()>=1) {
				System.out.println("The word is depended on another word!,cant remove");
				current.LastNode=false;
				return false;	
			}
			else {
				System.out.println("Character " + c + " has no dependency, hence deleting it from last");
				parent.child.remove(c);
				return true;// If this word is not a prefix of some other word, and since this is last
							// character, we should
							// return true, indicating we are ok to delete this node
			}
		}
		if(current.LastNode=true) {//Case3
			System.out.println("This is case 3");
			delete(current, word, index+1);
			return false;
		}
		
		del=delete(current	, word, index+1);
		if(del) {
			System.out.println("Deleting the character: "+c+"");
			parent.child.remove(c);
			return true;
		}
		else {
			return false;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Trie t  =new Trie();
		
		//CASE#1
		t.insert("bcde");
		t.insert("bc");
		
		t.delete("bcde");
		t.searching("bc");
		
		/*t.searching("bcde");
		t.searching("bckg");
		
		
		//CASE#2
		t.insert("bcde");
		t.insert("bcdefg");
		t.delete("bcde");
		t.searching("bcde");
		t.searching("bcdefg");
		
		
		//CASE#3
		t.insert("bcde");
		t.insert("bc");
		t.delete("bcde");
		t.search("bcde");
		t.search("bcde");
		t.search("bc");
		t.search("b");*/
		
		
		/*//CASE#4
		t.insert("bcde");
		t.delete("bcde");
		t.search("bcde");*/
		
	}
	
	
	
	
}
