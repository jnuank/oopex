package domain;

import java.util.List;
import java.util.stream.Stream;

interface ISummarySpec{
    /**
     *
     * @param records : 集計対象
     * @return 集計した取引のリスト
     */
    Stream<Deal> fileter(List<Deal> records);
}