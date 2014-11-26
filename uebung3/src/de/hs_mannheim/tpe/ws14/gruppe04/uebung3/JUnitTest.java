package de.hs_mannheim.tpe.ws14.gruppe04.uebung3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.function.BiFunction;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
		
		BinaryHashTree<Object, Object> tree 
									= new BinaryHashTree<Object, Object>();
		tree.put(5, "fuenf");
		tree.put(8, "acht");
		tree.put(4, "vier");
		tree.put(7, "sieben");
		tree.put(6, "sechs");
		tree.put(3, "drei");
		tree.put(10, "zehn");
		
		BinaryHashTree<Object, Object> baum  
									= new BinaryHashTree<Object, Object>();
		
	
		
		
		//containsKey
		assertEquals(true, tree.containsKey(5));
		assertEquals(true, tree.containsKey(3));
		assertEquals(false, tree.containsKey(2));
		assertEquals(false, tree.containsKey(11));
		
		//containsValue
		assertEquals(true, tree.containsValue("acht"));
		assertEquals(true, tree.containsValue("drei"));
		assertEquals(false, tree.containsValue("eins"));
		assertEquals(false, tree.containsValue("zwei"));
		
		//get
		assertEquals("fuenf", tree.get(5));
		assertEquals("drei", tree.get(3));
		assertNotEquals("eins", tree.get(10));
		assertNotEquals("zwei", tree.get(6));
		
		//isEmpty
		assertEquals(false, tree.isEmpty());
		assertEquals(true, baum.isEmpty());
		
		baum.put("Miller", "Lisa");
		baum.put("Schweizer", "Jochen");
		baum.put("Wagner", "Valerian");
		
		//putAll / forEach
		tree.putAll(baum);
		assertEquals(true, tree.containsKey("Miller"));
		assertEquals(true, tree.containsValue("Valerian"));
		
		//remove
		tree.put(11, "elf");
		assertEquals(true, tree.containsKey(11));
		tree.remove(11);
		assertEquals(false, tree.containsKey(11));
		
		//size
		BinaryHashTree<Object, Object> leer = 
				new BinaryHashTree<Object, Object>();
		assertEquals(0, leer.size());
		assertEquals(10, tree.size());
		assertEquals(3, baum.size());
		
		//update
		tree.update("Miller", "Elisabeth");
		tree.update(4, "four");
		
		assertEquals("Elisabeth", tree.get("Miller"));
		assertEquals("four", tree.get(4));
		
		//extractAll
		leer.put("lefpA", "Apfel");
		baum.extractAll(leer);
		
		assertEquals(true, leer.containsKey("Miller"));
		assertEquals(true, leer.containsValue("Valerian"));
		
		//map
		BiFunction<String, String, String> function 
									= (key, value) -> key + value;
		BinaryHashTree<String, String> stringtree 
									= new BinaryHashTree<String, String>();
		stringtree.put("Erni", "Bert");
		stringtree.put("Mini", "Maus");
		BinaryHashTree<String, String> newtree = stringtree.map(function);
		assertEquals("ErniBert", newtree.get("Erni"));
		assertEquals("MiniMaus", newtree.get("Mini"));
		
		//clear
		tree.clear();
		assertEquals(true, tree.isEmpty());
		
		
		
	}
}
