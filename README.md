
<p align="center"><img src="https://raw.githubusercontent.com/harjot-oberai/MaterialShadows/master/screens/cover.png" width="600" height="300" /></p>

<p align="center">
  <a href="https://www.npmjs.com/package/react-native-material-shadows"><img src="http://img.shields.io/npm/v/react-native-material-shadows.svg?style=flat" /></a>
  <a href="https://github.com/prscX/react-native-material-shadows/pulls"><img alt="PRs Welcome" src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg" /></a>
  <a href="https://github.com/prscX/react-native-material-shadows#License"><img src="https://img.shields.io/npm/l/react-native-material-shadows.svg?style=flat" /></a>
</p>


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

| [awesome-react-native-native-modules](https://github.com/prscX/awesome-react-native-native-modules)              |
| ----------------- |
| <img src="https://github.com/prscX/awesome-react-native-native-modules/raw/master/assets/hero.png" width="600" height="300" />                  |


| [react-native-spruce](https://github.com/prscX/react-native-spruce)              |
| ----------------- |
| <img src="https://github.com/willowtreeapps/spruce-ios/raw/master/imgs/extensibility-tests.gif" width="600" height="300" />                  |


| [react-native-taptargetview](https://github.com/prscX/react-native-taptargetview) & [react-native-material-showcase-ios](https://github.com/prscX/react-native-material-showcase-ios)              |
| ----------------- |
| <img src="https://github.com/KeepSafe/TapTargetView/raw/master/.github/video.gif" width="600" height="600" />  |


| [react-native-bottom-action-sheet](https://github.com/prscX/react-native-bottom-action-sheet)              |
| ----------------- |
| <img src="https://github.com/rubensousa/BottomSheetBuilder/raw/master/screens/normal_demo.gif" width="600" height="600" />                  |


| [react-native-popover-menu](https://github.com/prscX/react-native-popover-menu)             |
| ----------------- |
| <img src="https://github.com/zawadz88/MaterialPopupMenu/raw/master/art/components_menus.png" width="600" height="300" />                  |


| [react-native-tooltips](https://github.com/prscX/react-native-tooltips)             |
| ----------------- |
| <img src="https://camo.githubusercontent.com/add1764d27026b81adb117e07a10781c9abbde1b/687474703a2f2f692e696d6775722e636f6d2f4f4e383257526c2e676966" width="600" height="300" />                  |


| [react-native-shine-button](https://github.com/prscX/react-native-shine-button)             |
| ----------------- |
| <img src="https://raw.githubusercontent.com/ChadCSong/ShineButton/master/demo_shine_others.gif" width="600" height="300" />                  |


| [react-native-iconic](https://github.com/prscX/react-native-iconic)             |
| ----------------- |
| <img src="https://camo.githubusercontent.com/b18993cbfe91de8abdc0019dc9a6cd44707eec21/68747470733a2f2f6431337961637572716a676172612e636c6f756466726f6e742e6e65742f75736572732f3338313133332f73637265656e73686f74732f313639363538302f766266706f70666c6174627574746f6e332e676966" width="600" height="300" />                  |


| [react-native-download-button](https://github.com/prscX/react-native-download-button)             |
| ----------------- |
| <img src="https://github.com/fenjuly/ArrowDownloadButton/raw/master/screenshots/arrowdownloadbutton.gif" width="600" height="600" />                  |


| [react-native-siri-wave-view](https://github.com/prscX/react-native-siri-wave-view)             |
| ----------------- |
| <img src="https://cdn.dribbble.com/users/341264/screenshots/2203511/wave.gif" width="600" height="300" />                  |



|  [react-native-gradient-blur-view](https://github.com/prscX/react-native-gradient-blur-view)             |
| ----------------- |
| <img src="https://github.com/prscX/react-native-gradient-blur-view/raw/master/assets/hero.png" width="600" height="300" />                  |


|  [react-native-about-libraries](https://github.com/prscX/react-native-about-libraries)             |
| ----------------- |
| <img src="https://github.com/prscX/react-native-about-libraries/raw/master/hero.png" width="600" height="600" />                  |



|  [vs-essential-plugins](https://github.com/prscX/vs-essential-plugins)             |
| ----------------- |
| <img src="https://pbs.twimg.com/profile_images/922911523328081920/jEKFRPKV_400x400.jpg" width="600" height="300" />                  |


|  [prettier-pack](https://github.com/prscX/prettier-pack)             |
| ----------------- |
| <img src="https://raw.githubusercontent.com/prettier/prettier-logo/master/images/prettier-banner-light.png" width="600" height="300" />                  |


