package TimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;
            //anonymous inner class
            @Override
            public void run() {
                if(counter>0) {
                    System.out.println(counter+ " seconds");
                    counter--;
                }else {
                    System.out.println("Task is complete");
                    timer.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH, 12);
        date.set(Calendar.HOUR_OF_DAY, 19);
        date.set(Calendar.MINUTE, 5);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);


//        timer.schedule(task, 3000);
//        timer.schedule(task, date.getTime());
//        timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);


    }
}
