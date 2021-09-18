package com.example.polling;

import com.example.polling.model.SinglyLinkedList1;
import com.example.polling.repo.Array;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication
@EntityScan(basePackageClasses = {PollingApplication.class, Jsr310JpaConverters.class})
public class PollingApplication {


	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	int c = Array.a;

//	@Autowired
//	private StringOperations stringOperations;
//	public void frustated(){
//		System.out.println(stringOperations.hset());
//	}



	public static void main(String[] args) {
		SinglyLinkedList1 ss= new SinglyLinkedList1();
		com.example.polling.Service.getAjob.primeNumbers();
		ss.in1To10(9,true);
		//ss.insertElements(2);
		ss.insert(4);
		ss.insert(2);
		ss.insert(3);
		ss.insert(2);
		ss.insert(2);
		ss.insert(1);
		ss.insert(5);
		ss.insert(5);

		SinglyLinkedList1 ss2= new SinglyLinkedList1();

		ss2.insert(2);
		ss2.insert(5);
		ss2.insert(8);
		ss2.insert(99);
		ss2.insert(20);
		ss2.insert(11);
		ss2.insert(555);
		ss2.insert(99);

		//ss.head.
		//ss.printList();
		//ss.insert(5);
		//ss.deleteAtIndex(77);
		//ss.printList();
		//ss.duplicateSorted(ss.head);
		//ss.duplicateWithUnsorted(ss.head);
	//	ss.firstLastSwap(ss.head);
		//ss2.printList();
		//ss.intersectTwoLists(ss.head, ss2.head);
		//ss.printList();
		//ss.head.next.next.next= ss.head;
		//ss.count();
//		ss.searchRecursive(ss.head, 3);
		//ss.nthNodeRecursive(ss.head,0);
		//ss.twoPointerForValueInReverse(ss.head, 5);
			//ss.countRepeat(ss.head,0);
		//ss.middleElement(ss.head);

//ss.loopLength(ss.head);
//ss.reverseSingleLinkedList(ss.head);
		//ss.isPalindrome(ss.head);
//	public  void polling() {
//
//		frustated();
				//System.out.println( (HashsetProblems.canWin(1, new int  [3])) ? "YES" : "NO" );

		//Practise myobj = new Practise(66);
		//System.out.println("value of var is: "+myobj.getValue());
		//	System.out.println(Array.a);
//		SpringApplication.run(PollingApplication.class, args);
			//System.out.println(StringOperations.reverseString("reverse"));
		//System.out.println(StringOperations.uniqueChar("aaaaabbbvinash"));
		//System.out.println(StringOperations.anagram("silent","listen"));
		//System.out.println(StringOperations.substring("avinash","avnas"));
		//System.out.println(StringOperations.reverseInt(12231));
		//System.out.println(StringOperations.romanToInt("XCIX"));
		//System.out.println(StringOperations.hset());
		//System.out.println(StringOperations.longestCommonPrefix(new String[] {"flower","flow","flight"}));
//		System.out.println(StringOperations.twoSum(new int[]{2 ,7, 11, 15}, 9));
//		System.out.println(Loops.highToLow(5));
//		System.out.println(Loops.lowToHigh(5));
//		System.out.println(Loops.rightToLeft(10));
//		System.out.println(Loops.star(5));
		//System.out.println(Loops.minimun(new int []  {3,21,44,6666,1}));
		//System.out.println(Loops.moveLeftinArray(new int []  {3,21,44,6666,1}));
		//System.out.println(Loops.duplicatesInArray(new int[] {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7}));
		//System.out.println(Excercise.topDown(7));;
		//System.out.println(HackerRank.findDay(01,12,2020));
		//System.out.println(Loops.compareTriplets(new int[]{5,6,7}, new int[]{3,6,10});
		//System.out.println(Excercise.numStar(7));
		//System.out.println(Excercise.facto(47));
		//System.out.println(Excercise.hexa(1256));
		// System.out.println((Array.front11(new int[] {}, new int[]{})));
		//System.out.println((Array.count(new ArrayList String[]  {"Student","avnas"})));
		//	System.out.println(Arrays.toString(Array.arraySum(new int[]{})));
		//System.out.println(Arrays.toString(Array.arraySum(null)));
		//System.out.println((Array.tryi(new int[] {1,-2,4,-5,1})));
		//System.out.println((Array.digitAddition(new int[] {1,2,3,4})));
		//System.out.println((Array.length()));
		//System.out.println((Array.hash()));
//		ChildArray ch = new ChildArray();
//		System.out.println(ch.hash(2,3));
//		System.out.println(ch.hash());
		//System.out.println(Array.hashByValue());
		//System.out.println(Array.HashHappy());
		//System.out.println(Abstrct.tst());


//		int[] arr = new int[]{1,2,3};
//
//		ListNode L1= new ListNode();
//		ListNode l2= new ListNode();
//		L1.val=1;
//		l2.val=3;
//
//
//		L1.next= new ListNode(2, l2);
//
//
//		ListNode L2= new ListNode();
//		ListNode l3= new ListNode();
//		L2.val=1;
//		l3.val=4;
//		L2.next= new ListNode(2, l3);

		//System.out.println(StringOperations.mergeTwoLists(L1,L2));
		//System.out.println(LinkedListProblems.streamer());
	//	System.out.println(LinkedListProblems.add(new ArrayList<>(Arrays.asList(1,3,2,4,5,6,8,7))));
//int c =		Array.a;,
		//ArrayList<String> rang4 = new ArrayList<>();
//System.out.println(ArrayListProblems.methd());
//System.out.println(LinkedListProblems.ll());
		//System.out.println(Array.delDel("adelbc"));
		//	System.out.println(Array.methodName( alistName, naaamShabana));
		//System.out.println(LinkedListProblems.methodCall());
		//System.out.println();
		//System.out.println(Array.length());
	//System.out.println(HashsetProblems.HashingTechniques());
		//System.out.println(Practise.arrListNumbers());
		//System.out.println(Practise.javaHungry());

	}
}