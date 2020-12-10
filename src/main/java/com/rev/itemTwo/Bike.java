package com.rev.itemTwo;

public class Bike {

  private String bikeType;
  private String bodyStyle;
  private String saddleType;
  private String headset;
  private String groupset;
  private String brakes;
  private boolean nightLights;
  private int tires;

  private Bike(BikeBuilder bikeBuilder) {
    this.bikeType = bikeBuilder.bikeType;
    this.bodyStyle = bikeBuilder.bodyStyle;
    this.saddleType = bikeBuilder.saddleType;
    this.headset = bikeBuilder.headset;
    this.groupset = bikeBuilder.groupset;
    this.brakes = bikeBuilder.brakes;
    this.nightLights = bikeBuilder.nightLights;
    this.tires = bikeBuilder.tires;
  }

  public String getBikeType() {
      return bikeType;
  }


  public static class BikeBuilder {

      private String bikeType;
      private String bodyStyle;
      private String saddleType;
      private String headset;
      private String groupset;
      private String brakes;
      private boolean nightLights;
      private int tires;

      public BikeBuilder(String bikeType) {
        this.bikeType = bikeType;
      }

      public BikeBuilder bodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
        return this;
      }

      public BikeBuilder saddleType(String saddleType) {
        this.saddleType = saddleType;
        return this;
      }

      public BikeBuilder headset(String headset) {
        this.headset = headset;
        return this;
      }

      public BikeBuilder groupset(String groupset) {
        this.groupset = groupset;
        return this;
      }

      public BikeBuilder brakes(String brakes) {
        this.brakes = brakes;
        return this;
      }

      public BikeBuilder nightLights(boolean nightLights) {
        this.nightLights = nightLights;
        return this;
      }

      public BikeBuilder tires(int tires) {
        this.tires = tires;
        return this;
      }

      public Bike build(){
        return new Bike(this);
      }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("--------------" + bikeType + "--------------------- \\n");
    sb.append(" Body: ");
    sb.append(bodyStyle);
    sb.append("\\n Saddle Type: ");
    sb.append(saddleType);
    sb.append("\\n Headset: ");
    sb.append(headset);
    sb.append("\\n Groupset: ");
    sb.append(groupset);
    sb.append("\\n Brakes: ");
    sb.append(brakes);
    sb.append("\\n Nightlights: ");
    sb.append(nightLights);
    sb.append("\\n Number of Tires: ");
    sb.append(tires);

    return sb.toString();
  }
}
