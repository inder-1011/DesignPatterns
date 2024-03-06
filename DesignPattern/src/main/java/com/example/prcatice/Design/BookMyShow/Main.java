package com.example.prcatice.Design.BookMyShow;


import java.util.List;
import java.util.Map;

class Movie{
    int id;
    String name;
    int duration;
}

class Theatre{
    int id;
    String address;
    String city;
    List<Screen> screens;
    List<Shows> showsList;
}
class Screen{
    int id;
    List<Seat> seatList;
}

class Seat{
    int id;
    int price;
    Category category;

}
enum Category{
    SILVER,GOLD,PLATINUM
}

class Shows{
    int id;
    Movie movie;
    Screen screen;
    String startTime;
    List<Integer> bookedSeatId;
    String timings;
}

class City{

}
class TheatreController{
    Map<City,List<Theatre>> theatreMap;
}

class Booking{

}
public class Main {
}
