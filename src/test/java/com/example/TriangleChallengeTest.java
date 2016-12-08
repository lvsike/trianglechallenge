package com.example;

import com.example.service.TriangleChallenge;
import com.example.service.impl.TriangleChallengeImpl;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-7 21:20
 */
public class TriangleChallengeTest extends TestCase {
    public TriangleChallengeTest(String name) {
        super(name);
    }

    public static junit.framework.Test suite() {
        return new TestSuite(TriangleChallengeTest.class);
    }

    public void test() {
        TriangleChallenge triangleChallenge = new TriangleChallengeImpl();
        assertSame("It is not a triangle", triangleChallenge.challenge(13, 23, 36));
        assertSame("It is not a triangle", triangleChallenge.challenge(23, 13, 36));
        assertSame("It is not a triangle", triangleChallenge.challenge(36, 13, 23));

        assertSame("It is a equilateral triangle", triangleChallenge.challenge(3, 3, 3));

        assertSame("It is a isosceles triangle", triangleChallenge.challenge(1, 3, 3));
        assertSame("It is a isosceles triangle", triangleChallenge.challenge(3, 1, 3));
        assertSame("It is a isosceles triangle", triangleChallenge.challenge(3, 3, 1));

        assertSame("It is a scalene triangle", triangleChallenge.challenge(3, 4, 5));
    }

}
