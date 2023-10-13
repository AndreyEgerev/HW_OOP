package HW_OOP_Seminar3;

import java.util.Comparator;

public class StreamComparator implements Comparator<TrainingStream> {

    @Override
    public int compare(TrainingStream stream1, TrainingStream stream2) {
        return Integer.compare(stream1.getGroups().size(), stream2.getGroups().size());
    }
}
