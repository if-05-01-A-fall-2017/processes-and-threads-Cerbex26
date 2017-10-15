/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htlleonding.fibonacci;

/**
 *
 * @author Manuel
 */
public class MyRunnable implements Runnable {

    private int val = 0;
    private int n = 0;

    public MyRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        val = Fibonacci.getNumberSingle(n);
    }
    
    public int getVal() {
        return val;
    }
}
