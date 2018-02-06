
<div align="center"><img src="https://raw.githubusercontent.com/harjot-oberai/MaterialShadows/master/screens/cover.png"/></div>


# React Native: Material Shadows - Android

This library is a thin React Native Bridge around [harjot-oberai/MaterialShadows](https://github.com/harjot-oberai/MaterialShadows) library. It seamlessly integrats with Material shadows. The library takes existing material shadows to next level by adding the following features :


- **Convex shadows**: The shadows are not only rectangular or circular, they can take any convex shape depending on the view and its content.
- **Support for shadow offsets**: The library allows developers to set <b>X</b> and <b>Y</b> offset for the shadows.
- **Support for shadow intensity**: The library also has support for setting shadow intensity via `shadowAlpha` attribute.
- **Shadows for semi-transparent views** : The library allows shadows for semi-transparent views.
- **Support for Async Shadow calculations** : The library allows the operations to be async to avoid blocking the UI thread for long calculations.
- **Shadow animations** : The library supports fade out animation for shadow.

Before we dive into on how to use this library. We would like to thank all the contributor of [harjot-oberai/MaterialShadows](https://github.com/harjot-oberai/MaterialShadows) for providing such a awesome nice, cool library

> **Note**: It is available only on Andorid, since React Native supports Shadow for images on iOS platform

## Getting started

`$ npm install react-native-material-shadows --save`

`$ react-native link react-native-material-shadows`


## Usage
```javascript
import RNMaterialShadows from 'react-native-material-shadows';

<RNMaterialShadows style={styles.imageContainer} padding={30} >
	<Image source={require("./assets/google.png")} elevation={5} style={styles.image} />
</RNMaterialShadows>
```
  
## Credits
- Android: [harjot-oberai/MaterialShadows](https://github.com/harjot-oberai/MaterialShadows)

## Contribution
Contributions are welcome and are greatly appreciated! Every little bit helps, and credit will always be given.

## License
This library is provided under the MIT License.

RNMaterialShadows @ Pranav Raj Singh Chauhan


## Other Contributions
- React Native - Spruce: [react-native-spruce](https://github.com/prscX/react-native-spruce)

![Screenshots](https://github.com/willowtreeapps/spruce-ios/raw/master/imgs/extensibility-tests.gif)

- React Native - App Tour Library: [react-native-taptargetview](https://github.com/prscX/react-native-taptargetview) & [react-native-material-showcase-ios](https://github.com/prscX/react-native-material-showcase-ios)

![Screenshots](https://github.com/KeepSafe/TapTargetView/raw/master/.github/video.gif)
![Screenshots](https://github.com/aromajoin/material-showcase-ios/raw/master/art/material-showcase.gif?raw=true)

- React Native - Bottom Action Sheet: [react-native-bottom-action-sheet](https://github.com/prscX/react-native-bottom-action-sheet)

![](https://github.com/rubensousa/BottomSheetBuilder/raw/master/screens/normal_demo.gif)

- React Native - Popover: [react-native-popover-menu](https://github.com/prscX/react-native-popover-menu)

![](https://github.com/zawadz88/MaterialPopupMenu/raw/master/art/components_menus.png)

- React Native - Shine Button: [react-native-shine-button](https://github.com/prscX/react-native-shine-button)

![Screenshots](https://raw.githubusercontent.com/ChadCSong/ShineButton/master/demo_shine_others.gif)

- React Native Iconic: [react-native-iconic](https://github.com/prscX/react-native-iconic)
![Screenshots](https://camo.githubusercontent.com/b18993cbfe91de8abdc0019dc9a6cd44707eec21/68747470733a2f2f6431337961637572716a676172612e636c6f756466726f6e742e6e65742f75736572732f3338313133332f73637265656e73686f74732f313639363538302f766266706f70666c6174627574746f6e332e676966)

- React Native Download Button: [react-native-download-button](https://github.com/prscX/react-native-download-button)

![](https://github.com/fenjuly/ArrowDownloadButton/raw/master/screenshots/arrowdownloadbutton.gif)

- React Native Siri Wave View: [react-native-siri-wave-view](https://github.com/prscX/react-native-siri-wave-view)

![](https://cdn.dribbble.com/users/341264/screenshots/2203511/wave.gif)

- Visual Code Essential Plugins: [vs-essential-plugins](https://github.com/prscX/vs-essential-plugins)

![Screenshots](https://pbs.twimg.com/profile_images/922911523328081920/jEKFRPKV_400x400.jpg)

- Prettier Pack: [prettier-pack](https://github.com/prscX/prettier-pack)

![Screenshots](https://raw.githubusercontent.com/prettier/prettier-logo/master/images/prettier-banner-light.png)

