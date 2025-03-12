package api;

import java.util.Map;

public interface ItemCompositionProvider {
    int getId();
    String getName();
    int getWearPos1();
    int getWearPos2();
    int getWeight();
    Map<Integer, Object> getParams();
}
