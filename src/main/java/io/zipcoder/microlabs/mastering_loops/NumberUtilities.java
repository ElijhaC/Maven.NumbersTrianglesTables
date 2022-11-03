package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int result = 1;
        String square = "";
        for (int i = start; i < stop; i += step) {
            result = i * i;
            square += result;
        }
        return square;
    }

    public static String getRange(int stop) {

        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i += step){
            sb.append(i);
        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expo = "";
        for (int i = start; i < stop; i += step) {
            int j = (int) Math.pow(i, exponent);
            expo += j;
        }
        return expo;
    }
}

//    public static String getEvenNumbers(int start, int stop) {
//        String result = "";
//        for (int i = start; i < stop; i++) {
//            if (i % 2 == 0) {
//                sb.append(i);
//            }
//        }
//        return sb.toString();
//    }


//    public static String getOddNumbers(int start, int stop) {
//        String result = "";
//        for (int i = start; i < stop; i++) {
//            if (i % 2 != 0) {
//                sb.append(i);
//            }
//        }
//        return sb.toString();
//    }


//    public static String getSquareNumbers(int start, int stop, int step) {
//        int result = 1;
//        String stream = "";
//        for (int i = start; i < stop; i += step) {
//            result = i * i;
//            stream += result;
//        }
//        return stream;
//    }
//
//    public static String getRange(int stop) {
//        String stream = "";
//        for (int i = 0; i < stop; i++) {
//            stream += i;
//        }
//        return stream;
//    }
//
//    public static String getRange(int start, int stop) {
//        String stream = "";
//        for (int i = start; i < stop; i++) {
//            stream += i;
//        }
//        return stream;
//    }
//
//
//    public static String getRange(int start, int stop, int step) {
//        String stream = "";
//        for (int i = start; i < stop; i += step) {
//            stream += i;
//        }
//        return stream;
//    }
//
//
//    public static String getExponentiations(int start, int stop, int step, int exponent) {
//        String stream = "";
//        for (int i = start; i < stop; i += step) {
//            int j = (int) Math.pow(i, exponent);
//            stream += j;
//        }
//        return stream;
//    }