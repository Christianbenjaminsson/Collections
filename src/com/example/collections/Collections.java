package com.example.collections;

import javax.swing.text.html.ImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        java.util.Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = java.util.Collections.min(seatCopy);
        Theatre.Seat maxSeat = java.util.Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber() + ", max seat number is "+ maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }

        System.out.println();
        System.out.println("==============================================================================");
    }

    public static void sortList(List <? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() -1; i++) {
            for (int j = i+1; j<list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    java.util.Collections.swap(list, i, j);
                }
            }
        }
    }
}
