package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {

  private String city;
  private double longitude;
  private double latitude;

  public Location(String city, double longitude, double latitude) {
    this.city = city;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }
}

class LocationManager {

  private Scanner scanner = new Scanner(System.in);
  private HashMap<String, Location> locationList = new HashMap<>();

  public void insertLocation() {
    System.out.println("도시 , 위도, 경도를 입력하시오.");
    for (int i = 0; i < 4; i++) {
      System.out.print(">>");
      String str = scanner.nextLine();
      StringTokenizer strToken = new StringTokenizer(str, ",");
      String city = strToken.nextToken().trim();
      double longitude = Double.parseDouble(strToken.nextToken().trim());
      double latitude = Double.parseDouble(strToken.nextToken().trim());
      Location location = new Location(city, longitude, latitude);
      locationList.put(city, location);
    }
  }

  public void showAll() {
    Set<String> keySet = locationList.keySet();
    Iterator<String> it = keySet.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
      String city = it.next();
      Location location = locationList.get(city);
      System.out.println(location.getCity() + "\t");
      System.out.println(location.getLongitude() + "\t");
      System.out.println(location.getLatitude() + "\t");
    }
  }

  public void showInfo() {
    while (true) {
      System.out.println("도시 이름 >>");
      String city = scanner.nextLine();
      if (city.equals("그만")) break;
      Location location = locationList.get(city);
      if (location == null) {
        System.out.println("해당하는 도시가 없습니다.");
      } else {
        System.out.println(location.getCity() + "\t");
        System.out.println(location.getLongitude() + "\t");
        System.out.println(location.getLatitude() + "\t");
      }
    }
  }
}

public class Practice06 {

  public static void main(String[] args) {
    LocationManager lm = new LocationManager();
    lm.insertLocation();
    lm.showAll();
    lm.showInfo();
  }
}
