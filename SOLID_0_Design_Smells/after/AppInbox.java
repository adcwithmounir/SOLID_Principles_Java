package after;

import java.util.ArrayDeque;
import java.util.Queue;

public class AppInbox implements RequestSource {
    private final Queue<RideRequest> requests = new ArrayDeque<>();

    public void add(RideRequest request) {
        requests.add(request);
    }

    @Override
    public RideRequest next() {
        return requests.poll();
    }
}
