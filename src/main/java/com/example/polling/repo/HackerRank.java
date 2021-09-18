//package com.example.polling.repo;
//
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class HackerRank {
//
//    public static String findDay(int month, int date, int year) {
//        String day;
//            List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
//            HashMap<Integer, Integer> mont = new HashMap<Integer, Integer>();
//            mont.put(1,31);
//            mont.put(2,28);
//            mont.put(3,31);
//            mont.put(4,30);
//            mont.put(5,31);
//            mont.put(6,30);
//            mont.put(7,31);
//            mont.put(8,31);
//            mont.put(9,30);
//            mont.put(10,31);
//            mont.put(11,30);
//            mont.put(12,31);
//        if(year>1999 && year<3001) {
//                for (int k = 2000; k <= 3000; k++) {
//                    //year++;
//
//                    for (int j = 1; j <=12; j++) {
//                       // month++;
//
//                        for (int i = 1; i <=mont.get(j); i++) {
//                          //  date++;
//                            break;
//                        }
//                    }
//                }
//            }
//        }else {
//            return "not valid year";
//        }
//        return " k";
//    }
//     if(year/4==0) {
//      }
//             return 9;}