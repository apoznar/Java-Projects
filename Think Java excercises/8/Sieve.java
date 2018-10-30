/**
 * The Sieve class implements an application that 
 * is a simple, ancient algorithm for finding all 
 * prime number up to any given limit.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18 
 */
class Sieve { 
    /** 
     * This main method sets n number, and prints the output
     * of invoked sieve method.
     */
    public static void main(String args[]) { 
        int n = 30; 
        System.out.print("Following are the prime numbers "); 
        System.out.println("smaller than or equal to " + n); 
        Sieve g = new Sieve(); 
        g.sieve(n); 
    } 
    /** 
     * Creates a boolean array "prime[0..n]" and initialize 
     * all entries it as true. A value in prime[i] will 
     * finally be false if i is Not a prime, else true. 
     */
    void sieve(int n) { 
        boolean prime[] = new boolean[n+1]; 
        for(int i = 0; i < n; i++) 
            prime[i] = true;    
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
        
        // Prints all prime numbers 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
} 
