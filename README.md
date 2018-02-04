
# react-native-material-shadows

## Getting started

`$ npm install react-native-material-shadows --save`

### Mostly automatic installation

`$ react-native link react-native-material-shadows`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-material-shadows` and add `RNMaterialShadows.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMaterialShadows.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNMaterialShadowsPackage;` to the imports at the top of the file
  - Add `new RNMaterialShadowsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-material-shadows'
  	project(':react-native-material-shadows').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-material-shadows/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-material-shadows')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNMaterialShadows.sln` in `node_modules/react-native-material-shadows/windows/RNMaterialShadows.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Material.Shadows.RNMaterialShadows;` to the usings at the top of the file
  - Add `new RNMaterialShadowsPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNMaterialShadows from 'react-native-material-shadows';

// TODO: What to do with the module?
RNMaterialShadows;
```
  