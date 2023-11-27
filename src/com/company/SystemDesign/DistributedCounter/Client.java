package com.company.SystemDesign.DistributedCounter;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            while (true) {
                System.out.print("Enter shard ID and user ID (comma-separated): ");
                String input = reader.readLine();

                if (input == null || input.isEmpty()) {
                    break;
                }

                writer.println(input); // Send the request to the server

                String response = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                System.out.println("Server response: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
