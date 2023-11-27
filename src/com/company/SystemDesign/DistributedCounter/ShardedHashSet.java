package com.company.SystemDesign.DistributedCounter;

import java.util.HashMap;
import java.util.HashSet;

public class ShardedHashSet extends HashMap<String, HashSet<String>> {
    // Constructor to create the sharded hash set with the specified number of shards
    public ShardedHashSet(int numShards) {
        // Initialize the hash map with the shard IDs as keys and empty hash sets as values
        for (int i = 0; i < numShards; i++) {
            put(Integer.toString(i), new HashSet<>());
        }
    }
}