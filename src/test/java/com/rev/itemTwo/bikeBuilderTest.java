package com.rev.itemTwo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class bikeBuilderTest {

  public static final String ROAD_BIKE = "Road Bike";
  public static final String MOUNTAIN_BIKE = "Mountain Bike";
  /** Item 2. Page 13. Consider a builder when faced with many constructor parameters. */
  @Test
  public void builderPatternExample() {
    Bike mountainBike =
        new Bike.BikeBuilder(MOUNTAIN_BIKE)
            .bodyStyle("Carbon Frame")
            .saddleType("Performance")
            .headset("Shimano")
            .groupset("Shimano")
            .brakes("Shimano")
            .nightLights(true)
            .tires(2)
            .build();
    Bike roadBike =
        new Bike.BikeBuilder(ROAD_BIKE)
            .bodyStyle("Aluminum Frame")
            .saddleType("Performance")
            .headset("Specialized")
            .groupset("Specialized")
            .brakes("Specialized")
            .nightLights(false)
            .tires(2)
            .build();

    assertThat(mountainBike.getBikeType()).isEqualTo(MOUNTAIN_BIKE);
    assertThat(roadBike.getBikeType()).isEqualTo(ROAD_BIKE);
  }
}
