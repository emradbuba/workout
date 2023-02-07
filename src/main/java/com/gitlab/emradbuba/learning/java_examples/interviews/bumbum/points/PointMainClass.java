package com.gitlab.emradbuba.learning.java_examples.interviews.bumbum.points;

public class PointMainClass {

    public static void main(String[] args) {

        PointCollection pointsCollection = new PointCollection();
        pointsCollection.add(new MyPoint(2, 5));
        pointsCollection.add(new MyPoint(2, 5));
        pointsCollection.add(new MyPoint(30, 80));
        pointsCollection.add(new MyPoint(1,1));
        pointsCollection.add(new MyPoint(30, 80));
        pointsCollection.add(new MyPoint(30, 80));
        for (MyPoint myPoint : pointsCollection.getAllPoints()) {
            System.out.println(myPoint);
        }

        /* Expected output:
         (1, 1) counter=1
         (2, 5) counter=2
         (30, 80) counter=3
        */




    }

}
