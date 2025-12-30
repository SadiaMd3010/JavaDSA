package InterviewPrep.Arrays;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String str = "terree";
        int hash[] = new int[26];

        // Step 1: Count frequencies
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }

        // Step 2: Store in list of Pair
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                list.add(new Pair(hash[i], (char) (i + 'a')));
            }
        }

        // Step 3: Sort by frequency (descending), then by character (optional)
        Collections.sort(list, (a, b) -> {
            if (b.freq != a.freq) return b.freq - a.freq;
            return a.c - b.c; // tie-breaker: alphabetical order
        });

        // Step 4: Choose k-th frequent character
        int k = 2; // Example: 2nd most frequent
        if (k <= list.size()) {
            Pair result = list.get(k - 1);
            System.out.println(k + "th most frequent character: " + result.c + " (freq=" + result.freq + ")");
        } else {
            System.out.println("Not enough distinct characters in string.");
        }
    }
}

class Pair {
    int freq;
    char c;
    Pair(int freq, char c) {
        this.freq = freq;
        this.c = c;
    }
}
