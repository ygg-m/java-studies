public class SmartTv {
    boolean isTurnOn = false;
    int volume = 0;
    int channel = 0;

    public void turnOnOff() { isTurnOn = !isTurnOn; }

    public void raiseVolume() { volume++; }
    public void lowerVolume() { volume--; }

    public void raiseChannel() { channel++; }
    public void lowerChannel() { channel--; }
    public void setChannel(int number) { channel = number; }


}
