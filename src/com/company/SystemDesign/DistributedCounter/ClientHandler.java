package com.company.SystemDesign.DistributedCounter;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private ShardedHashSet shardedHashSet;

    public ClientHandler(Socket clientSocket, ShardedHashSet shardedHashSet) {
        this.clientSocket = clientSocket;
        this.shardedHashSet = shardedHashSet;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String request = reader.readLine(); // Read the client request

            // Parse the request to get the shard ID and user ID
            String[] tokens = request.split(",");
            String shardId = tokens[0];
            String userId = tokens[1];

            // Update the hash set for the specified shard with the user ID
            shardedHashSet.get(shardId).add(userId);

            System.out.println("Updated sharded hash set: " + shardedHashSet);

            writer.println("OK"); // Send a response to the client
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
