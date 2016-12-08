package com.example.service.impl;

import com.example.service.TriangleChallenge;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-7 21:11
 */
public class TriangleChallengeImpl implements TriangleChallenge {
    @Override
    public String challenge(int a, int b, int c) {
        //Find the two short sides by bubble algorithm
        if (a > b) {
            int x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            int x = b;
            b = c;
            c = x;
        }
        //To judge whether the three sides can form a triangle
        if (a + b <= c) return "It is not a triangle";

        if (a == b && b == c) {
            return "It is a equilateral triangle";
        } else if (a == b || a == c || b == c) {
            return "It is a isosceles triangle";
        } else {
            return "It is a scalene triangle";
        }
    }
}
