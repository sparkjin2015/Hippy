package com.tencent.mtt.hippy.views.wormhole;

import android.view.ViewGroup;
import com.tencent.mtt.hippy.common.HippyMap;

public interface HippyWormholeProxy {
    String createWormhole(HippyMap initProps, ViewGroup parent);
}
