
package ui.materialshadows;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNMaterialShadowsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNMaterialShadowsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMaterialShadows";
  }
}