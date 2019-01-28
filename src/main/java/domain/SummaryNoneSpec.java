package domain;

import java.util.List;
import java.util.stream.Stream;

/**
 * 集計なし
 */
public class SummaryNoneSpec implements ISummarySpec {
    @Override
    public Stream<Deal> fileter(List<Deal> records) {
        // 特になにもフィルターせずにStreamを返す
        return records.stream();
    }
}