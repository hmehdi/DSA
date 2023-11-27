package com.company.al;

import java.util.concurrent.atomic.AtomicInteger;


public class UniqueIdGenerator {
    private static final int MACHINE_ID = 123; // Replace with your machine ID
    private static final AtomicInteger sequenceNumber = new AtomicInteger(0);

    public static long generateUniqueId() {
        long timestamp = System.currentTimeMillis() & ((1L << 39) - 1);
        long uniqueId = (timestamp << 24) | (MACHINE_ID << 8) | (sequenceNumber.getAndIncrement() & 0xFF);
        sequenceNumber.compareAndSet(256, 0); // Reset sequence number if it reaches 256

        return uniqueId;
    }

    public static void main(String[] args) {
        long id = generateUniqueId();
        System.out.println(id);
        System.out.println(id<< 62);
    }
}
