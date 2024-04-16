package ladder.domain;

import java.util.Iterator;
import java.util.List;

public class Participants implements Iterable<String> {
    private final List<String> participants;

    public Participants(List<String> participants) {
        this.participants = participants;
    }

    public int getParticipantsCount() {
        return participants.size();
    }

    @Override
    public Iterator<String> iterator() {
        return participants.iterator();
    }
}
