package com.example.polling;

import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class StringOperations {

     static  String reverseString(String userInput){
        StringBuilder str = new StringBuilder();
        for(int i=userInput.length()-1; i>=0; i--){
            str.append(userInput.charAt(i));
        }
        return str.toString();
    }

    public static Character uniqueChar(String userName) {

        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < userName.length(); i++) {
            char ptr1 = userName.charAt(i);
            count.put(ptr1, count.getOrDefault(ptr1, 0) + 1);
        }
            for (int k = 0; k < userName.length(); k++) {
                if (count.get(userName.charAt(k)) == 1)
                    return userName.charAt(k);
            }
        return 'n';
    }

    public static boolean anagram(String firstName, String lastName){

        if(firstName.length()!=lastName.length()){
            return false;
        }
        char[] s1 = firstName.toCharArray();
        char[] s2 = lastName.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);

    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int k=i+1; k<nums.length; k++){
                if(target==nums[i]+nums[k]){
                    return new int[] {i,k};
                }
            }
        }throw new IllegalArgumentException("No two sum solution");
    }

//    public static int reverse(int number){
//        ArrayList<int> ar = new ArrayList<int>();
//        String ch = String.valueOf(number);
//        char[] s = ch.toCharArray();
//        s.
//    }



    public static String substring(String name, String password) {
//         if(password.length()> name.length()){
//             return "NO";
//         }
//         for(int i=0; i < password.length();i++){
//             for(int j=0; j< name.length(); j++){
//                 if(password.charAt(i)==name.charAt(j)){
//                     if((i+1<=password.length()-1)&&(j+1<=name.length()-1)){
//                        if(password.charAt(i+1)!=name.charAt(j+1)){
//                          return "NO"; }
//                     } break;
//                 } }
//
//        } return "NO"; }
        int i=0;
        while(i<name.length())
        {
            boolean isSubstring = false;
            int j=0;


            while(j<password.length())
            {
                if(i>name.length()-1)
                {
                    isSubstring = false;
                }

                if(name.charAt(i)==password.charAt(j)) {
                    isSubstring = true;
                }
                else
                {
                    isSubstring =false;
                    break;
                }
                i++;
                j++;
            }

            if(isSubstring) {
                return "YES";
            }
        }
        return "NO";
    }
        public static boolean reverseInt(int x) {
            int fin=0;
            long j=0;
            int y =x;
                while(x>0){
                    fin=x%10;
                    x=x/10;
                    j = j * 10 + fin;
                    }
            System.out.println(j);
//             if(j >2147483647 || j < (-2147483648)) {
//                 return 0;
//             }
            if(j == y){
                return true;
            }
            return false;
        }

  /*  int rev = 0;
        while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        rev = rev * 10 + pop;
    }
        return rev;
}*/

    public static String revers(String input){
        char[] sb =input.toCharArray();

        List<Character> spaces = new ArrayList<>();
        for(int i=0;i<input.length();i++){
                spaces.add(sb[i]);
        }

        for(int i=input.length()-1; i>=0 ;i--){

            /*if(spaces[i]!=' ' ){
                spaces.add(sb[i]);
            }i--;*/
        }

        return spaces.toString();

    }
    public static int romanToInt(String s) {
        Map<String, Integer> rome = new HashMap<>();
        rome.put("I", 1);
        rome.put("II", 2);
        rome.put("III", 3);
        rome.put("IV", 4);
        rome.put("V", 5);
        rome.put("VI", 6);
        rome.put("VII", 7);
        rome.put("VIII", 8);
        rome.put("IX", 9);
        rome.put("X", 10);
        rome.put("L", 50);
        rome.put("C", 100);
        rome.put("D", 500);
        rome.put("M", 1000);
        rome.put("IV", 4);
        rome.put("IX", 9);
        rome.put("XL", 40);
        rome.put("XC", 90);
        rome.put("CD", 400);
        rome.put("CM", 900);

        int result = 0;
        String compare="";
            for (int i = 0; i < s.length(); i++) {
               if(i!= (s.length()-1)){
                   compare = Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
               }
                if (rome.containsKey(compare)) {
                    result += rome.get(compare);
                    i++;
                    compare="";
                }
                else {
                    result += rome.get(Character.toString(s.charAt(i)));
                }
      }
        return result;
    }


    public static String hset() {


        Map<String, Integer> scores = new HashMap<>();
        scores.put("user1",6);
        scores.put("user2",6);
        scores.put("user3",6);
        scores.put("user4",6);
        scores.put("user5",6);
        scores.put("user6",6);
        scores.put("user7",9);
        scores.put("user7",909);

        Iterator<String> itr = scores.keySet().iterator();
//        while(itr.hasNext()){
//          //  System.out.println(scores.get(itr.next())+"this ");
//           // scores.put("user9",6);
//        }


        //Grasshopper one = new Grasshopper("g1");// creating one obj
        //Grasshopper two = new Grasshopper("g2");// creating two obj
//        one = two; // assigning two address to one and garbage collected one's address
//        two = null;
//        one = null;


        String ip = "I AM ENGINEER";
        char[] strLen = ip.toCharArray();
        int end = ip.length()-1;
        int start = 0;

        while(start<end){
            if(strLen[start]== ' '){
                start++;
                continue;
            }if(strLen[end]== ' '){
                end--;
                continue;
            }
            char temp = strLen[start];
            strLen[start]=strLen[end];
            strLen[end]=temp;
            start++;
            end--;

        }
       // System.out.println(strLen);

        String[] arr = new String[]{"A","B","C","C","a"};
//        for(String i: arr){
//            if(list2.contains(i)){
//                System.out.println(i+" list sol");
//            }
//            list2.add(i);
//        }

        TreeSet<String> notDupli = new TreeSet<>();
        for(String i: arr){
            if(!notDupli.add(i)){
             //   System.out.println(i+" set sol");
            }
        }

        //Set<String> subSett = notDupli.
            //    System.out.println(notDupli.subSet("A", true,"C",true));



        List<Integer> lName = new ArrayList<>();
        lName.add(12);
        lName.add(122);
        lName.add(1);
        lName.add(1234);

        ListIterator<Integer> listIter = lName.listIterator(lName.size());

        while(listIter.hasPrevious()){
            System.out.print(listIter.previous()+" ");
        }
        Hashtable<String,String> htb = new Hashtable<>();
        htb.put("a","1");
        htb.put("b","2");
        htb.put("c","3");

       Set set= htb.entrySet();
       Iterator i = set.iterator();
       while(i.hasNext()){
           Map.Entry aa= (Map.Entry)i.next();
                   System.out.println(aa.getValue());
       }
        TreeSet <Integer> tsNamde = new TreeSet<>(lName);
        /*for(Integer i: tsNamde ) {
          //  System.out.print(i+" ,");
        }*/

        TreeSet<Integer> tMap = new TreeSet<>();
        tMap.add(18);
        tMap.add(17);
        tMap.add(16);
        tMap.add(15);
        tMap.add(14);
        tMap.add(13);
        tMap.add(10);

      //  System.out.println(tMap.comparator());

      //  System.out.println(tMap.ceiling(11));
       // System.out.println(tMap.)

        Set<String> emp = new HashSet<>();


            emp.add("abc");
            emp.add("hbkj");
            emp.add("rqh");

        Set<String> emp2 = new HashSet<>();


        emp2.add("abc");
        emp2.add("hbkj");
        emp2.add("rqh");

    String[] abc= new String[emp.size()];
//        System.out.println(emp.size());
//        System.out.println(emp.hashCode());
//       System.out.println(emp.equals(emp2));
//        System.out.println(emp.contains("abc"));
       // abc= emp.toArray();
       // System.out.println(emp.toArray(abc));

      /*  for(int i=0;i<abc.length;i++){
            System.out.println(abc[i]);
        }*/
      Iterator itr2 = emp.iterator();
        while(itr2.hasNext()){
           // System.out.println(itr.next());
        }

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("a");
        lhset.add("b");
        lhset.add("c");
        lhset.add("d");
        lhset.add("e");

        return null;
    }
    public static void convertToTarget(Object targetObject, Object sourceObject) {
        if (sourceObject != null) {
            if (sourceObject instanceof String) {

                String jobTypeValue = (String) sourceObject;
                JobType jobType = null;
                if (!jobTypeValue.isEmpty()) {
                    jobType = JobType.valueOf(jobTypeValue);
                }
                targetObject = (JobType) jobType;
            }
        }
      //  System.out.println("Enum Value:-"+targetObject.toString());
    }

    public enum JobType {

        NOTSTARTED , INQUEUE , COMPLETED , FAILED , NULL;

        public String getValue() {
            return this.name();
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        String s2 = strs[1];

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        if(sb1.charAt(0)==sb2.charAt(0)){
            String res = "";
            for(int i=0;i<strs.length;i++){

                String str1 = strs[i];
                StringBuilder strb1 = new StringBuilder(str1);
                Character c = strb1.charAt(i);

                for(int j = 1; j<strs.length;j++){
                    String str2 = strs[j-1];
                    StringBuilder strb2 = new StringBuilder(str2);
                    Character c2 = strb2.charAt(j-1);
                    if(c == c2){
                        res+=new StringBuilder().append(c).toString();
                    }
                }

                    }return res;
            }

         return "";
    }

    public static  boolean isValid(String s) {
        if(s.length()%2!=0){
            LinkedList<Integer> ll = new LinkedList<>();
            ll.addAll(ll);

            return false;
        }else{
            char[] arr = s.toCharArray();
            for(int i=0;i<arr.length-1;i++){
                for(int j=arr.length-1;j>0;j--){
                    if(arr[i]==arr[j]){

                        return true;
                    }
                }
            }return false;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
}
}
