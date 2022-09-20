public class Lab03 {
        public static void main(String[] args){

            System.out.println("\nLab03, 100 Point Version\n");

            int mseconds = 1341345931;
            int hours;
            hours = mseconds / 3600000;
            int left1;
            left1 = mseconds % 3600000;
            int minutes;
            minutes = left1 / 60000;
            int left2;
            left2 = left1 % 60000;
            int seconds;
            seconds = left2 / 1000;
            int msleft;
            msleft = left2 % 1000;

            System.out.println("Starting milli-seconds:   " + mseconds);
            System.out.println("Hours:                    " + hours);
            System.out.println("Minutes:                  " + minutes);
            System.out.println("Seconds:                  " + seconds);
            System.out.println("Milliseconds:             " + msleft);

    }

}
