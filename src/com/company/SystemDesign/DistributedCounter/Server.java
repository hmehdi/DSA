package com.company.SystemDesign.DistributedCounter;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private ShardedHashSet shardedHashSet;

    public Server(int numShards) {
        shardedHashSet = new ShardedHashSet(numShards);
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started and listening on port 5000...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from " + clientSocket.getInetAddress());

                // Create a new thread to handle the client request and pass in the sharded hash set
                Thread thread = new Thread(new ClientHandler(clientSocket, shardedHashSet));
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(4); // Create a server with 4 shards
        server.start();
    }
}
