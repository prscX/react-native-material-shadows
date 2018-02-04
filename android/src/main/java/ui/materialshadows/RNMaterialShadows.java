package ui.materialshadows;

import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.sdsmdg.harjot.materialshadows.MaterialShadowFrameLayoutWrapper;
import com.sdsmdg.harjot.materialshadows.MaterialShadowViewWrapper;
import com.sdsmdg.harjot.materialshadows.shadowutils.ShadowGenerator;


public class RNMaterialShadows extends ViewGroupManager<ViewGroup> {

    public static final String REACT_CLASS = "RNMaterialShadows";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected MaterialShadowFrameLayoutWrapper createViewInstance(final ThemedReactContext reactContext) {
        MaterialShadowFrameLayoutWrapper shadow = new MaterialShadowFrameLayoutWrapper(reactContext.getCurrentActivity());
        MaterialShadowViewWrapper shadowViewWrapper = new MaterialShadowViewWrapper(reactContext.getCurrentActivity());

        shadow.setClipToPadding(false);

        shadow.addView(shadowViewWrapper);
        return shadow;
    }

    @ReactProp(name = "padding")
    public void setPadding(MaterialShadowFrameLayoutWrapper shadowFrame, int padding) {
        shadowFrame.setPadding(padding, padding, padding, padding);
    }

//    @ReactProp(name = "shadowColor")
//    public void setShadowColor(MaterialShadowFrameLayoutWrapper shadowFrame, String shadowColor) {
//        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
//        shadowFrame.setBackgroundColor(Color.parseColor(shadowColor));
//    }


    @ReactProp(name = "shadowOffsetX")
    public void setShadowOffsetX(MaterialShadowFrameLayoutWrapper shadowFrame, float shadowOffsetX) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setOffsetX(shadowOffsetX);
    }

    @ReactProp(name = "shadowOffsetY")
    public void setShadowOffsetY(MaterialShadowFrameLayoutWrapper shadowFrame, float shadowOffsetY) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setOffsetY(shadowOffsetY);
    }

    @ReactProp(name = "shadowAlpha")
    public void setShadowAlpha(MaterialShadowFrameLayoutWrapper shadowFrame, float shadowAlpha) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setShadowAlpha(shadowAlpha);
    }

    @ReactProp(name = "calculateAsync")
    public void setCalculateAsync(MaterialShadowFrameLayoutWrapper shadowFrame, boolean calculateAsync) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setShouldCalculateAsync(calculateAsync);
    }

    @ReactProp(name = "showWhenAllReady")
    public void setShowWhenAllReady(MaterialShadowFrameLayoutWrapper shadowFrame, boolean showWhenAllReady) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setShowShadowsWhenAllReady(showWhenAllReady);
    }

    @ReactProp(name = "animateShadow")
    public void setAnimateShadow(MaterialShadowFrameLayoutWrapper shadowFrame, boolean animateShadow) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setShouldAnimateShadow(animateShadow);
    }

    @ReactProp(name = "animationDuration")
    public void setAnimationDuration(MaterialShadowFrameLayoutWrapper shadowFrame, int animationDuration) {
        MaterialShadowViewWrapper shadowViewWrapper = (MaterialShadowViewWrapper) shadowFrame.getChildAt(0);
        shadowViewWrapper.setAnimationDuration(animationDuration);
    }
}
