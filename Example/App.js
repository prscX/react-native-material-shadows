/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image
} from 'react-native';

import RNMaterialShadows from 'react-native-material-shadows'

export default class App extends Component<{}> {
  render() {
    return <View style={styles.container}>
        <RNMaterialShadows style={styles.imageContainer} padding={30} >
          <Image source={require("./assets/google.png")} elevation={5} style={styles.image} />
        </RNMaterialShadows>
        <RNMaterialShadows style={styles.imageContainer} padding={30} >
          <Image source={require("./assets/google_play.png")} elevation={5} style={styles.image} />
        </RNMaterialShadows>
        <RNMaterialShadows style={styles.imageContainer} padding={30} >
          <Image source={require("./assets/poly.png")} elevation={5} style={styles.image} />
        </RNMaterialShadows>
        <RNMaterialShadows style={styles.imageContainer} padding={30} >
          <Image source={require("./assets/facebook.png")} elevation={5} style={styles.image} />
        </RNMaterialShadows>
      </View>;
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: "row",
    justifyContent: "space-around",
    alignItems: "center",
    backgroundColor: "#F5FCFF"
  },
  imageContainer: {
    width: 150,
    height: 150
  },
  image: {
    
  }
});
