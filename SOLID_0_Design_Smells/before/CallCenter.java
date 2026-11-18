package before;

import java.util.ArrayDeque;
import java.util.Queue;

public class CallCenter {
    private static final Queue<RideRequest> requests = new ArrayDeque<>();

    public static void add(RideRequest request) {
        requests.add(request);
    }

    public static RideRequest next() {
        return requests.poll();
    }
}
