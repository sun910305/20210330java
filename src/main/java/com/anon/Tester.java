package com.anon;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new Reporter() {
            @Override
            public void print() {
                System.out.println("Ding Dong");//sout
            }
        };
        Reporter reporter1 = new Reporter() {
            @Override
            public void print() {
                System.out.println("HeHeHe");
            }
        };
        reporter.print();
        reporter1.print();






/*        Reporter reporter = new WeatherReporter();
        Reporter reporter2 = new HeHeHeReporter();
        reporter.print();
        reporter2.print();
*/
    }
}
