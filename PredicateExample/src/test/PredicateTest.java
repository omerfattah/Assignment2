package test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = a -> (a>25);//creating predicate
		System.out.println(predicate.test(10)); //calling predicate method
	}

}
