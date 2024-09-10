import java.util.*;

public class Sharding {

        private static final int NUM_SHARDS = 3;

        public static void main(String[] args) {
                // Create a list of data
                List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                // Shard the data
                Map<Integer, List<Integer>> shards = new HashMap<>();
                for (int i = 0; i < NUM_SHARDS; i++) {
                        shards.put(i, new ArrayList<>());
                }
                for (int value : data) {
                        int shardId = value % NUM_SHARDS;
                        shards.get(shardId).add(value);
                }

                // Print the shards
                for (int shardId = 0; shardId < NUM_SHARDS; shardId++) {
                        System.out.println("Shard " + shardId + ": " + shards.get(shardId));
                }
        }
}
