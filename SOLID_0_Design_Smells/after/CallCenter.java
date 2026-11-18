package after;

import java.util.ArrayDeque;
import java.util.Queue;

public class CallCenter implements RequestSource {
    private final Queue<RideRequest> calls = new ArrayDeque<>();

    public void takeCall(String caller, String address) {
        calls.add(new RideRequest(caller, address));
    }

    @Override
    public RideRequest next() {
        return calls.poll();
    }
}
