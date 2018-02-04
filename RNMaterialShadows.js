import React, { Component } from "react";
import { StyleSheet, ViewPropTypes, Platform } from "react-native";
import PropTypes from "prop-types";

import { requireNativeComponent } from "react-native";

class RNMaterialShadows extends Component {
    render () {
        return <MaterialShadows
            shadowOffsetX={this.props.shadowOffsetX} 
            shadowOffsetY={this.props.shadowOffsetY}
            shadowAlpha={this.props.shadowAlpha}
            calculateAsync={this.props.calculateAsync}
            showWhenAllReady={this.props.showWhenAllReady}
            animateShadow={this.props.animateShadow}
            animationDuration={this.props.animationDuration}
            padding={this.props.padding}
            style={this.props.style}
          >
            {this.props.children}
          </MaterialShadows>;
    }
}


RNMaterialShadows.propTypes = {
  ...ViewPropTypes,

  shadowOffsetX: PropTypes.number,
  shadowOffsetY: PropTypes.number,
  shadowAlpha: PropTypes.number,
  calculateAsync: PropTypes.bool,
  showWhenAllReady: PropTypes.bool,
  animateShadow: PropTypes.bool,
  animationDuration: PropTypes.number,
  padding: PropTypes.number
};


RNMaterialShadows.defaultProps = {
  shadowOffsetX: -15,
  shadowOffsetY: 30,
  shadowAlpha: 20,
  calculateAsync: true,
  showWhenAllReady: true,
  animateShadow: true,
  animationDuration: 300,
  padding: 20
};

const MaterialShadows = requireNativeComponent(
  "RNMaterialShadows",
  RNMaterialShadows,
  {
    nativeOnly: { }
  }
);

export default RNMaterialShadows;