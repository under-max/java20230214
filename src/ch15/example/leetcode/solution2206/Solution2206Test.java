package ch15.example.leetcode.solution2206;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution2206Test {

	@Test
	void test1() {
		Solution2206 o1 = new Solution2206();
		assertTrue(o1.divideArray(new int[] {3, 2, 3, 2, 2, 2}));
	}
	
	@Test
	void test2() {
		Solution2206 o1 = new Solution2206();
		assertFalse(o1.divideArray(new int[] {1, 2, 3, 4}));
	}

}






