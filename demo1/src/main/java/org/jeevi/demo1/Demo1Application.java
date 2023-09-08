package org.jeevi.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class Demo1Application {

    public static void main(String []args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        //设置周一是第一天
        calendar.setTime(new Date());
        calendar.setFirstDayOfWeek(Calendar.MONDAY);

        int curHour24 = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(curHour24);
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(week);
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate1 = dateFormat1.parse("2023-04-17");
        calendar.setTime(myDate1);
        week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(week);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate2 = dateFormat2.parse("2023-04-16");
        calendar.setTime(myDate2);
        week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(week);

        System.out.println(calendar.getFirstDayOfWeek());

        curHour24 = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(curHour24);

        System.out.println(Demo1Application.class.getClassLoader().toString());

//        String score = "0.7322323234332323232332";
//        System.out.println(Float.parseFloat(score));
//        SpringApplication.run(Demo1Application.class, args);
    }
}
