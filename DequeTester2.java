public class DequeTester2{
    public static void main(String []args){
	QQKachoo<String> test1 = new QQKachoo<String>();

	// System.out.println(test1.isEmpty());

	test1.offerFirst("cat");
	test1.offerLast("cat");
	test1.offerFirst("dog");
	test1.offerLast("dog");
	test1.offerFirst("elephant");
	test1.offerLast("elephant");
	test1.offerFirst("child");
	test1.offerLast("child");
	test1.offerFirst("flag");
	test1.offerLast("flag");
	test1.offerFirst("pear");
	test1.offerLast("pear");
	test1.offerFirst("F");
	test1.offerLast("E");

	System.out.println(test1);
	// System.out.println(test1.isEmpty());
	/*
        System.out.println("\ntest iterator");
        for(String x:test1)
            System.out.println(x);

        System.out.println("\ntest diterator");
        Iterator<String> it = test1.diterator();
        while(it.hasNext())
	System.out.println(it.next());*/

	System.out.println("\nremoveing");
	while(test1._size != 0/*!test1.isEmpty()*/){
	    System.out.println(test1.peekFirst() + "\t" + test1.pollFirst());
	    System.out.println(test1.peekLast() + "\t" + test1.pollLast());
	}

	System.out.println("\n"+test1);
	// System.out.println(test1.isEmpty());

	/*
    QQKachoo<String> itestf = new QQKachoo<String>();
    QQKachoo<String> iteste = new QQKachoo<String>();
    for (int i = 0; i<10; i++){
        itestf.offerFirst(i+"");
        iteste.offerFirst(i+"");
        
    }

    Iterator<String> f = itestf.iterator();
    Iterator<String>e=iteste.diterator();

    
    System.out.println(itestf);

    while (f.hasNext()){
        System.out.print(f.next()+ " ");
        f.remove();
    }
    System.out.println(itestf);
    System.out.println(iteste);

    while (e.hasNext()){
        
        System.out.print(e.next()+ " ");
        e.remove();
    }
    System.out.println(iteste);
	*/
    }
}
