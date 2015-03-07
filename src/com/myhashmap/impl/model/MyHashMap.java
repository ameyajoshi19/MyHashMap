package com.myhashmap.impl.model;


/**
 * <p>
 * Interface for my HashMap implementation.
 * </p>
 * @author AmeyaCJoshi
 *
 */
public interface MyHashMap<K, V> {

	// The method to insert a key-value pair into the HashMap.
	public void put(K k, V v);
	
	// The method to get a value using a key from the HashMap.
	public V get(K k);
	
	// THe method to check if the HashMap contains a key.
	public boolean contains(K k);
}
