class Solution {
    public int minCostConnectPoints(int[][] points) {
    
        int[] dist = new int[points.length]; // main distance 
        Arrays.fill(dist, Integer.MAX_VALUE);
        int ans = 0;

        for (int i = 0; i < points.length - 1; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
               
                dist[j] = Math.min(dist[j], Math.abs(points[i][0] - points[j][0]) + 
                Math.abs(points[i][1] - points[j][1]));
                //here i swap 
                if (dist[j] < dist[i + 1]) {
                    final int[] tempPoint = points[j];
                    points[j] = points[i + 1];
                    points[i + 1] = tempPoint;

                    //Swap distances.
                    final int tempDist = dist[j];
                    dist[j] = dist[i + 1];
                    dist[i + 1] = tempDist;
                }
            }
            //minimum distance to the total cost.
            ans += dist[i + 1];
        }
        return ans; // minimum cost 
    }
}