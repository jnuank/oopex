package domain;

import java.util.List;
import java.util.stream.Stream;

public class SummaryNone implements ISummarySpec {
    @Override
    public Stream<Deal> fileter(List<Deal> records) {
        return records.stream();
    }
}