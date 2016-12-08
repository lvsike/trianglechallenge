package com.example.service.impl;

import com.example.service.TriangleChallenge;

/**
 * Author: <a href="mailto:lsk2008@msn.com">lvsike</a>
 * Date: 16-12-8 上午8:25
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
        } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            return "It is a isosceles triangle";
        } else {
            return "It is a scalene triangle";
        }
    }
}
