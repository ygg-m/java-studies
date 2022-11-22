public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("First: TV Turned On? " + smartTv.isTurnOn);
        System.out.println("First: Channel:  " + smartTv.channel);
        System.out.println("First: Volume: " + smartTv.volume);
        
        smartTv.turnOnOff();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.setChannel(5);


        System.out.println("Second: TV Turned On? " + smartTv.isTurnOn);
        System.out.println("Second: Channel:  " + smartTv.channel);
        System.out.println("Second: Volume: " + smartTv.volume);
        

    }
}
