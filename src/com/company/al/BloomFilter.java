package com.company.al;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class BloomFilter {
    private BitSet bitSet;
    private int size;
    private int numHashFunctions;
    private Set<String> elements;

    public BloomFilter(int size, int numHashFunctions) {
        this.size = size;
        this.numHashFunctions = numHashFunctions;
        this.bitSet = new BitSet(size);
        this.elements = new HashSet<>();
    }

    public void add(String element) {
        elements.add(element);
        for (int i = 0; i < numHashFunctions; i++) {
            int hash = getHash(element, i);
            bitSet.set(hash);
        }
    }

    public boolean contains(String element) {
        if (!elements.contains(element)) {
            return false;
        }
        for (int i = 0; i < numHashFunctions; i++) {
            int hash = getHash(element, i);
            if (!bitSet.get(hash)) {
                return false;
            }
        }
        return true;
    }

    private int getHash(String element, int seed) {
        int hash = seed;
        for (char c : element.toCharArray()) {
            hash = (hash * 31 + c) % size;
        }
        return hash;
    }

    public static void main(String[] args) {
        BloomFilter bloomFilter = new BloomFilter(16, 3);
        bloomFilter.add("apple");
        bloomFilter.add("banana");
        bloomFilter.add("orange");

        System.out.println(bloomFilter.contains("apple"));   // true
        System.out.println(bloomFilter.contains("banana"));  // true
        System.out.println(bloomFilter.contains("orange"));  // true
        System.out.println(bloomFilter.contains("grape"));   // false
    }
}

