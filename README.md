
<h1 align="center">

<p align="center"><img src="https://raw.githubusercontent.com/harjot-oberai/MaterialShadows/master/screens/cover.png" width="600" height="300" /></p>

<p align="center">
  <a href="https://www.npmjs.com/package/react-native-material-shadows"><img src="http://img.shields.io/npm/v/react-native-material-shadows.svg?style=flat" /></a>
  <a href="https://github.com/prscX/react-native-material-shadows/pulls"><img alt="PRs Welcome" src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg" /></a>
  <a href="https://github.com/prscX/react-native-material-shadows#License"><img src="https://img.shields.io/npm/l/react-native-material-shadows.svg?style=flat" /></a>
</p>


    ReactNative: Native Material Shadows (Android): Deprecated

Due to time constraint, this library is deprecated and not maintained anymore, You can still use this library.

If this project has helped you out, please support us with a star 🌟
</h1>

This library is a thin React Native Bridge around [harjot-oberai/MaterialShadows](https://github.com/harjot-oberai/MaterialShadows) library. It seamlessly integrats with Material shadows. The library takes existing material shadows to next level by adding the following features :


- **Convex shadows**: The shadows are not only rectangular or circular, they can take any convex shape depending on the view and its content.
- **Support for shadow offsets**: The library allows developers to set <b>X</b> and <b>Y</b> offset for the shadows.
- **Support for shadow intensity**: The library also has support for setting shadow intensity via `shadowAlpha` attribute.
- **Shadows for semi-transparent views** : The library allows shadows for semi-transparent views.
- **Support for Async Shadow calculations** : The library allows the operations to be async to avoid blocking the UI thread for long calculations.
- **Shadow animations** : The library supports fade out animation for shadow.

> **Note**: It is available only on Andorid, since React Native supports Shadow for images on iOS platform

## 📖 Getting started

`$ npm install react-native-material-shadows --save`

`$ react-native link react-native-material-shadows`


## 💻 Usage
```javascript
import RNMaterialShadows from 'react-native-material-shadows';

<RNMaterialShadows style={styles.imageContainer} padding={30} >
	<Image source={require("./assets/google.png")} elevation={5} style={styles.image} />
</RNMaterialShadows>
```
  

## ✨ Credits

- Android: [harjot-oberai/MaterialShadows](https://github.com/harjot-oberai/MaterialShadows)

## 🤔 How to contribute
Have an idea? Found a bug? Please raise to [ISSUES](https://github.com/prscX/react-native-material-shadows/issues).
Contributions are welcome and are greatly appreciated! Every little bit helps, and credit will always be given.

## 💫 Where is this library used?
If you are using this library in one of your projects, add it in this list below. ✨


## 📜 License
This library is provided under the Apache License.

RNMaterialShadows @ [prscX](https://github.com/prscX)

## 💖 Support my projects
I open-source almost everything I can, and I try to reply everyone needing help using these projects. Obviously, this takes time. You can integrate and use these projects in your applications for free! You can even change the source code and redistribute (even resell it).

However, if you get some profit from this or just want to encourage me to continue creating stuff, there are few ways you can do it:
* Starring and sharing the projects you like 🚀
* If you're feeling especially charitable, please follow [prscX](https://github.com/prscX) on GitHub.

  <a href="https://www.buymeacoffee.com/prscX" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

  Thanks! ❤️
  <br/>
  [prscX.github.io](https://prscx.github.io)
  <br/>
  </ Pranav >
