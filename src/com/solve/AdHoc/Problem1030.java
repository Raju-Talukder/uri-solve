package com.solve.AdHoc;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1030 {
    static FastScanner in = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int NC = in.nextInt(), n, k;
        for (int i = 1; i <= NC; i++) {
            n = in.nextInt();
            k = in.nextInt();
            out.println("Case " + i + ": " + (josephus(n, k) + 1));
        }
        in.close();
        out.close();
    }

    private static int josephus(int n, int k) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }

        return ans;
    }

    static class FastScanner implements Closeable {

        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = reader.readLine();
                if (line == null) {
                    return null;
                }
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        @Override
        public void close() throws IOException {
            tokenizer = null;
            reader.close();
        }
    }

}
