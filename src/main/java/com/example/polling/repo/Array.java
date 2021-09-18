package com.example.polling.repo;

import java.util.*;

public class Array {
   
    public static int a=9;
    public static int[] arraySum(int[] input) {

        int k = 22;
        String s = Integer.toBinaryString(k);
        int[] sav = new int[s.length()];
        s.split("i", 0);
        int count = 0;
        for (int i : sav) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (sav[i] == sav[j]) {
                    count++;
                }
            }
            break;
        }

        if (input == null || input.length == 0) {
            return new int[0];
        }
        int[] sum = new int[input.length];
        sum[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            sum[i] = input[i] + sum[i - 1];
        }
        return sum;
    }

    public static int[] fix23(int[] nums) {

        if (nums.length < 3 || nums.length > 3) {
            return null;
        }
        for (int i = 0; i < 2; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public static int maxTriple(int[] nums) {
        //public int maxTriple(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length % 2 != 0) {
            if (nums[0] > nums[(nums.length / 2)] && nums[0] > nums[nums.length - 1]) {
                return nums[0];
            } else if ((nums[(nums.length / 2)]) > (nums[0]) && (nums[(nums.length / 2)]) > (nums[nums.length - 1])) {
                return nums[(nums.length / 2)];
            } else if ((nums[(nums.length - 1)]) > (nums[0]) && (nums[(nums.length - 1)]) > (nums[(nums.length / 2)])) {
                return (nums[(nums.length)]);
            }
        }
        return 0;
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length == 0 && b.length == 0) {
            return new int[]{};
        } else if (a.length == 0) {
            return new int[]{b[0]};
        } else if (b.length == 0) {
            return new int[]{a[0]};
        } else {
            return null;
        }
    }


    public static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element.equals("Student"))
                a++;
            if (element.equals("Rockstar"))
                b++;
            if (element.equals("Hacker"))
                c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    // public void main(String []args){
//            ArrayList mylist = new ArrayList();
//            //Scanner sc = new Scanner(System.in);
//            int t = 5;
//            for(int i=0; i<t; i++){
//                String s="Student";
//                if(s.equals("Student"))mylist.add(new Student());
//                if(s.equals("Rockstar"))mylist.add(new Rockstar());
//                if(s.equals("Hacker"))mylist.add(new Hacker());
//            }
//            System.out.println(count(mylist));
//        }
    public static int tryi(int[] name) {
        int k = 5;
        //int[] nam= new int[5];
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int store = 0;
            for (int j = i; j < k; j++) {
                store += name[j];
                if (store < 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        return 0;
    }

    public static int digitAddition(int n[]) {
        int factorial = 1;
        int totalSum = 0;
        for (int i = n.length; i > 0; i--) {
            factorial *= i;
        }
        for (int i : n) {
            totalSum += i;
        }
        int fact = factorial / n.length;
        int formula = fact * totalSum;
        int sum = 0;
        int multiplier = 1;
        for (int i = n.length; i > 0; i--) {
            sum += multiplier * formula;
            multiplier *= 10;
        }
        return sum;
    }

//    Given an input string, write a function that returns the
//    Run Length Encoded string for the input string. For example,
//    if the input string is “yyyybbbbdexxxxxxx”, then the function should return “y4b4dex7″.

    public static String length() {
        String k = "yyyybbbbdexxxxxxx";
        HashMap<String, Integer> letter = new HashMap<String, Integer>();

        letter.put("a",55);
        //letter.getKey()
        System.out.println(letter.get("a").equals(55)+" matched ");
        for (String i : k.split("")) {
            Integer klk = letter.get(i);

            if (klk == null) {
                letter.put(i, 1);
            } else {
                letter.put(i, klk + 1);
            }
        }
        String con = "";


        for (Map.Entry<String, Integer> loop : letter.entrySet()) {
            //System.out.println(loop.hashCode()+"hashcode");
            //loop.setValue(5556);
            Integer lo = loop.getValue();
            Set<Integer> sett = new HashSet<>();
            sett.add(lo);
            if (loop.getValue() != 1) {
                con += loop.getKey() + loop.getValue();
            } else {
                con += loop.getKey();
            }
        }
        Set  save =  letter.entrySet();
        Iterator<String> it = save.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        List<String> li = null ;
        li.add("jjj");

        return con;
    }

    //    Look different types for how to iterate hashmap.
//            2. Write a program to sort hashmap by keys.
    public int hash() {
        Map<Integer, String> hashy = new HashMap<>();
        hashy.put(2, "srilanka");
        hashy.put(1, "india");
        hashy.put(9, "us");
        hashy.put(5, "canada");
        hashy.keySet();
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.putAll(hashy);
        System.out.println(tree);
        return 9;
    }

    public int hash(int a, int b) {
        Map<Integer, String> hashy = new HashMap<>();
        hashy.put(2, "srilanka");
        hashy.put(1, "india");
        hashy.put(9, "us");
        hashy.put(5, "canada");
        hashy.keySet();
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.putAll(hashy);
        System.out.println(tree);
        return a + b;
    }

    //2.Write a program to sort hashmap by values

    public static int hashByValue() {


        Map<Integer, String> hashVal = new HashMap<>();
        ArrayList<String> alistName = new ArrayList<String>();
        alistName.add("zahashVal");
        alistName.add(Integer.toString(2));
        alistName.add("phashVal");
        alistName.add("ghashVal");
        alistName.add("uhashVal");
        ArrayList<String> alistName2 = new ArrayList<String>();
        alistName2.add("zahashVal");
        alistName2.add(Integer.toString(2));
        alistName2.add("iouoi");
        alistName2.add("huyyr");
        alistName2.add("hyurueri");
//       employee =  [[sasidhar,85000,999999999999999]]
//        model = {string name, short ap, long phoneNumber}
//        monthlyPay = ap/12
//                model.setName("Sasidhar")
//
//        monthlyPay = index(1).toInt/12
//        employee[i] =  [[1,sasidhar,85000]]
//        id's list = [1,2]
//            namesList =[]
        ArrayList<Integer> naaamShabana = new ArrayList<>();
        naaamShabana.add(2);
        naaamShabana.add(77);
        naaamShabana.add(77);
        naaamShabana.add(5);
        naaamShabana.add(4);
        naaamShabana.add(2);
        //naaamShabana.removeAll();

        methodName(alistName, naaamShabana);
        System.out.println(alistName2);
        System.out.println(alistName);
       // methodName(alistName);
        System.out.println(naaamShabana);
        alistName.removeAll(alistName2);
        System.out.println(naaamShabana.indexOf(Integer.valueOf(2)));
         System.out.println(alistName2);
        System.out.println(alistName);


        Collections.sort(alistName);
        Collections.sort(alistName, Collections.reverseOrder());
        Iterator iter = alistName.iterator();
        while (iter.hasNext()) {

        }

        hashVal.put(2, "srilanka");
        hashVal.put(1, "india");
        hashVal.put(9, "us");
        hashVal.put(5, "canada");
        List<String> employeeById = new ArrayList<>(hashVal.values());
        Collections.sort(employeeById);
        return 0;
    }
    //code eodc

    public static String everyNth(String str, int n) {
        if (str.substring(1,4) == "del") {
            return str.charAt(0)+str.substring(4,str.length()-1);
        }
        Character z = 'z';
        Character Z = 'Z';
        Character a = 'a';
        Character A = 'A';
        //String kk = "" + regex[a - z 0 - 9 A - Z];
        Character kl = str.charAt(0);
        String k = str.substring(0, 1);
        Character k2 = str.charAt(str.length() - 1);
        return kl + str.substring(1, str.length() - 2) + k2;


    }

    public static String delDel(String str) {
        if(str.length()>3){
            //System.out.println(str.substring(4,str.length()));
            if (str.substring(1,4).equals( "del")) {
                return str.substring(0,1)+str.substring(4,str.length());
            }
        }return str;
    }




    public static void methodName(ArrayList alistName, ArrayList naaamShabana){
        int k=99;
//arrlist = hashByValue()
        LinkedList <String> nameLL = new LinkedList<>();
        //Array.hashByValue();
        nameLL.addAll(alistName);
        nameLL.addAll(2,naaamShabana);
//nameLL.g

        Iterator<ArrayList> itr = naaamShabana.listIterator();

      //  for(int i=0;i<naaamShabana.size();i++){
           // if(naaamShabana.get(i).equals (77)){
        System.out.println((naaamShabana.lastIndexOf(77)));

        Iterator nam = nameLL.descendingIterator();
        while (nam.hasNext()) {
            System.out.println(nam.next() + "---");
        }
        while(itr.hasNext()) {
            System.out.print(itr.next()+"iterator");
        }
        Integer nameArr[] = new Integer[10];
      //  System.out.println(       nameLL.offer("sale"));
        System.out.println(nameArr.length+"SIZE ");
       // System.out.println(naaamShabana.len);
        System.out.println(nameLL.retainAll(naaamShabana));
    }

    public static int HashHappy(){
        HashMap<Integer, String> ludo = new HashMap<>();
        ludo.put(0,"born");
        ludo.put(1,"friend");
        ludo.put(2,"love");
        ludo.put(3,"marriage");
        ludo.put(4,"children");
        ludo.put(5,"dead");
        System.out.println(ludo);
    for(Map.Entry<Integer,String> ee : ludo.entrySet()) {
    if (ee.getValue().equals("born")) {
        System.out.println(ee.getKey());
    }
}
    HashMap<Integer, String> ludo2 = new HashMap<>();
    ludo2.put(0,"born");
    ludo2.put(1,"friend");
    ludo2.put(2,"love");
    ludo2.put(3,"marriage");
    ludo2.put(4,"children");
    ludo2.put(5,"dead");
// System.out.println(ee.getValue());
    //System.out.println(ludo.computeIfAbsent(6, (key) -> ( "divorce")));

        ludo2.forEach((key, value)-> ludo.merge(
                        key,
                        value,
                        (v1, v2)
                                -> v1.equalsIgnoreCase(v2)
                                ? v1
                                : v1 + ", " + v2));

//ludo.merge()
        System.out.println(ludo);
    return 999;
    }
}














