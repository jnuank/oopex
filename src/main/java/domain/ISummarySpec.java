package domain;

import java.util.List;
import java.util.stream.Stream;

interface ISummarySpec{
    Stream<Deal> fileter(List<Deal> records);
}