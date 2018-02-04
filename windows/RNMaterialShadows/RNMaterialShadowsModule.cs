using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Material.Shadows.RNMaterialShadows
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNMaterialShadowsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNMaterialShadowsModule"/>.
        /// </summary>
        internal RNMaterialShadowsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNMaterialShadows";
            }
        }
    }
}
