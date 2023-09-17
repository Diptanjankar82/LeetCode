// space complexity - O(2^n * n)
// time complexity - O(2^n * n^2)

class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        Queue<int[]> q = new LinkedList<>();
        List<Set<Integer>> dp = new ArrayList<>();
        
        // of sets to keep track of visited nodes
        for (int i = 0; i < n; i++)
            dp.add(new HashSet<>());
        
        int minPath = Integer.MAX_VALUE; //minimum path length to a maximum value
        int targetBitMask = (int) Math.pow(2, n) - 1; // Create a bitmask set to 1 
        // Initialize the queue with starting nodes and  bitmasks
        for (int i = 0; i < n; i++) {
            int bitMask = 1 << i; // Set the bit  to the current node
            q.add(new int[]{i, bitMask, 0}); 
            dp.get(i).add(bitMask); // Mark the current node as visited
        }
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int src = cur[0]; // Current source node
            int bitMask = cur[1]; // Current bitmask representing visited nodes
            int curPathLength = cur[2]; // Current path length
            
            if (bitMask == targetBitMask)
                minPath = Math.min(minPath, curPathLength); // Update the minimum path length 
            
            // Iterate through the  of the current node
            for (int dest : graph[src]) {
                int newBitMask = bitMask | (1 << dest); // Set the bit to the destination node
                
 
                if (!dp.get(dest).contains(newBitMask)) {
                    q.add(new int[]{dest, newBitMask, curPathLength + 1}); // Add the destination node to the queue
                    dp.get(dest).add(newBitMask); // Mark it as visited
                }
            }
        }
        
        return minPath; // Return the minimum path length
    }
}
