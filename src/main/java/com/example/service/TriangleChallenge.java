package com.example.service;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 8:26
 */
public interface TriangleChallenge {
    /**
     * determine the type of a triangle
     *
     * @param a     length of the triangle's first side
     * @param b     length of the triangle's second side
     * @param c     length of the triangle's third side
     * @return the type of the triangle
     */
    String challenge(int a, int b, int c);
}
