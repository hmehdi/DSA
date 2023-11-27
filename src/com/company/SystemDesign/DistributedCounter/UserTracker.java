package com.company.SystemDesign.DistributedCounter;
import java.util.HashMap;
import java.util.HashSet;

public class UserTracker {

    private final HashMap<String, HashSet<String>> activeUsers;

    public UserTracker() {
        activeUsers = new HashMap<>();
    }

    public void trackUserVisit(String webPageUrl, String userId) {
        if (!activeUsers.containsKey(webPageUrl)) {
            activeUsers.put(webPageUrl, new HashSet<>());
        }
        activeUsers.get(webPageUrl).add(userId);
    }

    public void trackUserExit(String webPageUrl, String userId) {
        if (activeUsers.containsKey(webPageUrl)) {
            activeUsers.get(webPageUrl).remove(userId);
        }
    }

    public int getActiveUserCount(String webPageUrl) {
        if (activeUsers.containsKey(webPageUrl)) {
            return activeUsers.get(webPageUrl).size();
        }
        return 0;
    }

    public static void main(String[] args) {
        UserTracker userTracker = new UserTracker();

        userTracker.trackUserVisit("www.example.com/page1", "user1");
        userTracker.trackUserVisit("www.example.com/page1", "user2");
        userTracker.trackUserVisit("www.example.com/page2", "user1");
        userTracker.trackUserVisit("www.example.com/page2", "user3");

        System.out.println("Active users for www.example.com/page1: " + userTracker.getActiveUserCount("www.example.com/page1"));
        System.out.println("Active users for www.example.com/page2: " + userTracker.getActiveUserCount("www.example.com/page2"));

        userTracker.trackUserExit("www.example.com/page1", "user1");

        System.out.println("Active users for www.example.com/page1 after user exit: " + userTracker.getActiveUserCount("www.example.com/page1"));
    }
}
